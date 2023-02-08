package TP2;

import java.awt.*;
import javax.swing.*;



public class saisie {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField zone = new JTextField("Je suis une patate"); 
        fenetre.add(zone,BorderLayout.SOUTH);
        zone.setHorizontalAlignment(JTextField.CENTER);
        zone.setForeground(new Color(0,255,0));
        zone.setBackground(new Color(112,112,122));

        JTextArea champ = new JTextArea("test");
        fenetre.add(champ,BorderLayout.CENTER);
        champ.setForeground(new Color(0,255,0));
        champ.setBackground(new Color(0,0,0));
        fenetre.setVisible(true);
    }
}
