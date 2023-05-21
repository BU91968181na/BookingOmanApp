package com.jcg.bookingomanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button buttonh;
    private Button buttonr;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        buttonh = (Button) findViewById(R.id.buttonh);
        buttonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity();
            }
        });

        buttonr = (Button) findViewById(R.id.buttonr);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity1();
            }
        });


    }

    public void  LoginActivity(){
        Intent intent=new Intent(home.this,hotels.class);
        startActivity(intent);
    }

    public void  LoginActivity1(){
        Intent intent=new Intent(home.this,Resort.class);
        startActivity(intent);
    }
}