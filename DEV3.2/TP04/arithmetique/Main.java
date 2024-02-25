import java.util.Deque;
import java.util.LinkedList;

public class Main {
    private Deque<Float> liste;

    public Main(){
        this.liste=new LinkedList<>();
    }

    public float calcul(String[] args) {
        for (String arg : args){
            try {
                this.liste.push(Float.parseFloat(arg));
            } catch (NumberFormatException z){
                switch (arg){
                    case "+":
                        float a=this.liste.pop();
                        float b=this.liste.pop();
                        this.liste.push(a+b);
                        break;

                    case "-":
                        float c=this.liste.pop();
                        float d=this.liste.pop();
                        this.liste.push(d-c);
                        break;

                    case "/":
                        float e=this.liste.pop();
                        float f=this.liste.pop();
                        this.liste.push(f/e);
                        break;

                    case "x":
                        float g=this.liste.pop();
                        float h=this.liste.pop();
                        this.liste.push(g*h);
                        break;

                    default:
                        System.out.println("wsh ma couille tu fais quoi?");
                }
            }
        }

        return this.liste.pop();
    }

    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.calcul(args));
    }
}