package esprit.tn.GestionEmploye;

public class Vendeur extends Employe {
    private double chiffreAffaires;
    private double commission;

    public Vendeur(int id, String nom, double chiffreAffaires) {
        super(id, nom);
        this.chiffreAffaires = chiffreAffaires;
        System.out.println("Vendeur trois paramètres");
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculSalaire() {
        double salaire = 1500.0;
        double commissionAmount = chiffreAffaires * (commission / 100);
        return salaire + commissionAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", chiffre d'affaires: " + chiffreAffaires + ", commission: " + commission + "%";
    }
}

