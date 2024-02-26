import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class VueCouleur extends JFrame {
    private Map<String,Color> dico;
    private JList<String> liste;
    public VueCouleur(Map<String,Color> dico) {
        super();
        this.dico = dico;
        this.liste = new JList<>();
        if (this.dico != null) {
            for (String nom : this.dico.keySet()){
                this.liste.add();
            }
        }
    }
}
