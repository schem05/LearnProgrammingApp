package com.example.luminositylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PythonLesson5s extends AppCompatActivity {

    Button A;
    Button B;
    Button C;
    Button D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_lesson5s);

        A = findViewById(R.id.button3);
        B = findViewById(R.id.button9);
        C = findViewById(R.id.button10);
        D = findViewById(R.id.button11);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PythonLesson5s.this, "INCORRECT", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(PythonLesson5s.this, PythonLesson5t.class);
                startActivity(i);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PythonLesson5s.this, "INCORRECT", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(PythonLesson5s.this, PythonLesson5t.class);
                startActivity(i);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PythonLesson5s.this, "CORRECT", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(PythonLesson5s.this, PythonLesson5t.class);
                startActivity(i);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PythonLesson5s.this, "INCORRECT", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(PythonLesson5s.this, PythonLesson5t.class);
                startActivity(i);
            }
        });
    }
}