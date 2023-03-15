package TP6;

import java.awt.*;
import javax.swing.*;

public class Auth extends JComponent{
    private Image logo;
    private String chemin=new String("TP6/logo.png");

    public Auth(){
        super();
        this.logo=Toolkit.getDefaultToolkit().getImage(chemin);
    }

    @Override
    protected void paintComponent(Graphics pinceau){
        Graphics pinpin = pinceau.create();
        pinpin.drawImage(this.logo, 0, 0, this);
        
    }
}
