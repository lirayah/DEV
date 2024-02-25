import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Couleur extends JFrame {
    private JList<String> liste;
    private Map<String,Integer[]> dico;



    public Couleur() {
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
//                    String[] couleurs = ligne.split("\\s+");
//                    Integer[] tab = new Integer[3];
//                    for (int i = 0; i < 3; i++) {
//                        tab[i] = Integer.parseInt(couleurs[i]);
//                    }
//
//                    String nom = "";
//                    for (int i = 3; i < couleurs.length; i++) {
//                        nom = nom + couleurs[i] + " ";
//                    }
//                    nom = nom.substring(0, nom.length() - 1);
//                    this.dico.put(nom,tab);
//                    String[] nombre = ligne.split("\\s+");
//                    for (int i = 0; i < nombre.length; i++) {
//                        System.out.println(nombre[i]);
//                    }
                    Integer[] tab = new Integer[3];
                    for (int i = 0; i < 3; i++) {
                        String sousChaine = ligne.substring(i*4,i*4+3);
//                        tab[i] = Integer.parseInt(sousChaine);
                        System.out.println(sousChaine);
                    }
                    System.out.println(ligne.substring(13));
                    break;
                }

//                this.add(liste);
//                JPanel pano = new JPanel();
//                Color color = new Color(this.dico.get("ghost white")[0],this.dico.get("ghost white")[1],this.dico.get("ghost white")[2]);
//                pano.setBackground(color);
//                this.add(pano);
//
//
//
//                this.setVisible(true);
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

    public static void main(String[] args) {
        Couleur couleur = new Couleur();
    }
}
