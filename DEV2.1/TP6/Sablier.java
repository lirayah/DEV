package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Sablier extends JComponent{
    private int[] xPoints;
    private int[] yPointsHaut;
    private int[] yPointsBas;
    private int nPoints;

    public Sablier(){
        super();
        this.xPoints=new int[3];
        this.yPointsBas=new int[3];
        this.yPointsHaut=new int[3];
        this.nPoints=3;
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
        
        if (this.isOpaque()) {
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        this.xPoints[0]=0;
        this.xPoints[1]=this.getWidth();
        this.xPoints[2]=this.getWidth()/2;
        this.yPointsHaut[0]=0;
        this.yPointsHaut[1]=0;
        this.yPointsHaut[2]=this.getHeight()/2;
        this.yPointsBas[0]=this.getHeight();
        this.yPointsBas[1]=this.getHeight();
        this.yPointsBas[2]=this.getHeight()/2;
        pinpin.setColor(Color.CYAN);
        pinpin.fillPolygon(xPoints,yPointsHaut,nPoints);
        pinpin.fillPolygon(xPoints,yPointsBas,nPoints);
    }
}
