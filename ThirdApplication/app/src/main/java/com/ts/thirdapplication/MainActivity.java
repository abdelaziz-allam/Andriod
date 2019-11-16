package com.ts.thirdapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text_main_header = findViewById(R.id.txt_main_header);
        TextView text_main_head = findViewById(R.id.txt_main_head);

        Button button = findViewById(R.id.btn_start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigate_to = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(navigate_to);
            }
        });
    }
}
