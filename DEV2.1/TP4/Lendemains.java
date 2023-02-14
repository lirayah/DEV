package TP4;

public class Lendemains {
    private int annee;
    private int mois;
    private int jour;
    
    public Lendemains(){
        this.annee=2023;
        this.mois=02;
        this.jour=14;
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
    public String toString() {
        return Integer.toString(this.annee) + "-" + Integer.toString(this.mois) + "-" + Integer.toString(this.jour);
    }
}

