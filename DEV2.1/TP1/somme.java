public class somme {
    public static void main(String[] args) {
        int somme=0;
        for (int i = 0; i < args.length; i++) {
            int a= Integer.parseInt(args[i]);
            somme=somme+a;
        }
        System.out.println(somme);
    }
}
