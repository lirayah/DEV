package TP2;

import java.awt.*;
import javax.swing.*;

public class Contingences {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField champ = new JTextField("Je suis une patate"); 
        fenetre.add(champ,BorderLayout.SOUTH);
        champ.setHorizontalAlignment(JTextField.CENTER);
        champ.setForeground(new Color(0,255,0));
        champ.setBackground(new Color(112,112,122));

        JTextArea zone = new JTextArea("test");
        fenetre.add(zone,BorderLayout.CENTER);
        zone.setForeground(new Color(0,255,0));
        zone.setBackground(new Color(0,0,0));
        zone.setLineWrap(true);

        JScrollPane derou = new JScrollPane(zone);
        derou.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        fenetre.add(derou,BorderLayout.CENTER);

        fenetre.setVisible(true);
    }
}
