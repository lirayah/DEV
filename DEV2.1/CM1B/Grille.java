package CM1B;


public class Grille {
    private short[][] Cases = new short[7][6];
    private int joueurActuel;
    public Grille() {
        joueurActuel = 0;
    }
    public void jouer(int colonne) {
        if (colonne < 1 && colonne > 7) {
            System.out.println("N° de colonne invalide !");
            return;
        }
        boolean placementValide = false;
        for (int i = 5; i >= 0; i--) {
            if (Cases[colonne-1][i] == 0) {
                Cases[colonne-1][i] = (short)(joueurActuel+1);
                joueurActuel = (joueurActuel + 1) % 2;
                placementValide = true;
                break;
            }
        }
        if (!placementValide) {
            System.out.println("Colonne n°" + colonne + " pleine !");
        }
    }
    @Override
    public String toString() {
        String str = "";
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                str += "│";
                if (Cases[y][x] == 0) str += " ";
                else if (Cases[y][x] == 1) str += "○";
                else if (Cases[y][x] == 2) str += "●";
            }
            
            str += "│\n";
        }
        str += "┴─┴─┴─┴─┴─┴─┴─┴";
        return str;
    }
}