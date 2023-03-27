package CM1B;

import javax.swing.*;

public class Tuile {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tuile");
        f.setLocation(150, 150);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        TileBackground tb = new TileBackground(150, "./CM1B/tuile.jpg");
        f.add(tb);
    }
}
