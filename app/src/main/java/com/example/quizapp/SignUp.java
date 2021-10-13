package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    EditText username, psw;
    Button create;
    TextView toLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username = findViewById(R.id.username);
        psw = findViewById(R.id.password);
        create = findViewById(R.id.button);
        toLogin = findViewById(R.id.toLogin);
        /*create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals(username.getText().toString()) &&
                        psw.getText().toString().equals(psw.getText().toString())){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            SignUp.this
                    );
                    builder.setIcon(R.drawable.ic_baseline_check_circle_24);
                    builder.setTitle("Sign up Successfully");
                    builder.setMessage("Welcome to Quiz App, Brain Freeze");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //dialogInterface.cancel();
                            String input = username.getText().toString();
                            Intent intent = new Intent(SignUp.this, LandingPage.class);
                            intent.putExtra("input", input);
                            startActivity(intent);
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }
        });*/
    }

    public void onClick(View view){
        if(username.getText().toString().equals(username.getText().toString()) &&
                psw.getText().toString().equals(psw.getText().toString())){
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    SignUp.this
            );
            builder.setIcon(R.drawable.ic_baseline_check_circle_24);
            builder.setTitle("Sign up Successfully");
            builder.setMessage("Welcome to Quiz App, Brain Freeze");

            builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //dialogInterface.cancel();
                    String input = username.getText().toString();
                    Intent intent = new Intent(SignUp.this, LandingPage.class);
                    intent.putExtra("input", input);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }
    }
}