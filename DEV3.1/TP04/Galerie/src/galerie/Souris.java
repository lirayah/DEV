package galerie;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Souris implements MouseListener {
    private int x;
    private Vue vue;
    public Souris(Vue v){
        super();
        this.vue=v;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        this.x=e.getX();
        this.vue.tOu(this.x);
    }

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}

    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

}
