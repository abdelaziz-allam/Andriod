package com.ts.images_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
import java.util.stream.IntStream;

public class SliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);


        Button nextBtn = findViewById(R.id.btn_slide);



        nextBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                ImageView slider = findViewById(R.id.img_slider);

                slider.setImageResource(getRandomImage());
            }
        });
    }

    private int getRandomImage() {
        final  int [] images = {0,R.drawable.img3,R.drawable.img2,R.drawable.img4};
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(images.length);
            if(rand !=0) break;
        }
        return  images[rand];
    }
}
