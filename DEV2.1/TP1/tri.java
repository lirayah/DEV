import java.util.Arrays;

public class tri {
    public static void main(String[] args) {
        int[] tab=new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int a= Integer.parseInt(args[i]);
            tab[i]=a;
        }
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
