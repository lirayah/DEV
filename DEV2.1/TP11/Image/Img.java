import java.io.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.*;


public class Img extends JComponent{
    public Img(){
        super();
    }

    @Override
    public void paintComponent(Graphics pinceau){
        Graphics pinpin=pinceau.create();
        try {
            FileInputStream img=new FileInputStream(new File("./image.bin"));
            for (int i = 0; i < 1024; i++) {
                for (int j = 0; j < 768; j++) {        
                    int r=img.read();
                    int g=img.read();
                    int b=img.read();
                    pinpin.setColor(new Color(r, g, b));
                    pinpin.drawLine(i, j, i, j);
                }
            }
        } catch (IOException e) {
        System.err.println("Impossible d'ouvrir le fichier");    
        }
    }
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(1024,768);
        fenetre.add(new Img());
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}