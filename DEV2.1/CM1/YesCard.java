/*Lionel MORIN Groupe 1 */

public class YesCard {
    private int num;
    private int credit;
    private int creditTot;

    public YesCard(int numero){
        this.num=numero;
        this.credit=10;
    }

    @Override
    public String toString(){
        return "Numero de carte : "+this.num+"\nCrédit(s) actuel(s): "+this.voir()+"\nCrédit(s) totau(x): "+this.creditTot;
    }

    public int voir(){
        return this.credit;
    }

    public int crediter() {
        this.creditTot++;
        return this.credit;
    }

    public int vider(){
        return this.credit;
    }
}
