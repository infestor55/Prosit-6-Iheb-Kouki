package esprit.tn.GestionEmploye;

public class Caissier extends Employe {
    private int numCaiss;

    public Caissier() {

    }

    public Caissier(int num, int id, String n) {
        super(id, n);
        numCaiss = num;
    }

    public int getNumCaiss() {
        return numCaiss;
    }

    public void setNumCaiss(int numCaiss) {
        this.numCaiss = numCaiss;
    }

    @Override
    public double calculSalaire() {
        double salaireHoraire = 12.5; 
        return salaireHoraire * getNbh();
    }

    @Override
    public String toString() {
        return "Caissier " + super.toString() + ", num Caisse : " + numCaiss;
    }
}
