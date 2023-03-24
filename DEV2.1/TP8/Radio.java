package TP8;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;;

public class Radio implements ActionListener{
    private JPanel pano;
    private String a;
    private String b;
    private String r;
    private String y;

    public Radio(JPanel pano2){
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
