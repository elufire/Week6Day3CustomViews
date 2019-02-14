package com.example.week6day3customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    ThreesCompound threesCompound;
    CustomEditText customEditText;
    Rectangle rectangle;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threesCompound = findViewById(R.id.threesCompound);
        threesCompound.setCounterTwo(count);
        rectangle = findViewById(R.id.custRectangle);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fly);
        rectangle.startAnimation(animation1);
        //customEditText = findViewById(R.id.customEditText);
    }

    public void onClick(View view) {
        count++;
        threesCompound.setCounterTwo(count);
    }
}
