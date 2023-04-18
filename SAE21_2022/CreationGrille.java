import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CreationGrille {
    private int size;
    public CreationGrille(int taille){
        this.size=taille;
    }

    //Créé une grille vide modifiable
    public JPanel[] CreerGrille(){
        JPanel[] tabnel = new JPanel[this.size*this.size];
        for (int i = 0; i < tabnel.length; i++) {
            tabnel[i]=new JPanel();
            Border lineborder = BorderFactory.createLineBorder(Color.black, 1); 
            tabnel[i].setBorder(lineborder);
            tabnel[i].setBackground(Color.WHITE);
        }

        int[][] casint = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                casint[i][j]=0;
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
