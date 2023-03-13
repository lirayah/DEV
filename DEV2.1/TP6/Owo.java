package TP6;

import java.awt.*;
import javax.swing.JComponent;

public class Owo extends JComponent{
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
        if (this.isOpaque()) {
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        pinpin.setColor(new Color(238,130,238));
        pinpin.setFont(new Font("default",Font.BOLD,24));
        pinpin.drawString(">o<", 10, 20);
    }
}
