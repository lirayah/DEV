/*Lionel MORIN Groupe 1 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseImp implements MouseListener{
    private Soleil sun;
    public MouseImp(Soleil a){
        this.sun=a;
    }
    public void mouseClicked(MouseEvent e){
        sun.incrClic(e.getClickCount());
    }

    public void mouseEntered(MouseEvent evenement){}
    public void mouseExited(MouseEvent evenement){}       
    public void mousePressed(MouseEvent evenement){}       
    public void mouseReleased(MouseEvent evenement){}      
}
