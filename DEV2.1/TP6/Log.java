package TP6;

import java.awt.*;
import javax.swing.JComponent;

public class Log extends JComponent{

    public Log(){
        super();
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
    
        pinpin.setFont(new Font("default",Font.BOLD,24));
        pinpin.drawString("Login", getWidth()/4,getHeight()/2);
        pinpin.drawString("Password", getWidth()/4,getHeight());
    }
}
