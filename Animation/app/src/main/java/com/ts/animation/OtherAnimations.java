package com.ts.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class OtherAnimations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_animations);



    }

    public void scaleAnimation (View view) {
        Animation animation = AnimationUtils.loadAnimation(OtherAnimations.this,R.anim.scale);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.startAnimation(animation);
    }


    public void fadeAnimation (View view) {
        Animation animation = AnimationUtils.loadAnimation(OtherAnimations.this,R.anim.fade);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.startAnimation(animation);
    }
}
