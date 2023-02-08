package TP2;

import javax.swing.*;
import java.awt.*;

public class boutons {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(100,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("je suis une licorne avec des pouvoir magique qui mange des patates");
        b1.setVerticalAlignment(JLabel.CENTER);
        fenetre.add(b1,BorderLayout.NORTH);

        JButton b2 = new JButton("b2");
        b2.setVerticalAlignment(JLabel.CENTER);
        fenetre.add(b2,BorderLayout.WEST);
        
        JButton b3 = new JButton("b3");
        b3.setVerticalAlignment(JLabel.CENTER);
        fenetre.add(b3,BorderLayout.CENTER);
        
        JButton b4 = new JButton("b4");
        b4.setVerticalAlignment(JLabel.CENTER);
        fenetre.add(b4,BorderLayout.EAST);
        
        JButton b5 = new JButton("b5");
        b5.setVerticalAlignment(JLabel.CENTER);
        fenetre.add(b5,BorderLayout.SOUTH);
        fenetre.setVisible(true);
    }
}
