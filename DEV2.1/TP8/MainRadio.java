package TP8;

import javax.swing.*;

public class MainRadio {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(100,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pano=new JPanel();
        Radio test=new Radio(pano);
        ButtonGroup groupe=new ButtonGroup();
        JRadioButton Cyan=new JRadioButton("Cyan");
        JRadioButton Magenta=new JRadioButton("Magenta");
        JRadioButton Jaune=new JRadioButton("Jaune");

        groupe.add(Cyan);
        groupe.add(Magenta);
        groupe.add(Jaune);

        pano.add(Cyan);
        pano.add(Magenta);
        pano.add(Jaune);
        fenetre.add(pano);

        Cyan.addActionListener(test);
        Magenta.addActionListener(test);
        Jaune.addActionListener(test);
       
        fenetre.setVisible(true);
    }
}
