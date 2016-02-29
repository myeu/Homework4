package com.marisayeung.homework4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by marisayeung.
 */
public class PaintView extends View {

    private ArrayList<Point> points = new ArrayList<Point>();
    private Paint paint = new Paint();

    public PaintView(Context context) {
        super(context);
        initialize();
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    private void initialize() {
        paint.setColor(Color.RED);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Point point = new Point();
        point.x = event.getX();
        point.y = event.getY();

        points.add(point);

        invalidate();

        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (Point point : points) {
            canvas.drawCircle(point.x, point.y, 5, paint);
        }
        super.onDraw(canvas);
    }

    public void clearPoints() {

        //points.add(new Point((float) 25, (float) 25));
        points.clear();
        invalidate();
    }
}