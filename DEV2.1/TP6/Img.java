package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Img extends JComponent{
    private Image logo;
    private String chemin=new String("TP6/cercles.png");

    public Img(){
        super();
        this.logo=Toolkit.getDefaultToolkit().getImage(chemin);
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin = pinceau.create();
        if (this.isOpaque()){
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        pinpin.drawImage(this.logo,0,0, this);
    }
}
