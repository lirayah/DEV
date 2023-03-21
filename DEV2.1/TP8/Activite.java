package TP8;

import java.awt.event.*;

public class Activite implements WindowListener{
    private Variantes jean;
    public Activite(Variantes a){
        jean=a;
    }
    public void windowActivated(WindowEvent e){
        jean.setCoucou(false);
    }
    public void windowClosed(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){
        jean.setCoucou(true);
    }
    public void windowIconified(WindowEvent e){}

}
