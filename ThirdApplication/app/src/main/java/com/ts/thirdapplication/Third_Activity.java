package com.ts.thirdapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Third_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView text_show = findViewById(R.id.third_txt_display);
        String txt = getIntent().getStringExtra("text");

        text_show.setText(txt);

        Button button = findViewById(R.id.btn_navigate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
