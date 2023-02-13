package TP3;

import java.awt.*;
import javax.swing.*;

public class Damier {
    public static void main(String[] args) {
        int lignes=Integer.parseInt(args[0]);
        JFrame fenetre=new JFrame();
        fenetre.setSize((lignes*50),(lignes*50));
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gestionnaire=new GridLayout(lignes,lignes);
        fenetre.setLayout(gestionnaire);
        
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < lignes; j++) {
                JPanel panneau = new JPanel();
                if ((i%2)==(j%2)){
                    panneau.setBackground(Color.WHITE);
                    fenetre.add(panneau);    
                }
                else{
                    panneau.setBackground(Color.CYAN);
                    fenetre.add(panneau);    
                }
                
            }
            
        }
        fenetre.setVisible(true);
    }
}
