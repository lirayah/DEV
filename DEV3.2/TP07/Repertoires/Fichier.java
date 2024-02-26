import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Fichier extends File{
    private List<Fichier> arbre;
    private int nbEnfants;

    public Fichier(String name) {
        super(name);
        this.arbre = new LinkedList<>();
        File[] enfants = this.listFiles();
        this.nbEnfants = 0;
        if (enfants != null) {
            this.nbEnfants = enfants.length;
            for (File enfant : enfants){
                try {
                    Fichier fichier = new Fichier(enfant.getCanonicalPath());
                    this.arbre.add(fichier);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void afficher(int i){
        for (Fichier fichier : this.arbre){
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            System.out.print(fichier.getName());
            if (fichier.getNbEnfants() > 0) {
                fichier.afficher(i+1);
            }
        }
    }

    public int getNbEnfants(){
        return this.nbEnfants;
    }
}
