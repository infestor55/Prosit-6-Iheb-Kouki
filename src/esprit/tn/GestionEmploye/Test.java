package esprit.tn.GestionEmploye;

import esprit.tn.Gestion.Magasin;

public class Test {

    public static void main(String[] args) {
        Employe em1 = new Employe(1, "nom1");
        Caissier cais1 = new Caissier(145, 2, "nom2");
        Employe em2 = new Employe();
        Caissier cais2 = new Caissier();

        System.out.println("id: " + cais1.getId());
        System.out.println("nom: " + cais1.getNom());
        System.out.println("num Cai: " + cais1.getNumCaiss());
        System.out.println("toString:");
        System.out.println(cais1);
        System.out.println(cais2);
        System.out.println("test:");
        cais1.toString();

        Magasin magasin = new Magasin(1, "Magasin 1");

        magasin.ajouterEmploye(em1);
        magasin.ajouterEmploye(cais1);
        magasin.ajouterEmploye(em2);
        magasin.ajouterEmploye(cais2);

        magasin.afficheSalaireEmployes();

        magasin.affichePrimeResponsable();

        magasin.afficheNombreEmployesParType();

        Vendeur vendeur1 = new Vendeur(3, "Vendeur1", 5000);
        magasin.ajouterEmploye(vendeur1);
        magasin.afficheSalaireEmployes();
    }
}
