package TP6;

import java.awt.*;
import javax.swing.*;

public class Formes {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        GridLayout gestionnaire=new GridLayout(4,2);
        fenetre.setLayout(gestionnaire);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Carre c = new Carre();
        c.setOpaque(true);
        fenetre.add(c);

        Disque d=new Disque();
        d.setOpaque(true);
        fenetre.add(d);

        Img i = new Img();
        i.setOpaque(true);
        fenetre.add(i);

        Owo o=new Owo();
        o.setOpaque(true);
        fenetre.add(o);
        
        fenetre.setVisible(true);
    }
}
