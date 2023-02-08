package TP2;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Choix {
    public static void main(String[] args) {
        JFrame fenetre= new JFrame();
        ButtonGroup groupe=new ButtonGroup()
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JRadioButton gryffindor=new JRadioButton("Gryffondor");
        JRadioButton ravenclaw=new JRadioButton("Serdaigle");
        JRadioButton slytherin=new JRadioButton("Serpentard");
        
        groupe.add(gryffindor);
        groupe.add(ravenclaw);
        groupe.add(slytherin);

        fenetre.add(gryffindor,BorderLayout.NORTH);
        fenetre.add(ravenclaw,BorderLayout.CENTER);
        fenetre.add(slytherin,BorderLayout.EAST);
        
        fenetre.setVisible(true);
    }
}
