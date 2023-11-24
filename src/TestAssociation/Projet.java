package TestAssociation;

public class Projet {


    private String nom;

    private Developpeur dev;

    public Projet(String n)
    {
        nom=n;
    }
    public Projet(String n,Developpeur d)
    {
        nom=n;
        dev=d;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Developpeur getDev() {
        return dev;
    }

    public void setDev(Developpeur dev) {
        this.dev = dev;
    }

    public String toString()
    {
        return "nom :"+nom+"Dev :"+dev;
    }
}