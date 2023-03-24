package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Img extends JComponent{
    private Image logo;

    public Img(String chemin){
        super();
        this.logo=Toolkit.getDefaultToolkit().getImage(chemin);
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin = pinceau.create();
        pinpin.drawImage(this.logo,0,0, this);
    }
}
