package TP6;

import java.awt.*;
import javax.swing.*;

public class Formes {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Carre c = new Carre();
        c.setOpaque(true);
        fenetre.add(c);

        Disque d=new Disque();
        c.setOpaque(true);
        fenetre.add(d);

        fenetre.setVisible(true);
    }
}
