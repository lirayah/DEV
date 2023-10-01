import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;


public class Victoire extends JFrame{

    public Victoire(String pays, int score){
        super();
        this.setSize(400, 400);
        this.add(new JLabel(pays));
        this.add(new JLabel(Integer.toString(score)));
        GridLayout gestio = new GridLayout(3,1);
        this.setLayout(gestio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Modele modele = new Modele();
        modele.nbVotes();
        Competiteur[] tab = modele.getTab();
        int max = 0;
        String pays = null;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getScore() > max) {
                max=tab[i].getScore();
                pays=tab[i].getPays();
            }
        }
        
        Victoire v = new Victoire(pays, max);
    }
}
