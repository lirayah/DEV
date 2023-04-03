import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainPlay {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200,270);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout g = new GridLayout(9,1);
        f.setLayout(g);

        JLabel[] liste = {
        new JLabel("Speak to me / Breathe"),
        new JLabel("On the run"),
        new JLabel("Time"),
        new JLabel("The Great Gig In The Sky"),
        new JLabel("Money"),
        new JLabel("Us And Them"),
        new JLabel("Any Color You Like"),
        new JLabel("Brain Dammage"),
        new JLabel("Eclipse")
        };

        Detect lionel = new Detect(liste);
        for (JLabel musique : liste){
            musique.setOpaque(true);
            musique.setBackground(Color.WHITE);
            musique.addMouseListener(lionel);
            f.add(musique);
        }
        f.setVisible(true);
    }
}