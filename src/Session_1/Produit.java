package Session_1;

import java.util.Date;
import java.util.Objects;

public class Produit {

	int identifiant;
	String libelle, marque;
	float prix;
	static int compteur;

	Date date_exp;

	public Produit(int id, String marque, String lib) {
		identifiant = id;
		this.marque = marque;
		libelle = lib;
		compteur ++;
	}

	public Produit(int id, String marque, String lib, Date d) {
		identifiant = id;
		this.marque = marque;
		libelle = lib;
		date_exp = d;
		compteur ++;
	}

	public Produit() {
	}

	public Produit(int id, String m, String lib, float p) {
		this.identifiant = id;
		this.marque = m;
		this.libelle = lib;
		this.prix = p;

	}

	public Produit(int id, String ma) {
		this.identifiant = id;
		this.marque = ma;
	}

	public Produit(String lib, int id) {
		this.identifiant = id;
		this.libelle = lib;
	}

	public void afficher() {
		System.out.println("id :" + this.identifiant);
		System.out.println("libelle :" + this.libelle);
		System.out.println("marque :" + marque);
		System.out.println("prix :" + prix);
		System.out.println("Date exp :" + date_exp);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Date getDate_exp() {
		return date_exp;
	}

	public void setDate_exp(Date date_exp) {
		this.date_exp = date_exp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_exp, identifiant, libelle, marque, prix);
	}

	public boolean compare(Produit p) {
		if (this.identifiant == p.identifiant && this.prix == p.prix && this.marque == p.marque)
			return true;
		else
			return false;
	}

	public boolean comparer(Produit p1, Produit p2) {
		if (p1.identifiant == p2.identifiant && p1.prix == p2.prix)
			return true;
		else
			return false;
	}

	public String toString() {
		return "identifiant :" + identifiant + " marque :" + marque + " Libelle :" + libelle + " prix :" + prix
				+ " Date exp :" + date_exp;
	}

	public Produit affecterPrix(float p) {
		prix = p;
		return this;
	}
}
