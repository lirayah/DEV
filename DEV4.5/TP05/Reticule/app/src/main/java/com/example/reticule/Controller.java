package com.example.reticule;


import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

public class Controller implements View.OnTouchListener {
    private PointF pf;

    public Controller() {
        this.pf = new PointF();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        v = (Viseur) v;
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN){
            this.pf.set(event.getX(0)-v.getX(),event.getY()-v.getY());
        } else if (event.getActionMasked() == MotionEvent.ACTION_MOVE) {
            v.setX(event.getX(0)-pf.x);
            v.setY(event.getY(0)-pf.y);
            v.invalidate();
        }
        return true;
    }
}
