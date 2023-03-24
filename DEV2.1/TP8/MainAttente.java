package TP8;

import javax.swing.JFrame;

public class MainAttente {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Variantes test=new Variantes();
        Activite oui=new Activite(test);
    

        fenetre.addWindowListener(oui);
        fenetre.add(test);

        fenetre.setVisible(true);
    }
}
