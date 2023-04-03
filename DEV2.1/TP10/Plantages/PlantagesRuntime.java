public class PlantagesRuntime {
    public static void main(String[] args) {
        try {
            int n=3/0;
        } catch (RuntimeException e) {
            System.err.println("oui");
        }
    }
}
