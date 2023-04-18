import java.io.*;

public class Ouverture {

    public int recup_nb(int repet) {
        int r=0;
        try{
            FileInputStream fis = new FileInputStream("./fichiers/test.bin");
            
            try{
                for (int i = 0; i <= repet; i++) {
                    r = fis.read();
                }
            } catch(IOException e) {
                System.err.println("Erreur de lecture");
            }
            
            try {
                fis.close();   
            } catch(IOException e) {
                System.err.println("Erreur de fermeture");
            }
        } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture");
        }
        return r;
    }


    public int continuable(int repet){
        int gros=0;
        try{
            FileInputStream fis = new FileInputStream("./fichiers/petit.lab");
            //Θ∩
            try{
                for (int i = 0; i <= repet; i++) {
                    fis.read();
                }
                gros=fis.available();
            } catch(IOException e) {
                System.err.println("Erreur de lecture");
            }            
            try {
                fis.close();
            } catch(IOException e) {
                System.err.println("Erreur de fermeture");
            }
        } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture");
        }
        return gros;
    }
}