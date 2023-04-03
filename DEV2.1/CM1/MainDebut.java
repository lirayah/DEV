/*Lionel MORIN Groupe 1 */

import java.awt.Color;
import javax.swing.JFrame;


public class MainDebut {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(500,500);
        fenetre.setBackground(new Color(115, 194, 251));

        Soleil sun=new Soleil();
        MouseImp mouse=new MouseImp(sun);
        
        fenetre.addMouseListener(mouse);
        fenetre.add(sun);

        fenetre.setVisible(true);
    }

}
