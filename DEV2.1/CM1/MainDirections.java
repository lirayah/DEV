/*Lionel MORIN Groupe 1 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class MainDirections {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(300,300);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gestio=new GridLayout(2,2);
        fenetre.setLayout(gestio);
        
        JPanel pano1=new JPanel();
        JPanel pano2=new JPanel();
        JPanel pano3=new JPanel();
        JPanel pano4=new JPanel();

        JButton haut1=new JButton("◤");
        haut1.setSize(30,30);
        pano1.add(haut1,BorderLayout.NORTH);
        fenetre.add(pano1,BorderLayout.WEST);

        JButton haut2=new JButton("◥");
        haut2.setSize(30,30);
        pano2.add(haut2,BorderLayout.NORTH);
        fenetre.add(pano2,BorderLayout.EAST);

        JButton bas1=new JButton("◣");
        bas1.setSize(30,30);
        pano3.add(bas1,BorderLayout.SOUTH);
        fenetre.add(pano3,BorderLayout.WEST);

        JButton bas2=new JButton("◢");
        bas2.setSize(30,30);
        pano4.add(bas2,BorderLayout.SOUTH);
        fenetre.add(pano4,BorderLayout.EAST);

        fenetre.setVisible(true);
    }
}
