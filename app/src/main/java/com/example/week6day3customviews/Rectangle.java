package com.example.week6day3customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Rectangle extends View {
    int top;
    int bottom;
    int left;
    int right;
    int fillColor;
//    public Rectangle(Context context) {
//
//        super(context);
//    }

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomRectangle);
        top = typedArray.getInt(R.styleable.CustomRectangle_top, 4);
        bottom = typedArray.getInt(R.styleable.CustomRectangle_bottom, 4);
        left = typedArray.getInt(R.styleable.CustomRectangle_left, 4);
        right = typedArray.getInt(R.styleable.CustomRectangle_right, 4);
        fillColor = typedArray.getInt(R.styleable.CustomRectangle_fillColor, 0);
        typedArray.recycle();
    }

//    public Rectangle(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public Rectangle(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }


    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(fillColor);
//
//        if(top >100){
//            top = 100;
//        }
//
//        if(bottom>100){
//            bottom = 100;
//        }

        canvas.drawRect(left, top, right, bottom, paint);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int desiredWidth = 300;
        int desiredHeight = 300;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        System.out.println("WM = " + widthMode);
        System.out.println("WS = " + widthSize);
        System.out.println("HM = " + heightMode);
        System.out.println("HS = " + heightSize);
        int width;
        int height;

        if(widthMode == MeasureSpec.EXACTLY){
            width = widthSize;
        }else if(widthMode == MeasureSpec.AT_MOST){
            width = Math.min(desiredWidth, widthSize);
        }else {
            width = desiredWidth;
        }

        if(heightMode == MeasureSpec.EXACTLY){
            height = heightSize;
        }else if(heightMode == MeasureSpec.AT_MOST){
            height = Math.min(desiredHeight, heightSize);
        }else {
            height = desiredHeight;
        }

        setMeasuredDimension(width, height);
    }

    public int gettop() {
        return top;
    }

    public void settop(int top) {
        this.top = top;
    }

    public int getbottom() {
        return bottom;
    }

    public void setbottom(int bottom) {
        this.bottom = bottom;
    }

    public int getFillColor() {
        return fillColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }
}
