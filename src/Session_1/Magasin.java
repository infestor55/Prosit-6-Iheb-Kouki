package Session_1;

import java.util.Arrays;
import java.util.Objects;

public class Magasin {
	int identifiant;
	String adresse;
	int capacite;
	static int compteur;
	Produit[] produits;

	public Magasin(int identifiant, String adresse) {
		this.identifiant = identifiant;
		this.adresse = adresse;
		this.produits = new Produit[50];
		compteur ++;
	}

	@Override
	public String toString() {
		String s = "";
		s += "identifiant : " + this.identifiant + " \n";
		s += "adresse : " + this.adresse + " \n";
		s += "capacite : " + this.capacite + " \n";
		String prods = "";
		for (int i = 0; i < this.capacite; i++) {
			prods += this.produits[i];
		}
		return s + prods;
	}

	public boolean ajouterProduit(Produit produit) {
		boolean bol = false;
		for (int i = 0; i < capacite; i++) {
			if (produits[i].compare(produit)) {
				this.produits[capacite] = produit;
				Produit.compteur++;
				this.capacite++;
				bol = true;
			}
			else
				bol = false;
		}
		return bol;
	}

	public int getTotalProduits() {
		return this.capacite;
	}

	public boolean chercheProduit(Produit produit) {
		boolean bol = false;
		for (int i = 0; i < capacite; i++) {
			if (produits[i].compare(produit))
				bol = true;
			else
				bol = false;
		}
		return bol;
	}
	
	public boolean supprimerProduit(Produit produit) {
		boolean bol = false;
		for (int i = 0; i < capacite; i++) {
			if (produits[i].compare(produit)) {
				produits[i] = null;
				capacite --;
				bol = true;
			}
			else
				bol = false;
		}
		return bol;
	}

	public boolean compare(Magasin obj) {
		return capacite == obj.capacite;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}
	
}
