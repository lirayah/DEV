package TP5;

import javax.swing.*;

public class Grisaille {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        Grigri e=new Grigri(a);
        JFrame fenetre= new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0, 0);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JTextField etiquette = new JTextField("JE suis un texte oui je suis du texte  !");
	    etiquette.setBackground(e);
	    fenetre.add(etiquette);
        fenetre.setVisible(true);
    }
}
