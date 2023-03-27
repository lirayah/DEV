package TP9;

import javax.swing.JFrame;

public class MainVolume {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(500,100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Cercles test=new Cercles();
        Volume stiti=new Volume(test);        

        fenetre.addMouseWheelListener(stiti);
        fenetre.add(test);

        fenetre.setVisible(true);
    }
}
