/**
 * Appel
 */
public class Appel {
    public static long factorielle(int a,int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");   
        }
        System.out.println(a);

        if((a==1) || (a==0)){
            // Thread.dumpStack();
            for (int i = 0; i < indent; i++) {
                System.out.print("    ");
            }
            System.out.println(1);
            return 1;
        }
        long b=factorielle(a-1,indent+1)*a;
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");   
        }
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("\n"+a+"! = "+factorielle(a,0));
    }
}