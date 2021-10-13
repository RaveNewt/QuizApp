package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LandingPage extends AppCompatActivity {
    TextView showName;
    ImageView quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        showName = findViewById(R.id.showName);
        quiz = findViewById(R.id.quiz);
        Intent intent = getIntent();
        String input = intent.getStringExtra("input");
        showName.setText(input);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LandingPage.this, Quiz1.class));
            }
        });

    }
}