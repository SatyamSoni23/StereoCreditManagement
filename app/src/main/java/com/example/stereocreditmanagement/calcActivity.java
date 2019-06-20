package com.example.stereocreditmanagement;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class calcActivity extends AppCompatActivity {
    private Button button;

    DatabaseReference rootRef,demoRef,demoRef1;

    EditText input;
    //String point,newValue;
    int value=0,point=0,newValue=0,valueSecond=0,newValueSecond=0;
    String newString,newStringSecond;
    //String newValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

//*********************************************************************************************************************************
//--------------------------------------******Aman--->Debit*****-------------------------------------------------------------------
//--------------------------------------************************-------------------------------------------------------------------
//*********************************************************************************************************************************


        if(amanActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(amanActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amanActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("aman");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//*********************************************************************************************************************************
//--------------------------------------******Amit--->Debit*****-------------------------------------------------------------------
//--------------------------------------************************-------------------------------------------------------------------
//*********************************************************************************************************************************

        if(amitActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(amitActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(amitActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("amit");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//*********************************************************************************************************************************
//--------------------------------------******Mohan--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************

        if(mohanActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(mohanActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(mohanActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("mohan");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//*********************************************************************************************************************************
//--------------------------------------******sanu--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************

        if(sanuActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(sanuActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(sanuActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("sanu");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//********************************************************************************************************************************
//--------------------------------------******shiva--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************

        if(shivaActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(shivaActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(shivaActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("shiva");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//********************************************************************************************************************************
//--------------------------------------******tajas--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************


        if(tajasActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(tajasActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(tajasActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("tajas");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//********************************************************************************************************************************
//--------------------------------------******vibhor--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************


        if(vibhorActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(vibhorActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vibhorActivity.name == "vinay"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vinay");
            demoRef1 = rootRef.child("vibhor");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

//********************************************************************************************************************************
//--------------------------------------******vinay--->Debit*****-------------------------------------------------------------------
//--------------------------------------*************************------------------------------------------------------------------
//*********************************************************************************************************************************

        if(vinayActivity.name == "mohan"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("mohan");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });


            //----------------------------------------------------------

            demoRef = rootRef.child("mohan");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
        }
//---------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
        else if(vinayActivity.name == "amit"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("amit");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("amit");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "navneet"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("navneet");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("navneet");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "sanu"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("sanu");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("sanu");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "shiva"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("shiva");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("shiva");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "tajas"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("tajas");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("tajas");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "vibhor"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vibhor");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("vibhor");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }

        else if(vinayActivity.name == "aman"){

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("aman");
            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    value = Integer.parseInt(dataSnapshot.getValue(String.class));
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            rootRef = FirebaseDatabase.getInstance().getReference();
            demoRef = rootRef.child("vinay");

            demoRef.child("score").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    valueSecond = Integer.parseInt(dataSnapshot.getValue(String.class));
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            //----------------------------------------------------------

            demoRef = rootRef.child("aman");
            demoRef1 = rootRef.child("vinay");
            input = (EditText) findViewById(R.id.input);
            button = findViewById(R.id.submit);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    point = Integer.parseInt(input.getText().toString());
                    newValue = point + value;
                    newValueSecond = valueSecond - point;
                    newString = Integer.toString(newValue);
                    newStringSecond = Integer.toString(newValueSecond);
                    demoRef.child("score").setValue(newString);
                    demoRef1.child("score").setValue(newStringSecond);
                    opensubmitActivity();
                }
            });
            //------------------------------------------------------------
        }
    }

    public void opensubmitActivity(){
        Intent intent = new Intent(this, transferActivity.class);
        startActivity(intent);
    }
}
