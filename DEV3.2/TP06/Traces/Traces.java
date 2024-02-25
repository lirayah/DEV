import java.util.Map;

public class Traces {

    public static void main(String[] args) {
        Map<Thread,StackTraceElement[]> dico = Thread.getAllStackTraces();

        for (Thread cle : dico.keySet()) {
            System.out.println(cle.getName());
            for (StackTraceElement trace : dico.get(cle)){
                System.out.println("\t"+ trace);
            }
        }
    }
}
