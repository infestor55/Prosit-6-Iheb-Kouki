package exception;

import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Entrer votre code : ");
            int x = System.in.read();
            
        } catch (IOException e) {
            System.err.println("Erreur d'entrée/sortie : " + e.getMessage());
        } finally {
            System.out.println("Merci de votre visite");
        }
    }
}
