package fr.iut_fbleau.apl41.couleurs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Disque extends View {
    private Paint paint;

    public Disque(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.paint = new Paint();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/2,paint);
    }

    public void setPaintColor(int color) {
        this.paint.setColor(color);
    }
}
