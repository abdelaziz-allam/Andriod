package com.ts.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_show_images = findViewById(R.id.btn_show_images);

        button_show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,images_animations.class);
                startActivity(intent);
            }
        });
    }

    public void showAnimationColoredActivity(View view) {
        Intent intent = new Intent(MainActivity.this,ColoredAnimation.class);
        startActivity(intent);
    }

    public void showOtherAnimationActivity(View view) {
        Intent intent = new Intent(MainActivity.this,OtherAnimations.class);
        startActivity(intent);
    }
}
