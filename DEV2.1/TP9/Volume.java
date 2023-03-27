package TP9;

import java.awt.event.*;

public class Volume implements MouseWheelListener {
    private int a;
    private Cercles ce;
    public Volume(Cercles chat){
        super();
        this.a=0;
        this.ce=chat;
    }

    public void mouseWheelMoved(MouseWheelEvent e){
        int i;
        i=e.getWheelRotation();
        if(i>0 && this.a<10){
            this.a++;
            ce.getNombre(this.a);
        }
        
        if(i<0 && this.a>0){
            this.a--;
            ce.getNombre(this.a);
        }
    }
}
