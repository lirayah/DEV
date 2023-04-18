import javax.swing.JOptionPane;
import java.io.*;

public class Menu {
    private File fi;
    //private Fenetre fenetre;
    public Menu(){
        this.fi=null;
    }
    //public void getOption(){
    public static void main(String[] args) {
        ChoixFichier fic=new ChoixFichier();
        File fifi;
        Fenetre fenetre=new Fenetre();
        Object[] choix={"Oui","Non"};
        int reponse = JOptionPane.showOptionDialog(null, "Voulez vous ouvrir une grille déjà existante?", 
        "oui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choix, null);
        if(reponse==0)
            fifi=fic.getOpenFichier();
        else{
            fenetre.FenetreMenu();
            //TODO récup la taille de la grille via un texte
            int reponse2 = JOptionPane.showOptionDialog(null, "Voulez vous remplir votre grille aléatoirement?", 
            "oui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choix, null);
            if(reponse2==1){
                //GenerationAleatoire.GenerationAleatoire();
                int reponse3 = JOptionPane.showOptionDialog(null, "Voulez-vous sauvegarder la grille nouvellement créée", null,
                JOptionPane.DEFAULT_OPTION, reponse2, null, args, choix);
                //TODO Ecrire dans le fichier le tableau récupéré aléatoirement
            }
            else{
                //TODO Ouvrir la fenêtre et permettre a l'utilisateur de cliquer sur les panels pour faire la grille
                //TODO Ecrire dans le fichier le tableau de la grille que l'on récupère
            }
        }
        //System.out.println(fifi);
    }
}
