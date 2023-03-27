package TP9;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Cercles extends JComponent {
    private int i;
    public Cercles(){
        super();
    }

    public void getNombre(int a){
        this.i=a;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics pinceau){
        Graphics pinpin=pinceau.create();
        if(this.isOpaque()){
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }

        for (int j = 0; j < this.i; j++) {
            pinpin.setColor(Color.YELLOW);
            pinpin.fillOval(j*30, this.getHeight()/2, 20, 20);
        }
        for (int j=this.i; j < 10; j++) {
            pinpin.setColor(Color.GRAY);
            pinpin.fillOval(j*30, this.getHeight()/2, 20, 20);
        }
    }
}