package TP6;

import java.awt.*;
import javax.swing.*;

public class Sautoir {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        GridLayout gestio=new GridLayout(5,5);
        fenetre.setLayout(gestio);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        for (int i = 0; i < 24; i++) {
            Sablier a=new Sablier();
            a.setOpaque(true);
            fenetre.add(a);
        }
        fenetre.setVisible(true);
        
    }    
}
