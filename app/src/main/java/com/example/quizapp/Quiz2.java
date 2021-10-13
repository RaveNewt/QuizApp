package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {
    TextView showvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        showvalue = findViewById(R.id.showvalue);
        Intent intent = getIntent();
        String input =intent.getStringExtra("input");
        showvalue.setText(input);

    }
}