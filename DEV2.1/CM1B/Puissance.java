package CM1B;

public class Puissance {
    public static void main(String[] args) {
        Grille g = new Grille();
        g.jouer(3);
        g.jouer(4);
        g.jouer(4);
        g.jouer(6);
        g.jouer(4);
        g.jouer(6);
        System.out.println(g);
    }
}