import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {
    private int size;
    private int mode;
    public Fenetre(){
        super();
    }

    public void CreationFenetre(int taille, int m){
        this.size=taille;
        JPanel[] tab=null;
        if (m==0){
            System.out.println("Chargement d'une grille");
            ChargementGrille grille = new ChargementGrille(this.size);
            tab = grille.ChargerGrille();
        }
        else if (m==1){
            System.out.println("Création d'une grille vide");
            CreationGrille grille = new CreationGrille(this.size);
            tab = grille.CreerGrille();
        }
        else{
            System.out.println("Généréation d'une grille aléatoire");
            GenerationGrille grille = new GenerationGrille(this.size);
            tab = grille.GenererGrille();
        }
        
        JFrame fenetre = new JFrame();
        fenetre.setSize(this.size*60,this.size*60);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gestionnaire = new GridLayout(this.size,this.size);
        fenetre.setLayout(gestionnaire);
        for (JPanel elt : tab) {
            fenetre.add(elt);
        }

        fenetre.setVisible(true);
    }
    public int FenetreMenu() {
        JFrame fenetre = new JFrame();
        fenetre.setSize(200,50);

        JPanel pano=new JPanel();
        int i;
        RetrieveNumber action=new RetrieveNumber(i);
        JTextField txt=new JTextField();
        JButton bouton=new JButton("Envoyer et fermer");


        pano.add(txt);
        pano.add(bouton);
        fenetre.add(pano);

        i=RetrieveNumber.actionPerformed()
        //TODO On place le TextField et on lit le texte via l'action listener (retrievennumber)
        fenetre.setVisible(true);
        return i;
    }
}