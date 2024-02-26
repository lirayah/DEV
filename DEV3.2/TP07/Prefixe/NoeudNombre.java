public class NoeudNombre extends Noeud{
    private int valeur;
    public NoeudNombre(int valeur) {
        super();
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public void affichePrefixe() {
        System.out.print(this.valeur +  " ");
    }
}
