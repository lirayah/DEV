import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Detect implements MouseListener{
    private JLabel[] lab;
    private JLabel selection;

    public Detect(JLabel[] liste){
        this.lab=liste;
        this.selection=null;
    }

    public void mouseClicked(MouseEvent e){
        //System.out.println("oui");
        JLabel sel = (JLabel) e.getComponent();
        //System.out.println(sel);
        for (JLabel mus: this.lab){
            if (mus==sel){
                mus.setBackground(Color.CYAN);
                this.selection=mus;
            }
            else{
                mus.setBackground(Color.WHITE);
            }
        }
    }

    public void mouseEntered(MouseEvent e){
        JLabel sel = (JLabel) e.getComponent();
            if (sel!=this.selection){
                sel.setBackground(Color.GRAY);
            }
    }
    public void mouseExited(MouseEvent e){
        JLabel sel = (JLabel) e.getComponent();
            if (sel!=this.selection){
                sel.setBackground(Color.WHITE);
            }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
