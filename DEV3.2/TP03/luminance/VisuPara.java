package luminance;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JComponent;

public class VisuPara extends JComponent {
    private List<Parallelogramme> liste;

    public VisuPara(List<Parallelogramme> p){
        super();
        this.liste=p;
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics gg=g.create();
        if (this.isOpaque()) {
            gg.setColor(this.getBackground());
            gg.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        
        for(Parallelogramme p:this.liste){
            gg.setColor(p.getColor());
            gg.fillPolygon(p);
            gg.setColor(Color.BLACK);
            gg.drawPolygon(p);
            gg.translate(30,0);
        }
    }
}
