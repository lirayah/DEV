package TP3;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class Choix {
    public static void main(String[] args) {
        JFrame fenetre= new JFrame();
        ButtonGroup groupe=new ButtonGroup();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension taille=new Dimension();
        taille.setMinimumSize(100,100);

        
        JRadioButton gryffindor=new JRadioButton("Gryffondor");
        JRadioButton ravenclaw=new JRadioButton("Serdaigle");
        JRadioButton slytherin=new JRadioButton("Serpentard");
        JRadioButton hufflepuff=new JRadioButton("Poufsouffle");
        
        gryffindor.setHorizontalAlignment(JLabel.CENTER);
        ravenclaw.setVerticalAlignment(JLabel.CENTER);
        slytherin.setHorizontalAlignment(JLabel.CENTER);
        hufflepuff.setVerticalAlignment(JLabel.CENTER);

        groupe.add(gryffindor);
        groupe.add(ravenclaw);
        groupe.add(slytherin);
        groupe.add(hufflepuff);

        fenetre.add(gryffindor,BorderLayout.NORTH);
        fenetre.add(ravenclaw,BorderLayout.WEST);
        fenetre.add(slytherin,BorderLayout.SOUTH);
        fenetre.add(hufflepuff,BorderLayout.EAST);
        

        fenetre.setVisible(true);
    }
}
