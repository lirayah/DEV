package TP7;

import java.awt.*;
import javax.swing.*;

public class Polyligne extends JComponent{
    @Override
    protected void paintComponent(Graphics pain_seau){
        Graphics pinpin=pain_seau.create();
        Etoile a=new Etoile();
        Point p1=new Point();
        Point p2=new Point();

        if(this.isOpaque()){
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        pinpin.setColor(Color.BLACK);
        p1=a.suivant();
        for (int i = 0; i < 5; i++) {
            p2=a.suivant();
            pinpin.drawLine(p1.x, p1.y, p2.x, p2.y);
            p1=p2;
        }
    }
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        Polyligne oui=new Polyligne();
        fenetre.setSize(600,600);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.add(oui);

        fenetre.setVisible(true);
    }
}
