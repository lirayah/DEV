import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vue extends JFrame {
    private JLabel label;
    private Modele m;
    private int compteur;
    private ImageIcon image;
    
    public Vue(ImageIcon a, Modele mo){
        super();
        this.m=mo;
        this.image=a;
        this.setSize(1920,1050);
        this.label= new JLabel(image);
        this.add(label);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Souris s=new Souris(this);
        this.addMouseListener(s);
    }

    public void chat(ImageIcon a) {
        this.remove(this.label);
        this.label=new JLabel(a);
        this.add(this.label);
        this.revalidate();
    }

    public void tOu(int x) {
        if(x<(this.getWidth()/2)){
            this.image=this.m.previous();
        }
        else{
            this.image=this.m.next();
        }

        this.chat(this.image);
    }
}
