package com.example.luminositylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PythonHome extends AppCompatActivity {
    Button beginLesson1;
    Button beginLesson2;
    Button beginLesson3;
    Button beginLesson4;
    Button beginQuiz;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_home);

        beginLesson1 = findViewById(R.id.button4);

        beginLesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, PythonLesson1.class);
                startActivity(i);
            }

        });

        beginLesson2 = findViewById(R.id.button5);

        beginLesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, PythonLesson2.class);
                startActivity(i);
            }

        });

        beginLesson3 = findViewById(R.id.button6);

        beginLesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, PythonLesson3.class);
                startActivity(i);
            }

        });

        beginLesson4 = findViewById(R.id.button7);

        beginLesson4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, PythonLesson4.class);
                startActivity(i);
            }

        });

        beginQuiz = findViewById(R.id.button8);

        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, PythonLesson5.class);
                startActivity(i);
            }
        });

        back = findViewById(R.id.imageButton4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonHome.this, HomePage.class);
                startActivity(i);
            }
        });



    }
}