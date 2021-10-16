package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Point extends AppCompatActivity {
    int correctCount = 0;
    TextView showvalue;
    AppCompatButton home, playAgain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);
        home = findViewById(R.id.home);
        playAgain = findViewById(R.id.playAgain);
        showvalue = findViewById(R.id.showvalue);
        Intent intent = getIntent();
        correctCount = intent.getIntExtra("correct", 0);
        switch (correctCount){
            case 0:
                showvalue.setText("0/100");
                break;
            case 1:
                showvalue.setText("20/100");
                break;
            case 2:
                showvalue.setText("40/100");
                break;
            case 3:
                showvalue.setText("60/100");
                break;
            case 4:
                showvalue.setText("80/100");
                break;
            case 5:
                showvalue.setText("100/100");
                break;
        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Point.this, LandingPage.class));
            }
        });
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Point.this, Quiz1.class));
            }
        });
    }
}