

import javax.swing.*;

public class MainMemoire {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,500);
        fenetre.setLocation(100,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pano=new JPanel();
        Memoire test=new Memoire(pano);
        JButton Cyan=new JButton("Cyan");
        JButton Magenta=new JButton("Magenta");
        JButton Jaune=new JButton("Jaune");

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
