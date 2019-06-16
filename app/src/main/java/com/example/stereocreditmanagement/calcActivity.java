package com.example.stereocreditmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class calcActivity extends AppCompatActivity {
    private Button button;

    EditText input;
    static String point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        input = (EditText) findViewById(R.id.input);
        button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point = input.getText().toString();
                opensubmitActivity();
            }
        });

    }

    public void opensubmitActivity(){
        Intent intent = new Intent(this, transferActivity.class);
        startActivity(intent);
    }
}
