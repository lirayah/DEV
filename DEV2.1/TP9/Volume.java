package TP9;

import java.awt.event.*;

public class Volume implements MouseWheelListener {
    int a;
    public Volume(){
        super();
        this.a=5;
    }

    public void mouseWheelMoved(MouseWheelEvent e){
        int i;
        i=e.getWheelRotation();
        if(i>0){
            this.a++;
            for (int j = 0; j < this.a; j++) {
                
                for (int j2 = 0; j2 < array.length; j2++) {
                    
                }
            }
            for (int b=this.a ; b<10 ; b++){
                
            }
        }
        if(i<0){
            this.a--;
            for (int j = 0; j < this.a; j++) {
                
            }
        }
    }
}
