package TP8;

import javax.swing.JFrame;

public class MainAttente {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Activite test=new Activite();

        fenetre.addWindowListener(test);

        fenetre.setVisible(true);
    }
}
