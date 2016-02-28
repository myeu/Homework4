package com.marisayeung.homework4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marisayeung.
 */
public class PaintView extends View {

    private List<Point> points = new ArrayList<Point>();
    private Paint paint = new Paint();

    public PaintView(Context context, AttributeSet attrs, List<Point> points) {
        super(context, attrs);
        this.points = points;
    }

    public PaintView(Context context) {
        super(context);

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
        //super.onDraw(canvas);
    }
}