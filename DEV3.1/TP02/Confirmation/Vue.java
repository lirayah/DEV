import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vue extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private CardLayout gestio;
    
    public Vue(){
        super();
        this.setSize(1920,1050);
        this.gestio=new CardLayout();
        this.setLayout(gestio);
        this.label1= new JLabel(new ImageIcon("../im1.jpg"));
        this.label2= new JLabel(new ImageIcon("../im2.jpg"));
        this.label3= new JLabel(new ImageIcon("../im3.jpg"));
        this.add(label1);
        this.add(label2);
        this.add(label3);
        Souris s=new Souris(this);
        this.addMouseListener(s);
    }


    public void tOu(int x) {
        if(x<(this.getWidth()/2)){
            this.gestio.previous(this.getContentPane());
        }
        else{
            this.gestio.next(this.getContentPane());
        }
    }

    
}
