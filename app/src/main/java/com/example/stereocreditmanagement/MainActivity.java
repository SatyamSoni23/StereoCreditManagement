package com.example.stereocreditmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.aman);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openamanActivity();
            }
        });
        button = findViewById(R.id.amit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openamitActivity();
            }
        });
        button = findViewById(R.id.vinay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvinayActivity();
            }
        });
        button = findViewById(R.id.tajas);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentajasActivity();
            }
        });
        button = findViewById(R.id.sanu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensanuActivity();
            }
        });
        button = findViewById(R.id.vibhor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvibhorActivity();
            }
        });
        button = findViewById(R.id.shiva);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshivaActivity();
            }
        });
        button = findViewById(R.id.navneet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennavneetActivity();
            }
        });
        button = findViewById(R.id.mohan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmohanActivity();
            }
        });
    }
    public void openamanActivity(){
        Intent intent = new Intent(this, amanActivity.class);
        startActivity(intent);
    }
    public void openamitActivity(){
        Intent intent = new Intent(this, amitActivity.class);
        startActivity(intent);
    }
    public void openvinayActivity(){
        Intent intent = new Intent(this, vinayActivity.class);
        startActivity(intent);

    }
    public void opentajasActivity(){
        Intent intent = new Intent(this, tajasActivity.class);
        startActivity(intent);

    }
    public void opensanuActivity(){
        Intent intent = new Intent(this, sanuActivity.class);
        startActivity(intent);

    }
    public void openvibhorActivity(){
        Intent intent = new Intent(this, vibhorActivity.class);
        startActivity(intent);

    }
    public void openshivaActivity(){
        Intent intent = new Intent(this, shivaActivity.class);
        startActivity(intent);

    }
    public void opennavneetActivity(){
        Intent intent = new Intent(this, navneetActivity.class);
        startActivity(intent);

    }
    public void openmohanActivity(){
        Intent intent = new Intent(this, mohanActivity.class);
        startActivity(intent);

    }
}
