package TP4;

public class Lendemains2 {
    public static void main(String[] args) {
        int annee = Integer.parseInt(args[0]);
        int mois = Integer.parseInt(args[1]);
        int jour = Integer.parseInt(args[2]);
        Lendemains l = new Lendemains(annee, mois, jour);
        Lendemains l2= new Lendemains(2005,3, 2);
        Lendemains l3=new Lendemains(annee, mois, jour);
        Lendemains test = new Lendemains(annee, mois, jour);
        test.Compare(l,l2);
        test.Compare(l,l3);
        l.jourApr();
        System.out.println(l);
    }
}
