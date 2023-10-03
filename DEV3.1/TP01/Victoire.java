import javax.management.JMException;
import javax.swing.*;
import java.awt.*;


public class Victoire extends JFrame{
    private int score;
    private JLabel label;
    private JLabel label2;
    public Victoire(){
        super();
        
        this.setSize(400, 400);
        label=new JLabel();
        label2=new JLabel();
        this.add(label);
        this.add(label2);

        Bouton b=new Bouton(this);
        JButton bouton=new JButton("Refresh");
        bouton.addActionListener(b);

        this.add(bouton);
        GridLayout gestio = new GridLayout(3,1);
        this.setLayout(gestio);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.oui();
    }


    public static void main(String[] args) {
        Victoire v = new Victoire();
        v.setVisible(true);
    }

    public void oui() {
        Modele modele = new Modele();
        modele.nbVotes();
        Competiteur[] tab = modele.getTab();
        int score = -1;
        String pays = null;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getScore() > score) {
                score=tab[i].getScore();
                pays=tab[i].getPays();
            }
        }
        this.label.setText(pays);
        this.label2.setText(Integer.toString(score));
    }
}
