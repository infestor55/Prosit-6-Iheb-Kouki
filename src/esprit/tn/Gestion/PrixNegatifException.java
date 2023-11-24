package esprit.tn.Gestion;

import esprit.tn.Entite.Produit;

public class PrixNegatifException extends Exception {
    public PrixNegatifException(String message) {
        super(message);
    }
}
