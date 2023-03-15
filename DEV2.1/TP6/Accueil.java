package TP6;

import java.awt.*;
import javax.swing.*;

public class Accueil {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        GridLayout gestio=new GridLayout(2,1);
        fenetre.setLayout(gestio);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color bgColor=new Color(212, 115, 212);
        fenetre.getContentPane().setBackground(bgColor);

        Auth a=new Auth();
        fenetre.add(a);

        JTextField login=new JTextField("login");
        fenetre.add(login);

        fenetre.setVisible(true);
    }
}
