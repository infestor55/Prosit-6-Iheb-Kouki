package TestTable;

import esprit.tn.Entite.Produit;

public class Test {

    public static void main(String[] args) {
        int [] tab=new int[3] ;
        for (int i=0;i<tab.length;i++)
            System.out.println(tab[i]);
      tab[0]=3;
      tab[1]=2;
      tab[2]=5;
        for (int i=0;i<tab.length;i++)
            System.out.println(tab[i]);


        int [] tab1={5,2,10};

        String []  tab3=new String[2];
        tab3[0]="aa";
        tab3[1]="rrr";

        Produit [] tabpr=new Produit[2];
        Produit p1=new Produit();
        tabpr[0]=p1;
        tabpr[1]=new Produit();
    }
}