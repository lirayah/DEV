import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChargementGrille {
    private int size;
    public ChargementGrille(int taille){
        this.size=taille;
    }

    //Charge une grille depuis un fichier
    public JPanel[] ChargerGrille(){
        Ouverture op = new Ouverture();
        int repet=1;

        int xthe=op.recup_nb(repet);
        repet++;
        int ythe=op.recup_nb(repet);
        repet++;

        int xarr=op.recup_nb(repet);
        repet++;
        int yarr=op.recup_nb(repet);
        repet++;

        int vroum=(op.continuable(repet))+1;
        int[][] tabint = new int[vroum][8];
        for (int i = 0; i < vroum; i++) {
            int vi=op.recup_nb(repet);
            repet++;
            for (int j = 7; j >= 0; j--) {
                tabint[i][j]=vi&1;
                vi=vi >> 1;
            }
        }

        int l=0;
        int c=0;
        int[][] casint = new int[this.size][this.size];
        for (int[] col : tabint) {
            for (int nb : col){
                casint[l][c]=nb;
                l++;
                if (l==this.size){
                    l=0;
                    c++;
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

                if (i==xthe && j==ythe){
                    JLabel lab = new JLabel("Θ");
                    tabnel[kaze].add(lab);
                }
                if (i==xarr && j==yarr){
                    JLabel lab = new JLabel("∩");
                    tabnel[kaze].add(lab);
                }
                kaze++;
            }
        }
        return tabnel;
    }
}
