import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Modif {
    private JPanel[] tabnel;

    public Modif(JPanel[] va){
        this.tabnel=va;
    }

    public void modifier(){
    Detect cli = new Detect(this.tabnel);
        for (JPanel lab : this.tabnel) {
            lab.setOpaque(true);
            lab.addMouseListener(cli);
        }
    }
}
