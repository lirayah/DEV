import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RetrieveNumber implements ActionListener{
    private String a;
    private int i;
    public RetrieveNumber(int b){
        this.i=b;
    }

    public void actionPerformed(ActionEvent e) {
        this.a=e.getActionCommand();
        this.i=Integer.parseInt(a);
    }
}
