package com.example.stereocreditmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class amanActivity extends AppCompatActivity {
    static String name;

    //private TextView textview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aman);

        //textview = findViewById(R.id.amanPoint);

        button = findViewById(R.id.mohan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "mohan";
                /*startActivityForResult(Intent, name);*/
                openmohanActivity();
            }
        });

        button = findViewById(R.id.amit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "amit";
                openamitActivity();
            }
        });

        button = findViewById(R.id.navneet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "navneet";
                opennavneetActivity();
            }
        });

        button = findViewById(R.id.sanu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "sanu";
                opensanuActivity();
            }
        });

        button = findViewById(R.id.shiva);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "shiva";
                openshivaActivity();
            }
        });

        button = findViewById(R.id.tajas);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "tajas";
                opentajasActivity();
            }
        });

        button = findViewById(R.id.vibhor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "vibhor";
                openvibhorActivity();
            }
        });

        button = findViewById(R.id.vinay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "vinay";
                openvinayActivity();
            }
        });

    }
    public void openmohanActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
    public void openamitActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
    public void opennavneetActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
    public void opensanuActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }public void openshivaActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
    public void opentajasActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }public void openvibhorActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
    public void openvinayActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
}
