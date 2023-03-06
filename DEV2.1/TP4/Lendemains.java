package TP4;

public class Lendemains{
    private int annee;
    private int mois;
    private int jour;
    
    public Lendemains(int a, int m, int j){
        this.annee=a;
        this.mois=m;
        this.jour=j;
    }

    public void jourApr(){
        this.jour++;
        if(this.jour==29 && this.mois==2){
            this.jour=1;
            this.mois++;
        }
        if(this.jour==31 && this.mois%2==0 && this.mois<8){
            this.jour=1;
            this.mois++;
        }
        if(this.jour==31 && this.mois%2==1 && this.mois>8){
            this.jour=1;
            this.mois++;
        }
        if(this.jour==32 && this.mois%2==1 && this.mois<8){
            this.jour=1;
            this.mois++;
        }
        if(this.jour==32 && this.mois%2==0 && this.mois>8){
            this.jour=1;
            this.mois++;
        }
        if(this.mois==12){
            this.jour=1;
            this.mois=1;
            this.annee++;
        }
    }
    
    public void Compare(Lendemains i,Lendemains j){
        if (i.annee == j.annee && i.mois == j.mois && i.jour == j.jour) {
            System.out.println("C'est les memes mon con");
        }
        else{
            System.out.println("T NUL");
        }
    }

    @Override
    public String toString() {
        return "Le Lendemain est: " + Integer.toString(this.annee) + "-" + Integer.toString(this.mois) + "-" + Integer.toString(this.jour);
    }
}

