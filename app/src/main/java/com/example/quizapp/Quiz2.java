package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {
    TextView showvalue;
    int correctCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        showvalue = findViewById(R.id.showvalue);
        Intent intent = getIntent();
        correctCount = intent.getIntExtra("correct", 0);
        switch(correctCount){
            case 1:
                showvalue.setText("1");
                break;
            case 0:
                showvalue.setText("0");
                break;
        }
        /*if(correct==0){
            showvalue.setText("0");
        }
        if(correct==1){
            showvalue.setText("1");
        }*/

    }
}