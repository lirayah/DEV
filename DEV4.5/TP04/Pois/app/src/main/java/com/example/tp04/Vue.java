package com.example.tp04;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;

public class Vue extends View {
    private Map<Integer,Cercle> dico;
    private Touche touche;


    public Vue(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.dico = new HashMap<>();
        this.touche = new Touche(this.dico);
        setOnTouchListener(touche);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        for (Map.Entry<Integer,Cercle> entry:
                this.dico.entrySet()) {
            canvas.drawCircle(entry.getValue().getCentre().x,entry.getValue().getCentre().y,50,entry.getValue().getColor());
        }
    }
}
