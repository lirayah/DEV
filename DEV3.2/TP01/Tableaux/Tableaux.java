import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Tableaux {
    public static void main(String[] args) {
        // a)
        System.out.println(Arrays.toString(args));
        // b)
        String[] a=Arrays.copyOf(args, 5);
        System.out.println(Arrays.toString(a));
        // c)
        Comparator<Object> c=Collator.getInstance();
        Arrays.sort(args, c);
        System.out.println(Arrays.toString(args));
    }  
}
