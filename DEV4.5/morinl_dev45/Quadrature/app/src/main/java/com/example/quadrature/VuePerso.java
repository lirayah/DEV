package com.example.quadrature;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class VuePerso extends View {
    private Paint paint;
    public VuePerso(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        this.paint.setColor(0xFF000000);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(3f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float radius;
        float height = getHeight();
        float width = getWidth();
        if (height>=width)
            radius = getWidth()/2;
        else radius = getHeight()/2;
        // Obligé de prendre les valeurs ici car valent 0 dans le constructeur
        canvas.drawCircle(width/2,height/2,radius,paint);
    }
}
