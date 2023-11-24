package esprit.tn.TestStatic;

public class Personne {

    private int id;
    private String nom,prenom;


  static   int comp;
public Personne(){

    comp++;
}
    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        comp++;
    }

    public Personne(int id, String nom) {
        this.id = id;
        this.nom = nom;
        comp++;
    }
}
