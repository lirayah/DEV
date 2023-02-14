package TP4;

public class Date {
    private int annee;
    private int mois;
    private int jour;
    
    public Date(){
        this.annee=2023;
        this.mois=02;
        this.jour=14;
    }

    public String toString() {
        return Integer.toString(this.annee) + "-" + Integer.toString(this.mois) + "-" + Integer.toString(this.jour);
    }
}
