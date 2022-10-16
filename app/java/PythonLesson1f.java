package com.example.luminositylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PythonLesson1f extends AppCompatActivity {
    ImageButton next;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_lesson1f);

        next = findViewById(R.id.imageButton);


        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonLesson1f.this, PythonLesson1g.class);
                startActivity(i);
            }
        });

        back = findViewById(R.id.imageButton3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PythonLesson1f.this, PythonLesson1e.class);
                startActivity(i);
            }

        });
    }
}