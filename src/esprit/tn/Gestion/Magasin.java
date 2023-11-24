package esprit.tn.Gestion;

import esprit.tn.Entite.Produit;
import esprit.tn.GestionEmploye.Employe;
import esprit.tn.GestionEmploye.Responsable;
import esprit.tn.GestionEmploye.Vendeur;

public class Magasin {

	private int id;
	private String adresse;

	private final int CAPACITE = 2;
	private final int CAPACITE_EMPLOYES = 50;

	private Produit[] tabprod = new Produit[CAPACITE];

	private Employe[] employes = new Employe[CAPACITE_EMPLOYES];

	private int comp;
	private int compEmployes;

	private static int totalProduit;

	public Magasin() {
	}

	public Magasin(int id, String ad) {
		this.id = id;
		adresse = ad;
	}

	public void ajouter(Produit p) throws MagasinPleinException, PrixNegatifException {
		if (p.getPrix() < 0) {
			throw new PrixNegatifException("Le prix du produit ne peut pas être négatif.");
		}

		if (comp < CAPACITE) {
			if (!chercher(p)) {
				tabprod[comp] = p;
				comp++;
				System.out.println("Produit ajouté");
				totalProduit++;
			} else {
				System.out.println("Le produit existe déjà");
			}
		} else {
			throw new MagasinPleinException("Le magasin est plein. Impossible d'ajouter le produit.");
		}
	}

	public static int getTotalProduit() {

		return totalProduit;
	}

	public void afficherLibellePr() {
		for (int i = 0; i < comp; i++)
			System.out.println("marque :" + tabprod[i].getMarque());
	}

	public boolean chercher(Produit p) {
		for (int i = 0; i < comp; i++) {
			if (tabprod[i].comparer(p))
				return true;
		}
		return false;
	}

	public int chercherP(Produit p) {
		int indice = -1;
		for (int i = 0; i < comp; i++) {
			if (Produit.comparer(p, tabprod[i]))

				return i;
		}
		return indice;
	}

	public boolean supprimer(Produit p) {
		boolean test = false;
		int indice = chercherP(p);

		if (indice == -1)
			test = false;
		else {

			for (int i = indice; i < comp - 1; i++) {
				tabprod[i] = tabprod[i + 1];
				tabprod[i] = null;
			}
			comp--;
			totalProduit--;
			test = true;
		}
		return test;
	}

	public Magasin plusProduit(Magasin m) {
		if (this.comp > m.comp)
			return this;

		else if (this.comp < m.comp)
			return m;
		return null;
	}

	public String toString() {
		StringBuilder str = new StringBuilder("Informations du magasin :\n");
		str.append("ID : ").append(id).append("\n");
		str.append("Adresse : ").append(adresse).append("\n");
		str.append("Liste des produits :\n");

		if (comp > 0) {
			for (int i = 0; i < comp; i++) {
				str.append(tabprod[i]).append("\n");
			}
		} else {
			str.append("Aucun produit disponible.\n");
		}

		return str.toString();
	}

	public static Magasin plusProduit(Magasin m, Magasin m1) {
		if (m1.comp > m.comp)
			return m1;

		else if (m1.comp < m.comp)
			return m;
		return null;
	}

	public void ajouterEmploye(Employe employe) {
		if (compEmployes < CAPACITE_EMPLOYES) {
			employes[compEmployes] = employe;
			compEmployes++;
			System.out.println("Employé ajouté");
		} else {
			System.out.println("Limite d'employés atteinte");
		}
	}

	public void afficheSalaireEmployes() {
		for (int i = 0; i < compEmployes; i++) {
			Employe employe = employes[i];
			System.out.println("Employé: " + employe.getNom() + ", Salaire: " + employe.calculSalaire());
		}
	}

	public void affichePrimeResponsable() {
		for (int i = 0; i < compEmployes; i++) {
			if (employes[i] instanceof Responsable) {
				Responsable responsable = (Responsable) employes[i];
				System.out.println("Responsable: " + responsable.getNom() + ", Prime: " + responsable.calculPrime());
			}
		}
	}

	public void afficheNombreEmployesParType() {
		int countResponsable = 0;
		int countVendeur = 0;

		for (int i = 0; i < compEmployes; i++) {
			if (employes[i] instanceof Responsable) {
				countResponsable++;
			} else if (employes[i] instanceof Vendeur) {
				countVendeur++;
			}
		}

		System.out.println("Nombre de Responsables: " + countResponsable);
		System.out.println("Nombre de Vendeurs: " + countVendeur);
	}
}
