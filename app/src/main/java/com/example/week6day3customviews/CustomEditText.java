package com.example.week6day3customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {
    public CustomEditText(Context context) {
        this(context, null);
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                checkColor();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                checkColor();
            }

            @Override
            public void afterTextChanged(Editable s) {
                checkColor();
            }
        });
    }

    public void checkColor()
    {
        if(getText().toString().length() < 8)
        {
            setTextColor(Color.RED);
        }
        else
        {
            setTextColor(Color.BLACK);
        }
    }

}

