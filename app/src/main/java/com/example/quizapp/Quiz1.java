package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Quiz1 extends AppCompatActivity {
    AppCompatButton a,b,c,d;
    String selectionByUser = "";
    Button nextBtn;
    TextView question;
    int correctCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_quiz1);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        question = findViewById(R.id.question);
        nextBtn = findViewById(R.id.next_btn);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectionByUser.isEmpty()){
                    selectionByUser = a.getText().toString();

                    a.setBackgroundResource(R.drawable.ic_wrong_button);
                    a.setTextColor(Color.WHITE);

                    revealAnswer();
                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(selectionByUser.equals(a.getText().toString())){
                                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                                intent.putExtra("correct", correctCount);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectionByUser.isEmpty()){
                    selectionByUser = b.getText().toString();

                    b.setBackgroundResource(R.drawable.ic_wrong_button);
                    b.setTextColor(Color.WHITE);

                    revealAnswer();
                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(selectionByUser.equals(b.getText().toString())){
                                correctCount += 1;
                                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                                intent.putExtra("correct", correctCount);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectionByUser.isEmpty()){
                    selectionByUser = c.getText().toString();

                    c.setBackgroundResource(R.drawable.ic_wrong_button);
                    c.setTextColor(Color.WHITE);

                    revealAnswer();
                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if(selectionByUser.equals(c.getText().toString())){
                                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                                intent.putExtra("correct", correctCount);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectionByUser.isEmpty()){
                    selectionByUser = d.getText().toString();

                    d.setBackgroundResource(R.drawable.ic_wrong_button);
                    d.setTextColor(Color.WHITE);

                    revealAnswer();
                    nextBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if(selectionByUser.equals(d.getText().toString())){
                                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                                intent.putExtra("correct", correctCount);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });
        /*nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectionByUser.equals("B. Berlin")){
                    Integer input = 20;
                }
                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                intent.putExtra("input", 20);
                startActivity(intent);
            }
        });*/

    }
    private void revealAnswer(){
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        final String getAnswer = b.getText().toString();

        if(a.getText().toString().equals(getAnswer)){
            a.setBackgroundResource(R.drawable.ic_right_button);
        }
        else if(b.getText().toString().equals(getAnswer)){
            b.setBackgroundResource(R.drawable.ic_right_button);
        }
        else if(c.getText().toString().equals(getAnswer)){
            c.setBackgroundResource(R.drawable.ic_right_button);
        }
        else if(d.getText().toString().equals(getAnswer)){
            d.setBackgroundResource(R.drawable.ic_right_button);
        }
    }

    public void connection(View v){
        question = (TextView) findViewById(R.id.question);
        String s ="";
        try{
            URL url = new URL("https://mm2021.000webhostapp.com/IMM/question1.php");
            URLConnection ucon = url.openConnection();
            InputStream in = ucon.getInputStream();
            InputStreamReader isw = new InputStreamReader(in);
            int data = isw.read();
            while(data!= -1){
                char current = (char) data;
                s = s + current;
                data = isw.read();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        question.setText(s);
    }
}