package com.ts.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.layout_parent);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();
    }

    public void playAudoi(View view) {
        final Button button = (Button) view;
        MediaPlayer player = MediaPlayer.create(MainActivity.this,getResources().getIdentifier((String) button.getTag(),"raw",getPackageName()));
        player.start();

        button.setBackgroundColor(Color.RED);


        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){

            @Override
            public void onCompletion(MediaPlayer mp) {
                button.setBackgroundColor(Color.GREEN);
                button.setTextColor(Color.BLACK);
            }
        });


    }
}
