import java.util.ArrayList;
import java.util.List;

/**
 * Liste
 */
public class Liste {

    public static void main(String[] args) {
        List<Integer> liste1=new ArrayList<>();
        liste1.add(1);
        // liste1.add(1.0); Marche pas -> double cannot be converted to Integer
        // liste1.add(1L); Marche pas -> long cannot be converted to Integer

        List<Float> liste2=new ArrayList<>();

        // liste2.add(2); Marche pas -> int cannot be converted to Float
        // liste2.add(2.0); Marche pas -> double cannot be converted to Float
        // liste2.add(2L); Marche pas -> long cannot be converted to Float

        List<Number> liste3=new ArrayList<>();
        liste3.add(3);
        liste3.add(3.0);
        liste3.add(4L);
        // Pour la méthode addAll -> marchera que pour ajouter dans Number car Integer et Float sont des extends de Number
    }
}