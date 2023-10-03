import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton implements ActionListener{
    private Victoire v;
    public Bouton(Victoire vi){
        super();
        this.v=vi;
    }

    public void actionPerformed(ActionEvent e){
        this.v.oui();
    }
}
