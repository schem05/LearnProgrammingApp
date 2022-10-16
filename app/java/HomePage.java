package com.example.luminositylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    Button beginPython;
    Button java;
    Button html;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        beginPython = findViewById(R.id.button2);

        beginPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, PythonHome.class);
                startActivity(i);
            }

        });

        java = findViewById(R.id.button12);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePage.this, "COMING SOON!", Toast.LENGTH_LONG).show();
            }
        });

        html = findViewById(R.id.button13);
        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePage.this, "COMING SOON!", Toast.LENGTH_LONG).show();
            }
        });
    }
}