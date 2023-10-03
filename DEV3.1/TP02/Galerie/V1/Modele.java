import javax.swing.ImageIcon;

public class Modele {
    private ImageIcon[] iic;
    private int compteur;
    private Vue v;

    public Modele(){
        compteur=0;
        this.iic=new ImageIcon[3];
        iic[0]=new ImageIcon("../im1.jpg");
        this.v=new Vue(iic[0],this);
        iic[1]=new ImageIcon("../im2.jpg");
        iic[2]=new ImageIcon("../im3.jpg");
        v.setVisible(true);
    }

    public ImageIcon next(){
        compteur++;
        if (compteur==3) {
            compteur=0;
        }
        return iic[compteur];
    }

    public ImageIcon previous(){
        compteur--;
        if (compteur==-1) {
            compteur=2;
        }
        return iic[compteur];
    }
}
