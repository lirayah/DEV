import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Fermeture implements WindowListener{
    private Dialogue dialogue;

    @Override
    public void windowActivated(WindowEvent e) {}
    
    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        dialogue.open();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowOpened(WindowEvent e) {}
    
}
