package TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Sablier extends JComponent{
    private int[] xPoints={0,this.getWidth(),this.getWidth()/2};
    private int[] yPointsHaut={0,0,this.getHeight()/2};
    private int[] yPointsBas={this.getHeight(),this.getHeight(),this.getHeight()/2};
    private int nPoints=3;

    public Sablier(){
        super();
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics pinpin=pinceau.create();
        
        if (this.isOpaque()) {
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        
        pinpin.setColor(Color.CYAN);
        pinpin.fillPolygon(xPoints,yPointsHaut,nPoints);
        pinpin.fillPolygon(xPoints,yPointsBas,nPoints);
    }
}
