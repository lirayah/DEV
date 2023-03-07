package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Disque extends JComponent {
    Color c=new Color(0,255,0);
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pain_seau=pinceau.create();
        if(this.isOpaque()){
            pain_seau.setColor(c);
            pain_seau.fillOval(150,150,15,15);
        }
    }
}
