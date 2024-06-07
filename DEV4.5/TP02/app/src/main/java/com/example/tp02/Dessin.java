package com.example.tp02;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;

public class Dessin extends View {
    private Rect rect;
    private Paint p1;
    private Paint p2;
    private Paint p3;
    private Paint p4;
    private String str;
    private Bitmap bitmap;

    public Dessin(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.p1 = new Paint();
        p1.setColor(0xFF0000FF);
        this.p2 = new Paint();
        this.p2.setStrokeWidth(5);
        this.p2.setColor(0xFF481D87);
        p2.setStyle(Paint.Style.STROKE);
        this.p3 = new Paint();
        this.p3.setFakeBoldText(true);
        this.p3.setTextSize(100);
        this.p4 = new Paint();
        this.str = new String("Ceci est un test");
        Resources res = this.getResources();
        this.rect = new Rect();
        this.bitmap = BitmapFactory.decodeResource(res,R.drawable.cercles);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        this.rect = new Rect(250,getHeight()/9,this.getWidth()-250,getHeight()/10);
        this.rect.top = 4*this.getHeight()/5;
        this.rect.bottom = 9*getHeight()/10;
        this.rect.left = this.getWidth()/5;
        this.rect.right = 4*this.getWidth()/5;
        canvas.drawRect(this.rect,this.p1);
        canvas.drawCircle(this.getWidth()/2f,this.getHeight()/2f,this.getWidth()/3.0f,this.p2);
        canvas.drawText(str,150,getHeight()/7f,this.p3);
        canvas.drawBitmap(this.bitmap,100,30,this.p4);
    }
}
