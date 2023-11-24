package Session_1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Produit p1 = new Produit();

		System.out.println("id :" + p1.identifiant);
		System.out.println("marque :" + p1.marque);

		System.out.println("libelle :" + p1.libelle);
		System.out.println("prix :" + p1.prix);

		Produit p2 = new Produit(1021, "Delice", "Lait");
		System.out.println("id :" + p2.identifiant);
		System.out.println("marque :" + p2.marque);

		System.out.println("libelle :" + p2.libelle);
		System.out.println("prix :" + p2.prix);

		Produit p3 = new Produit(2510, "Vitalait", "Yaourt");
		Produit p4 = new Produit(3250, "Sicam", "Tomate", 1.2f);

		p3.prix = 0.5f;
		System.out.println("test de la méthode affiche");
		p2.afficher();
		p4.afficher();
		System.out.println("to String p2");
		System.out.println(p2.toString());
		System.out.println(p2);
		System.out.println("to String p3");
		System.out.println(p3.toString());
		System.out.println(p3);

		Date d1 = new Date();

		p3.date_exp = d1;

		Produit p5 = new Produit(1, "Delice", "YAourt", d1);
		System.out.println("Après modification de date");
		p5.afficher();
		System.out.println(p5);
		System.out.println(p5.date_exp);

		System.out.println(p3);
		p2.affecterPrix(0.7f);
		Magasin m1 = new Magasin(6996, "Borj Louzir");
		System.out.println(m1);
		m1.ajouterProduit(p1);
		m1.ajouterProduit(p2);
		m1.ajouterProduit(p3);
		m1.ajouterProduit(p4);
		System.out.println(m1);
		Magasin m2 = new Magasin(9669, "Borj bacoouch");
		System.out.println(m2);
		m2.ajouterProduit(p1);
		m2.ajouterProduit(p2);
		m2.ajouterProduit(p3);
		m2.ajouterProduit(p4);
		System.out.println(m2);
		Magasin m3 = new Magasin(6969, "salah el mejri");
		System.out.println(m3);
		m3.ajouterProduit(p1);
		m3.ajouterProduit(p2);
		m3.ajouterProduit(p3);
		m3.ajouterProduit(p4);
		System.out.println(m3);
		System.out.println(
				"Total des Produits = " + (m1.getTotalProduits() + m2.getTotalProduits() + m3.getTotalProduits()));

		boolean bol = m1.compare(m3);
		if (bol == true) {
			System.out.println(m1.getIdentifiant() + " est plus que " + m3.getIdentifiant());
		} else {
			System.out.println(m3.getIdentifiant() + " est plus que " + m2.getIdentifiant());
		}

		boolean bol1 = m1.chercheProduit(p3);
		if (bol1 == true) {
			System.out.println("produit " + p3.getIdentifiant() + "existe");
		} else {
			System.out.println("produit " + p3.getIdentifiant() + "n'existe pas");
		}
		System.out.println("Total des Magasins = " + Magasin.compteur);
		System.out.println("Total des Produits = " + Produit.compteur);
	}
}
