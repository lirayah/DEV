public class NoeudTri {
    private Float valeur;
    private NoeudTri lower;
    private NoeudTri higher;

    public NoeudTri(Float valeur) {
        this.valeur = valeur;
    }

    public Float getValeur() {
        return valeur;
    }

    public NoeudTri getLower() {
        return lower;
    }

    public NoeudTri getHigher() {
        return higher;
    }

    public void setValeur(Float valeur) {
        this.valeur = valeur;
    }

    public void setLower(NoeudTri lower) {
        this.lower = lower;
    }

    public void setHigher(NoeudTri higher) {
        this.higher = higher;
    }

    public void afficher(){
        if (this.lower != null){
            this.lower.afficher();
        }
        System.out.println(" "+ valeur+" ");
        if (this.higher != null){
            this.higher.afficher();
        }
    }
}
