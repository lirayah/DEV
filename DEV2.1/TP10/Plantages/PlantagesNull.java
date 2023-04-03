public class PlantagesNull {
    public static void main(String[] args) {
        String[] a=new String[2];
        a[1]=null;
        try {
            int b=a[1].length();
        } catch (NullPointerException e) {
            System.err.println("Regarde ton tableau déjà connard");
        }
    }
}
