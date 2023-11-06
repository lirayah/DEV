import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre implements WindowListener{
    private JFrame f;
    public Fenetre(JFrame f){
        super();
        this.f=f;
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int reponse=JOptionPane.showConfirmDialog(f, "Etes vous sur?");
        if (reponse==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }
}
