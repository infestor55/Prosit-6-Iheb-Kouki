package TestAssociation;

public class Test {
    public static void main(String[] args) {
        Projet p1=new Projet("uml");

        System.out.println(p1);

        Developpeur dev1=new Developpeur("ons");
        p1.setDev(dev1);
        System.out.println(p1);

        Developpeur dev2=new Developpeur("san");
        Projet p2=new Projet("java",dev2);

        System.out.println(p2);


    }
}