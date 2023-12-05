/**
 * Fibonacci
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n==0) {
            return 0;
        } else if(n==1){
            return 1;
        } else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a>1) {
            System.out.println(fibonacci(a));    
        }
    }
}