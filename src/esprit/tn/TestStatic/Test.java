package esprit.tn.TestStatic;

public class Test {

    public static void main(String[] args) {
        Personne p1=new Personne();
        System.out.println(p1.comp);
        Personne p2=new Personne(1,"nom1","prenom1");
        System.out.println(p2.comp);
        Personne p3=new Personne();
        System.out.println(p3.comp);
        Personne p4=new Personne(1,"nom1","prenom1");
        System.out.println(p4.comp);
        Personne p5=new Personne(2,"");
        System.out.println(Personne.comp);

    }
}
