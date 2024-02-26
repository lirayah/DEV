public class NoeudOperation extends Noeud{
    private String operation;
    private Noeud valeur1;
    private Noeud valeur2;

    public NoeudOperation(String operation, Noeud valeur1, Noeud valeur2) {
        this.operation = operation;
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
    }
    @Override
    public void affichePrefixe() {
        System.out.print(this.operation + " ");
        this.valeur2.affichePrefixe();
        this.valeur1.affichePrefixe();
    }
}
