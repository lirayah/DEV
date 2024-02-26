import java.util.Deque;
import java.util.LinkedList;

public class Prefixe {
    private Deque<Noeud> liste;

    public Prefixe() {
        this.liste = new LinkedList<>();
    }

    public void creation(String[] args){
        for (String argu : args) {
            try {
                this.liste.push(new NoeudNombre(Integer.parseInt(argu)));
            } catch (NumberFormatException e) {
                if (!this.liste.isEmpty()) {
                    Noeud noeud = this.liste.pop();
                    if (!this.liste.isEmpty()){
                        this.liste.push(new NoeudOperation(argu, noeud, this.liste.pop()));
                    }
                }
                else
                    System.out.println("pas la bonne expression");
            }
        }
    }

    public void affichage(){
        Noeud node = this.liste.pop();
        System.out.println("= ");
        node.affichePrefixe();
    }
}
