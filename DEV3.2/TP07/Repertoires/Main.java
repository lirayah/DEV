public class Main {
    public static void main(String[] args) {
//        Fichier base = new Fichier("./DEV3.2/TP07/Repertoires");
        Fichier base = new Fichier(args[0]);
        base.afficher(0);
        System.out.println();
    }
}
