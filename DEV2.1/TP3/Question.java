package TP3;

import java.awt.*;
import javax.swing.*;


public class Question {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension size=new Dimension(150,160);
        fenetre.setMinimumSize(size);
        GridLayout gestionnaire= new GridLayout(2,1);
        fenetre.setLayout(gestionnaire);
        JPanel pano1=new JPanel(new BorderLayout());
        JPanel pano2=new JPanel();
        
        JLabel texte=new JLabel("Aimez-vous les chiens?");
        texte.setHorizontalAlignment(JLabel.CENTER);
        pano1.add(texte,BorderLayout.SOUTH);


        JButton oui=new JButton("OUI");
        oui.setVerticalAlignment(JLabel.CENTER);
        pano2.add(oui);

        JButton non=new JButton("NON");
        non.setVerticalAlignment(JLabel.CENTER);
        pano2.add(non);

        JButton NSPP=new JButton("NSPP");
        NSPP.setVerticalAlignment(JLabel.CENTER);
        pano2.add(NSPP);

        
        fenetre.add(pano1);
        fenetre.add(pano2);
        fenetre.setTitle("Question");
        fenetre.setVisible(true);
    }
}
