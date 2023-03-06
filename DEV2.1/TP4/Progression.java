package TP4;

public class Progression{
    public static void main(String[] args) {
        Compteur c = new Compteur();
        for (int i = 0; i < 4; i++) {
            c.plusUn();
        }
        for (int i = 1; i < 6; i++) {
            c.plusUn();
            System.out.println(c);
        }
    }
}
//Demander à hernandez pour l'histoire de toString qu'on utilise pas