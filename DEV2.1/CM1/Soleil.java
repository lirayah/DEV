/*Lionel MORIN Groupe 1 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Soleil extends JComponent {
    private int clic;

    public Soleil(){
        super();
    }

    public void incrClic(int nbClic){
        this.clic+=nbClic;
        this.setBackground(new Color(115, 194, 251));
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics brush) {
        Graphics pinpin=brush.create();
        if(this.isOpaque()){
            pinpin.setColor(this.getBackground());
            pinpin.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        this.setBackground(new Color(115,194,251));
        pinpin.setColor(Color.YELLOW);
        pinpin.fillOval(this.getWidth()/2,this.getHeight(),clic*15,clic*15);
    }
}
