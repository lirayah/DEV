package com.example.arcenciel;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Vue extends View {
    private Couleurs couleurs;
    private ControllerBouton cb;

    public Vue(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.couleurs = new Couleurs();
        this.setBackgroundColor(couleurs.getCouleur());
        ControllerVue cv = new ControllerVue(couleurs);
        setOnTouchListener(cv);

    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        this.setBackgroundColor(couleurs.getCouleur());
    }

    public Couleurs getModel() {
        return couleurs;
    }
}
