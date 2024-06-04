package com.example.tp04;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

import java.util.Map;
import java.util.Objects;

public class Touche implements View.OnTouchListener {
    private Map<Integer,Cercle> dico;

    public Touche(Map<Integer,Cercle> dico) {
        this.dico = dico;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN || event.getActionMasked() == MotionEvent.ACTION_POINTER_DOWN){
            PointF pf = new PointF(event.getX(event.getActionIndex()),event.getY(event.getActionIndex()));
            Cercle c = new Cercle(pf);
            this.dico.put(event.getPointerId(event.getActionIndex()),c);
            v.invalidate();
        } else if (event.getActionMasked() == MotionEvent.ACTION_UP || event.getActionMasked() == MotionEvent.ACTION_POINTER_UP) {
            this.dico.remove(event.getPointerId(event.getActionIndex()));
            v.invalidate();
        } else if (event.getActionMasked() == MotionEvent.ACTION_CANCEL) {
            this.dico.clear();
            v.invalidate();
        } else if (event.getActionMasked() == MotionEvent.ACTION_MOVE) {
            for (int i = 0; i < event.getPointerCount(); i++) {
                PointF pf = new PointF(event.getX(i),event.getY(i));
                Objects.requireNonNull(this.dico.get(event.getPointerId(i))).setCentre(pf);
            }
            v.invalidate();
        }
        return true;
    }
}
