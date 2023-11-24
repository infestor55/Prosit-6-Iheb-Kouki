package esprit.tn.Entite;

import java.util.Date;
public class Produit {

  private   int identifiant;
  private   String libelle,marque;
   private float prix;

   private Date date_exp;
    public Produit(int id,String marque,String lib)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
    }
    public Produit(int id,String marque,String lib,Date d)
    {
        identifiant=id;
        this.marque=marque;
        libelle=lib;
        date_exp=d;
    }
    public Produit(){}

    public Produit(int id,String m,String lib,float p)
    {
        this.identifiant=id;
        this.marque=m;
        this.libelle=lib;
        this.prix=p;

    }

    public Produit(int id,String ma)
    {
        this.identifiant=id;
        this.marque=ma;
    }
    public Produit(String lib,int id)
    {
      this.identifiant=id;
      this.libelle=lib;
    }

    public  void afficher()
    {
        System.out.println("id :"+this.identifiant);
        System.out.println("libelle :"+this.libelle);
        System.out.println("marque :"+marque);
        System.out.println("prix :"+prix);
        System.out.println("Date exp :"+date_exp);
    }


    public String toString()
    {
        return "identifiant :"+identifiant+" marque :"+marque+
                " Libelle :"+libelle+" prix :"+prix +" Date exp :"+date_exp;
    }

    public void setPrix(float prix)
    {
        if(prix>0)
            this.prix=prix;
        else System.out.println("le prix doit être positif");
    }

    public float getPrix()
    {
        return prix;
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

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

public boolean comparer(Produit p)
{
    if(this.identifiant==p.identifiant
            && p.marque==marque&& prix==p.prix &&libelle== p.libelle)
        return true;
    return false;

}

public static boolean comparer(Produit p1,Produit p2)
{
    if(p1.marque==p2.marque &&p1.libelle==p2.libelle
            &&p1.identifiant==p2.identifiant)
        return true;
    return false;
}
}
