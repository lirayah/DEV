package TP8;

import javax.swing.*;
import java.awt.*;

public class Variantes extends JComponent{
    private int[] xPoints;
    private int[] yPoints;
    private int nPoints;
    private boolean coucou;

    public Variantes(){
        super();
        this.xPoints=new int[4];
        this.yPoints=new int[4];
        this.nPoints=4;
        this.setOpaque(true);
    }

    public void setCoucou(boolean b){
        this.coucou=b;
        if(this.coucou){
            this.setBackground(Color.GREEN);
        }
        else{
            this.setBackground(Color.YELLOW);
        }
        this.repaint();
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
        if(this.isOpaque()){
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        if(!coucou){
            pinpin.setColor(Color.BLACK);
            this.xPoints[0]=1;
            this.xPoints[1]=this.getWidth()-1;
            this.xPoints[2]=1;
            this.xPoints[3]=this.getWidth()-1;
            this.yPoints[0]=1;
            this.yPoints[1]=this.getHeight()-1;
            this.yPoints[2]=this.getHeight()-1;
            this.yPoints[3]=1;
            pinpin.fillPolygon(xPoints,yPoints,nPoints);
        }
        else{
            pinpin.setColor(Color.MAGENTA);
            pinpin.fillOval(this.getWidth()/2,this.getHeight()/2,100,100);
        }
    }
}
