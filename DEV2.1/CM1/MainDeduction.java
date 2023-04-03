/*Lionel MORIN Groupe 1 */

public class MainDeduction {
    public static void main(String[] args) {
        Deduction carte=new Deduction(1);
        YesCard yesyes=new YesCard(2);
        System.out.println(carte);
        System.out.println("");
        carte.crediter();
        System.out.println(carte);
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            carte.crediter();
        }
        System.out.println(carte);

        System.out.println("");
        System.out.println("");

        System.out.println(yesyes);
        System.out.println("");
        yesyes.crediter();
        System.out.println(yesyes);
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            yesyes.crediter();
        }
        System.out.println(yesyes);
    }
}
