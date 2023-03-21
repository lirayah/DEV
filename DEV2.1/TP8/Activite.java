package TP8;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color.*;
import java.awt.event.*;

public class Activite extends JComponent implements WindowListener{
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;

    public Activite(){
        super();
        this.xPoints=new int[4];
        this.yPoints=new int[4];
        this.nPoints=4;
    }

    /*@Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
        pinpin.setColor(Color.green);
        this.xPoints[0]=1;
        this.xPoints[1]=this.getWidth()-1;
        this.xPoints[2]=1;
        this.xPoints[3]=this.getWidth()-1;
        this.yPoints[0]=1;
        this.yPoints[1]=this.getHeight()-1;
        this.yPoints[2]=1;
        this.yPoints[3]=this.getHeight()-1;
        pinpin.fillPolygon(xPoints,yPoints,nPoints);
    }
    */
    public void windowActivated(WindowEvent e){
        this.setBackground(Color.yellow);
    }
}
