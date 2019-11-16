package com.ts.thirdapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editText = findViewById(R.id.user_input);

        Button navigateBtn = findViewById(R.id.btn_start_new_act);

        navigateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Intent thirdIntent = new Intent(SecondActivity.this,Third_Activity.class);
                thirdIntent.putExtra("text",text);
                startActivity(thirdIntent);
            }
        });
    }
}
