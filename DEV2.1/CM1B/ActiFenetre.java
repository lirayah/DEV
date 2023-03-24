package CM1B;

import java.awt.event.*;

public class ActiFenetre implements WindowListener{
    private Variantes jean;

    public ActiFenetre(Variantes a){
        this.jean=a;
    }

    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    
    public void windowIconified(WindowEvent e){
        this.jean.setTruc(true);
    }
}
