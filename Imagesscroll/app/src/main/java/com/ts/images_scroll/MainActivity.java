package com.ts.images_scroll;

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

        Button btn_show_images = findViewById(R.id.btn_show_images);
        Button btn_show_slider = findViewById(R.id.btn_scroll_images);

        btn_show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageIntent = new Intent(MainActivity.this,ImagesActivity.class);
                startActivity(imageIntent);
            }
        });

        btn_show_slider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sliderIntent = new Intent(MainActivity.this,SliderActivity.class);
                startActivity(sliderIntent);
            }
        });
    }
}
