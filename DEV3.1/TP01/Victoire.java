import javax.swing.JFrame;

public class Victoire extends JFrame{
    public Victoire(){
        super();
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Victoire v = new Victoire();
    }
}
