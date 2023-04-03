public class PlantagesNumber {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("En hexadécimal : " + Integer.toHexString(n));
        } catch(NumberFormatException e1) {
            System.err.println('\"' + args[0] + "\" n'est pas un entier !");
        }
    }
}