package com.example.stereocreditmanagement;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class vinayActivity extends AppCompatActivity {
    public static String name = "NULL";
    TextView textview;
    private Button button;
    DatabaseReference rootRef, demoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinay);
        button = findViewById(R.id.mohan);

        textview = (TextView)findViewById(R.id.vinayPoint);

        rootRef = FirebaseDatabase.getInstance().getReference();
        demoRef = rootRef.child("vinay");

        demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                textview.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "mohan";
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

        button = findViewById(R.id.aman);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = "aman";
                openamanActivity();
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
    public void openamanActivity(){
        Intent intent = new Intent(this, calcActivity.class);
        startActivity(intent);
    }
}

