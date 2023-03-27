package CM1B;

import javax.swing.JFrame;


public class Fermeture {
    public static void main(String[] args) {
        JFrame fenetre=new JFrame();
        fenetre.setSize(300,300);
        fenetre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        Variantes test = new Variantes();
        ActiFenetre oui = new ActiFenetre(test);

        fenetre.addWindowListener(oui);

        while(!test.checkTrue()){
            fenetre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            fenetre.setVisible(true);
        }
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//utiliser le dispose