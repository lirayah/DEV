import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Detect implements MouseListener {
    private JPanel[] lab;
    private JPanel sel;

    public Detect(JPanel[] g){
        this.lab=g;
        this.sel=null;
    }

    public void mouseClicked(MouseEvent e){
        JPanel sele = (JPanel) e.getComponent();
        for (JPanel pan : this.lab) {
            if (pan==sele){
                Color coul = pan.getBackground();
                //System.out.println(coul);
                if (coul==Color.white){
                    pan.setBackground(Color.BLACK);
                } else {
                    pan.setBackground(Color.WHITE);
                }
            }   
        }
    }

    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
