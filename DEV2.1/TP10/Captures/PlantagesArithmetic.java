/**
 * 
 */

public class PlantagesArithmetic {
    public PlantagesArithmetic(){
        
    }
    public void test() {
        try {
            int n=3/0;
        } catch (ArithmeticException e) {
            System.err.println("Bah frérot?");
        }
    }
}