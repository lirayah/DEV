package com.example.ombrage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomView extends View {
    private Rect rect;
    private Paint paint;

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();
        int color = 0x77000000;
        paint.setColor(color);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        this.rect = new Rect(getPaddingLeft(),getPaddingTop(),this.getWidth()-getPaddingRight(),this.getHeight()-getPaddingBottom());
        canvas.drawRect(rect,paint);
    }
}
