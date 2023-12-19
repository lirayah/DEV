package luminance;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class Souris implements MouseListener {
    private Vue v;
    private List<Parallelogramme> liste;

    public Souris(Vue v,List<Parallelogramme> liste){
        this.v=v;
        this.liste=liste;
    }

    public void mouseClicked(MouseEvent e){
        // Point point = e.getPoint();
        int x=e.getX();
        int y = e.getY();
        for(Parallelogramme p:this.liste){
            if(p.contains(x,y)){
                this.liste.remove(p);
                System.out.println("Luminance: "+ p.getLuminance());
                this.v.repaint();
                break;
            }
            x-=30;
        }
    }

    public void mouseEntered(MouseEvent e){

    }
    
    public void mouseExited(MouseEvent e){

    }
    
    public void mousePressed(MouseEvent e){

    }
    
    public void mouseReleased(MouseEvent e){

    }

}
