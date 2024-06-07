package com.example.tp04;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

import java.util.Random;

public class Cercle {
    private Paint color;
    private PointF centre;
    public Cercle(PointF centre) {
        this.centre = centre;
        Random r = new Random();
        this.color = new Paint();
        this.color.setARGB(255,r.nextInt()%256,r.nextInt()%256,r.nextInt()%256);
    }

    public Paint getColor() {
        return color;
    }

    public PointF getCentre() {
        return centre;
    }

    public void setCentre(PointF centre) {
        this.centre = centre;
    }
}
