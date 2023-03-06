package TP3;

import javax.swing.*;
import java.awt.*;

public class Rose {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(300,300);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gestionnaire=new GridLayout(3,1);
        fenetre.setLayout(gestionnaire);

        JPanel pano1=new JPanel(new BorderLayout());
        JPanel pano2=new JPanel(new BorderLayout());
        JPanel pano3=new JPanel(new BorderLayout());
        JPanel pano4=new JPanel(new BorderLayout());
        JPanel pano5=new JPanel(new BorderLayout());
        JPanel pano6=new JPanel(new BorderLayout());
        JPanel pano7=new JPanel(new BorderLayout());
        JPanel pano8=new JPanel(new BorderLayout());

        //PANO1
        JLabel Mystral=new JLabel("Mystral");
        Mystral.setHorizontalAlignment(JLabel.LEFT);
        Mystral.setVerticalAlignment(JLabel.TOP);
        
        JLabel Tramontane=new JLabel("Tramontane");
        Tramontane.setHorizontalAlignment(JLabel.CENTER);
        Tramontane.setVerticalAlignment(JLabel.TOP);

        JLabel Grec=new JLabel("Grec");
        Grec.setHorizontalAlignment(JLabel.RIGHT);
        Grec.setVerticalAlignment(JLabel.TOP);

        pano1.add(Mystral,BorderLayout.NORTH);
        pano1.add(Tramontane,BorderLayout.NORTH);
        pano1.add(Grec,BorderLayout.NORTH);

        //PANO2
        JLabel Ponant=new JLabel("Ponant");
        Ponant.setHorizontalAlignment(JLabel.LEFT);
        Ponant.setVerticalAlignment(JLabel.CENTER);

        JLabel Levant=new JLabel("Levant");
        Levant.setHorizontalAlignment(JLabel.RIGHT);
        Levant.setVerticalAlignment(JLabel.CENTER);

        pano2.add(Ponant,BorderLayout.CENTER);
        pano2.add(Levant,BorderLayout.CENTER);

        //PANO3
        JLabel Libeccio=new JLabel("Libeccio");
        Libeccio.setHorizontalAlignment(JLabel.LEFT);
        Libeccio.setVerticalAlignment(JLabel.BOTTOM);

        JLabel Marin=new JLabel("Marin");
        Marin.setHorizontalAlignment(JLabel.CENTER);
        Marin.setVerticalAlignment(JLabel.BOTTOM);

        JLabel Sirocco=new JLabel("Sirocco");
        Sirocco.setHorizontalAlignment(JLabel.RIGHT);
        Sirocco.setVerticalAlignment(JLabel.BOTTOM);

        pano3.add(Libeccio,BorderLayout.SOUTH);
        pano3.add(Marin,BorderLayout.SOUTH);
        pano3.add(Sirocco,BorderLayout.SOUTH);

        fenetre.add(pano1);
        fenetre.add(pano2);
        fenetre.add(pano3);

        fenetre.setTitle("Rose");
        fenetre.setVisible(true);
    }
}
