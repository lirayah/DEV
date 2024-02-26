public class Arbre {
    private NoeudTri racine;

    public Arbre() {

    }

    public void put(Float arg){
//        boolean drapeau = false;
        NoeudTri noeud = new NoeudTri(arg);
        if (this.racine == null){
            this.racine = noeud;
        } else {
            NoeudTri courant = this.racine;
            while (true) {
                if (courant.getValeur() < noeud.getValeur()){
                    if (courant.getHigher() == null) {
                        courant.setHigher(noeud);
                        return;
                    } else {
                        courant = courant.getHigher();
                    }
                }
                if (courant.getValeur() > noeud.getValeur()){
                    if (courant.getLower() == null) {
                        courant.setLower(noeud);
                        return;
                    } else {
                        courant = courant.getLower();
                    }
                }
            }
        }
    }

    public void affichage(){
        this.racine.afficher();
    }
}
