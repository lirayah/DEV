import java.util.LinkedList;
import java.util.Queue;

public class TriFusion {

    // Méthode pour séparer la file en deux moitiés égales
    private static <T extends Comparable<T>> void scinder(Queue<T> file, Queue<T> file1, Queue<T> file2) {
        int halfSize = file.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            file1.offer(file.poll());
        }

        while (!file.isEmpty()) {
            file2.offer(file.poll());
        }
    }

    // Méthode pour fusionner deux files triées en une seule file triée
    private static <T extends Comparable<T>> void fusionner(Queue<T> file, Queue<T> file1, Queue<T> file2) {
        while (!file1.isEmpty() && !file2.isEmpty()) {
            if (file1.peek().compareTo(file2.peek()) <= 0) {
                file.offer(file1.poll());
            } else {
                file.offer(file2.poll());
            }
        }

        while (!file1.isEmpty()) {
            file.offer(file1.poll());
        }

        while (!file2.isEmpty()) {
            file.offer(file2.poll());
        }
    }

    // Méthode principale pour trier la file en utilisant le tri fusion
    public static <T extends Comparable<T>> void trier(Queue<T> file) {
        if (file.size() <= 1) {
            return; // La file est déjà triée
        }

        Queue<T> file1 = new LinkedList<>();
        Queue<T> file2 = new LinkedList<>();

        // Phase de séparation
        scinder(file, file1, file2);

        // Phase de tri (appels récursifs)
        trier(file1);
        trier(file2);

        // Phase de fusion
        fusionner(file, file1, file2);
    }

    public static void main(String[] args) {
        Queue<Double> file = new LinkedList<>();

        // Ajouter les valeurs de la ligne de commande à la file
        for (String arg : args) {
            file.offer(Double.parseDouble(arg));
        }

        // Trier la file
        trier(file);

        // Afficher les valeurs triées
        for (Double valeur : file) {
            System.out.print(valeur + " ");
        }
    }
}