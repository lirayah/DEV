package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Carre extends JComponent{
    Color c=new Color(0, 0, 255);
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinceau2= pinceau.create();
        if(this.isOpaque()){
            pinceau2.setColor(c);
            pinceau2.drawLine(1, 1, 51, 1);
            pinceau2.drawLine(1, 1, 1, 51);
            pinceau2.drawLine(51, 1, 51, 51);
            pinceau2.drawLine(51, 51, 1, 51);
        }
    }
}
