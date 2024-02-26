import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ListeCouleur extends JFrame {
    private Map<String,Color> dico;

    public ListeCouleur() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setLayout(new GridLayout(1,2));

        this.dico = new HashMap<>();
        String ligne;
        try {
            BufferedReader lecture = new BufferedReader(
                    new FileReader("C:/Users/Lirayah/Documents/BUT/DEV/DEV3.2/TP06/Couleurs/rgb.txt"));
            try {
                while((ligne = lecture.readLine()) != null) {
                    String[] couleurs = ligne.trim().split("\\s+",4);
                    Integer[] tab = new Integer[3];
                    for (int i = 0; i < 3; i++) {
                        tab[i] = Integer.parseInt(couleurs[i]);
                    }
                    Color color = new Color(tab[0],tab[1],tab[2]);
                    this.dico.put(couleurs[3],color);
                }
            } catch(IOException e) {
                System.err.println("Erreur de lecture dans rgb.txt !");
            }
            try {
                lecture.close();
            } catch(IOException e) {
                System.err.println("Erreur de fermeture de rgb.txt !");
            }
        } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture de rgb.txt !");
        }
    }

    public JList<String> getDico() {
        return dico;
    }
}
