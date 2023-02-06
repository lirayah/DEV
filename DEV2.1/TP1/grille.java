public class grille {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        if(a>0){
            for (int j = 0; j < a; j++) {
                System.out.print("+-");
            }
            System.out.print("+");
            System.out.println();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("| ");
                }
                System.out.print("|");
                System.out.println();
                for (int j = 0; j < a; j++) {
                    System.out.print("+-");
                }
                System.out.print("+");
                System.out.println();
            }
        }
        else{
            System.out.println("Ah le nul!");
        }
    }
}