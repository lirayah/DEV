//package CM1B;

import javax.swing.JFrame;

public class FenetreMinimisable extends JFrame {
  
  public FenetreMinimisable() {
    super("FenetreMinimisable");
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
  }

  @Override
  public void dispose() {
    setState(JFrame.ICONIFIED);
  }
  
  public static void main(String[] args) {
    FenetreMinimisable fenetre = new FenetreMinimisable();
  }

}