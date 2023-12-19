package luminance;

import java.awt.Color;
import java.awt.Polygon;

public class Parallelogramme extends Polygon {
    private double r;
    private double g;
    private double b;
    private Color rgb;
    
    public Parallelogramme(double r, double g, double b){
        super();
        this.r=r;
        this.g=g;
        this.b=b;
        this.rgb = new Color((float) r,(float) g,(float) b);
        this.addPoint(10, 5);
        this.addPoint(30, 5);
        this.addPoint(20, 90);
        this.addPoint(0, 90);
    }

    public Color getColor() {
        return this.rgb;
    }

    public double getLuminance() {
        return 21*this.r + 72*this.g + 7*this.b;
    }
}
