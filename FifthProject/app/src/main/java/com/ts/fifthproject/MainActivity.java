package com.ts.fifthproject;

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

        Button navigate_btn = findViewById(R.id.btn_navigate);
        navigate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BlogActivity.class);
                startActivity(intent);
            }
        });

        Button navigate_advance = findViewById(R.id.btn_advanced);
        navigate_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AdvancedDesign.class);
                startActivity(intent);
            }
        });
    }
}
