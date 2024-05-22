package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnButtonEx = findViewById(R.id.btnButtonEx);
        btnButtonEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        ButtonExercise.class);
                startActivity(intent1);
            }
        });

        Button btnCalcu = findViewById(R.id.btnCalcu);
        btnCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        Calculator.class);
                startActivity(intent1);
            }
        });

        Button btnMidterm = findViewById(R.id.btnMidterm);
        btnMidterm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        Midterm.class);
                startActivity(intent1);
            }
        });

        Button btnConnect = findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        Connect3.class);
                startActivity(intent1);
            }
        });

        Button btnPassIntents = findViewById(R.id.btnPassIntents);
        btnPassIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        PassingIntentsExercise.class);
                startActivity(intent1);
            }
        });

        Button btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        MenuExercise.class);
                startActivity(intent1);
            }
        });
    }
}