package com.example.arcenciel;

import android.view.MotionEvent;
import android.view.View;

public class ControllerVue implements View.OnTouchListener{
    private Couleurs couleurs;
    public ControllerVue(Couleurs couleurs) {
        this.couleurs = couleurs;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
            couleurs.nextCouleur();
            v.invalidate();
        }
        return true;
    }
}
