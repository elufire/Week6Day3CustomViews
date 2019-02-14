package com.example.week6day3customviews;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThreesCompound extends LinearLayout {
    TextView tvCounterOne;
    TextView tvCounterTwo;
    TextView tvCounterThree;
    public ThreesCompound(Context context) {
        this(context, null);
    }

    public ThreesCompound(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThreesCompound(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ThreesCompound(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.threes_compound, this);
        tvCounterOne = findViewById(R.id.tvCounter);
        tvCounterTwo = findViewById(R.id.tvCounter2);
        tvCounterThree = findViewById(R.id.tvCounter3);
    }


    public void setCounterTwo(int i){
        tvCounterTwo.setText(String.valueOf(i));
    }


}
