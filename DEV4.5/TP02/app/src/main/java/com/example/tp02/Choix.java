package com.example.tp02;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Choix extends View {
    private Paint p1;
    private RadioGroup rg;
    private Path path1;

    public Choix(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.p1 = new Paint();
//        this.p1.setStyle(Paint.Style.STROKE); 

        this.path1 = new Path();
        path1.moveTo(0,0);
        path1.lineTo(180,0);
        path1.lineTo(90,180);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        this.rg = getRootView().findViewById(R.id.uderzo);
        super.onDraw(canvas);
        if (this.rg.getCheckedRadioButtonId() == R.id.triangle) {
            canvas.drawPath(path1,p1);
        } else if (this.rg.getCheckedRadioButtonId() == R.id.carre) {
            canvas.drawCircle(3*this.getHeight()/5f,4*this.getWidth()/2f,this.getWidth()/3f,this.p1);
        } else if (this.rg.getCheckedRadioButtonId() == R.id.croix) {
            canvas.drawLine(0f,0f,180f,0f,p1);
        } else if (this.rg.getCheckedRadioButtonId() == R.id.rond) {
            canvas.drawCircle(this.getWidth()/2f,this.getHeight()/2f,this.getWidth()/3f,p1);
        }
    }
}
