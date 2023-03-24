package TP8;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Fond implements ActionListener{
    private JPanel pano;
    private String a;
    private String b;
    private String r;
    private String y;

    public Fond(JPanel pano2){
        this.pano=pano2;
        this.b="Cyan";
        this.r="Magenta";
        this.y="Jaune";
    }

    public void actionPerformed(ActionEvent e) {
        a=e.getActionCommand();
        if(a.equalsIgnoreCase(b)){
            pano.setBackground(Color.cyan);
        }
        if(a.equalsIgnoreCase(r)){
            pano.setBackground(Color.magenta);
        }
        if(a.equalsIgnoreCase(y)){
            pano.setBackground(Color.yellow);
        }
    }
}
