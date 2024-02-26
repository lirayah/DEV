import java.util.LinkedList;
import java.util.List;

public class Tri {
    public static void main(String[] args) {
        Arbre arbre = new Arbre();
        for (String arg : args){
            arbre.put(Float.parseFloat(arg));
        }
        arbre.affichage();
    }
}
