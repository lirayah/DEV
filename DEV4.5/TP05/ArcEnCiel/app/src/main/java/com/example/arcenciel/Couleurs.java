package com.example.arcenciel;

import java.util.HashMap;
import java.util.Map;

public class Couleurs {
    int[] tab;
    boolean[] actif;
    int nb;
    int pos;
//    private Map<Integer,Boolean> dico;

    public Couleurs() {
        this.tab = new int[]{0xFFFF0000,
                0xFFFF6F00, 0xFFBAA90B,
                0XFF32A308, 0XFF144463,
                0xFF0C0C85, 0xFF600C85};
        this.actif = new boolean[]{false,true,true,true,true,true,true};
//        this.dico = new HashMap<Integer, Boolean>();
//        dico.put(0xFFFF0000, true);
//        dico.put(0xFFFF6F00, true);
//        dico.put(0xFFBAA90B, true);
//        dico.put(0XFF32A308, true);
//        dico.put(0XFF144463, true);
//        dico.put(0xFF0C0C85, true);
//        dico.put(0xFF600C85, true);
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
        if (!actif[pos]) {
            nextCouleur();
        }
        return this.tab[pos];
    }

    public boolean[] getActif() {
        return actif;
    }

    public void setActif(boolean[] actif) {
        this.actif = actif;
    }
}
