package com.example.grille;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Controller implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private View vue;

    public Controller(View vue) {
        this.vue = vue;
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {
        this.vue.setBackgroundColor(vue.getResources().getColor(R.color.clong));
    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
        this.vue.setBackgroundColor(vue.getResources().getColor(R.color.white));
        return true;
    }




    @Override
    public boolean onSingleTapConfirmed(@NonNull MotionEvent e) {
        this.vue.setBackgroundColor(vue.getResources().getColor(R.color.ccourt));
        return true;
    }

    @Override
    public boolean onDoubleTap(@NonNull MotionEvent e) {
        this.vue.setBackgroundColor(vue.getResources().getColor(R.color.doubleTap));
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(@NonNull MotionEvent e) {
        return true;
    }


}
