import java.awt.*;
import javax.swing.*;

public class Ecriture extends JComponent{
    private JPanel car;
    public Ecriture(JPanel kase){
        this.car=kase;
    }
    //Θ∩

    @Override
    public void paintComponent(Graphics pinceau){
        JLabel lab = new JLabel("Θ");
        this.car.add(lab);
    }
}
