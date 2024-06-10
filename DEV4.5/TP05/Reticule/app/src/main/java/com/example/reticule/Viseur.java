package com.example.reticule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Viseur extends View {
    private Paint paint;
    private float x;
    private float y;

    @SuppressLint("ClickableViewAccessibility")
    public Viseur(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Controller controller = new Controller();
        this.setOnTouchListener(controller);
        this.paint = new Paint();
        this.paint.setColor(0xFFFC8803);
        this.paint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.getX(),this.getY(),100,this.paint);
        canvas.drawLine(this.getX()-130,this.getY(),this.getX()+130,this.getY(),this.paint);
        canvas.drawLine(this.getX(),this.getY()-130,this.getX(),this.getY()+130,this.paint);
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }
}
