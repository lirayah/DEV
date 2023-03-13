package TP5;

import javax.swing.JFrame;

public class Grisaille {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int a = Integer.parseInt(args[0]);
        Gris test=new Gris(a);
        fenetre.setBackground(test);
        fenetre.setVisible(true);
    }
}
