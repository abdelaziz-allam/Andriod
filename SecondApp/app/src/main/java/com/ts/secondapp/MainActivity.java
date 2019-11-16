package com.ts.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button goBtn = findViewById(R.id.btn_go);
        final Button playBtn = findViewById(R.id.btn_play);
        Button cancelBtn = findViewById(R.id.btn_cancel);

        final TextView txt_go = findViewById(R.id.txt_go);
        final TextView txt_play = findViewById(R.id.txt_play);
        final TextView txt_cancel = findViewById(R.id.txt_cancle);

        final ImageView imageView = findViewById(R.id.img_child);

        final String [] txtViews = {"Go","Play","Cancel"};

        final int resources = R.drawable.child2;

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_go.setText(txtViews[0]);
                txt_play.setText(txtViews[1]);
                txt_cancel.setText(txtViews[2]);
                imageView.setImageResource(resources);
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_go.setTextColor(getResources().getColor(R.color.colorBlue));
                txt_play.setAlpha(0.4f);
                txt_cancel.setTextSize(20f);
                imageView.setImageResource( R.drawable.child);
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goBtn.setVisibility(View.GONE);
                playBtn.setVisibility(View.GONE);
                txt_cancel.setVisibility(View.GONE);
                txt_cancel.setVisibility(View.GONE);
                txt_go.setVisibility(View.GONE);
                txt_play.setVisibility(View.GONE);

            }
        });
    }
}
