package esprit.tn.GestionEmploye;

public class Responsable extends Employe {
    private String departement;

    public Responsable(int id, String nom, String departement) {
        super(id, nom);
        this.departement = departement;
        System.out.println("Responsable trois paramètres");
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public double calculSalaire() {
        double salaireHoraire = 10.0;
        double salaire = salaireHoraire * getNbh();
        double bonus = salaire * 0.20;
        return salaire + bonus;
    }
    
    public double calculPrime() {
        double baseSalaire = calculSalaire();
        return baseSalaire * 0.10; // 10% of the base salary as prime
    }


    @Override
    public String toString() {
        return super.toString() + ", département: " + departement;
    }
}

