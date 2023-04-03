public class PlantagesArithmetic {
    public static void main(String[] args) {
        try {
            int n=3/0;
        } catch (ArithmeticException e) {
            System.err.println("Bah frérot?");
        }
    }
}