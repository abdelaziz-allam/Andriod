package com.ts.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ColoredAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colored_animation);

        RelativeLayout parent  = findViewById(R.id.animation_parent);

        AnimationDrawable animationDrawable = (AnimationDrawable) parent.getBackground();

        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);

        animationDrawable.start();
    }
}
