package com.jcg.bookingomanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {
    EditText UserName;
    EditText password;
    Button button1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        UserName = findViewById(R.id.UserName);
        password =findViewById(R.id.password);
        button1 =findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (UserName.getText().toString().equals("user") && password.getText().toString().equals("1234")){
                    Intent intent=new Intent(login.this,home.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(login.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
