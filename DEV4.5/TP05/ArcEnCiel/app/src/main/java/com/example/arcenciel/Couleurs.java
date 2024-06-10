package com.example.arcenciel;

public class Couleurs {
    int[] tab;
    boolean[] actif;
    int nb;
    int pos;

    public Couleurs() {
        this.tab = new int[]{0xFFFF0000,
                0xFFFF6F00, 0xFFBAA90B,
                0XFF32A308, 0XFF144463,
                0xFF0C0C85, 0xFF600C85};
        this.actif = new boolean[]{true,true,true,true,true,true,true};
        this.nb = this.tab.length;
        this.pos = 0;
    }

    public void nextCouleur(){
        pos = (pos + 1) % 7;
        if (!actif[pos]) {
            nextCouleur();
        }
    }

    public int getCouleur(){
        return this.tab[pos];
    }

    public boolean[] getActif() {
        return actif;
    }

    public void setActif(boolean[] actif) {
        this.actif = actif;
    }
}
