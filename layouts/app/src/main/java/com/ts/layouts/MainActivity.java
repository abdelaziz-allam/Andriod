package com.ts.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.img_back_ground_scrn);
        TextView textView = findViewById(R.id.txt_screen_title);
        Button goBtn = findViewById(R.id.go_btn);
        Button cancleBtn = findViewById(R.id.cancle_btn);

        RelativeLayout parent = findViewById(R.id.parent);
        LinearLayout linearLayout = findViewById(R.id.child);
    }
}
