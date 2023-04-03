/*Lionel MORIN Groupe 1 */

public class Deduction {
    private int num;
    private int credit;
    private int creditTot;
    public Deduction(int numero){
        this.num=numero;
    }

    @Override
    public String toString(){
        return "Numero de carte : "+this.num+"\nCrédit(s) actuel(s): "+this.voir()+"\nCrédit(s) totau(x): "+this.creditTot;
    }

    public int voir(){
        return this.credit;
    }

    public int crediter() {
        creditTot++;
        if(this.credit<10){
            return this.credit++;
        }
        else{
            return this.vider();
        }
    }

    public int vider(){
        return this.credit=0;
    }
}
