import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class GenerationGrille {
    private int size;
    public GenerationGrille(int taille){
        this.size=taille;

    }

    //Génère une grille remplie aléatoirement modifiable
    public JPanel[] GenererGrille(){
        int[][] casint = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                double f;
                f=Math.random();
                if (f<0.65){
                    casint[i][j]=0;
                } else {
                    casint[i][j]=1;
                }
            }
        }

        JPanel[] tabnel = new JPanel[this.size*this.size];
        int kaze=0;
        for (int i=0;i<this.size;i++){
            for (int j = 0; j < this.size; j++) {
                tabnel[kaze]=new JPanel();
                Border lineborder = BorderFactory.createLineBorder(Color.black, 1); 
                tabnel[kaze].setBorder(lineborder);
                if (casint[i][j]==0){
                    tabnel[kaze].setBackground(Color.WHITE);
                } else {
                    tabnel[kaze].setBackground(Color.BLACK);
                }
                kaze++;
            }
        }

        Object[] choix={"Ok"};
        int r = JOptionPane.showOptionDialog(null, "Cliquez sur une case pour changer son statut, et appuyez sur ENTREE pour passer à la suite", 
        "ok", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choix, null);
        Modif m = new Modif(tabnel);
        m.modifier();

        return tabnel;
    }
}
