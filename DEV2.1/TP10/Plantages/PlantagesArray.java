public class PlantagesArray {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e2) {
            System.err.println("Pas d'argument à convertir !");
        }
    }
}