package com.example.grille;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class Toucher implements View.OnTouchListener {
    private Controller controller;
    private GestureDetector gestureDetector;

    public Toucher(View v) {
        this.controller = new Controller(v);
        this.gestureDetector = new GestureDetector(this.controller);
        gestureDetector.setOnDoubleTapListener(this.controller);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return this.gestureDetector.onTouchEvent(event);
    }
}
