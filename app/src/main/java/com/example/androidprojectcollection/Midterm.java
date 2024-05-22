package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Midterm extends AppCompatActivity {
    int[] colors = {Color.BLUE, Color.RED, Color.YELLOW};
    Random random = new Random();
    int[] colIndex = new int[9];
    Button[] btns = new Button[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm);

        btns[0] = findViewById(R.id.button1);
        btns[1] = findViewById(R.id.button2);
        btns[2] = findViewById(R.id.button3);
        btns[3] = findViewById(R.id.button4);
        btns[4] = findViewById(R.id.button5);
        btns[5] = findViewById(R.id.button6);
        btns[6] = findViewById(R.id.button7);
        btns[7] = findViewById(R.id.button8);
        btns[8] = findViewById(R.id.button9);

        randomize();

        btns[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(1);
                changeColor(3);
                btns[1].setBackgroundColor(colors[colIndex[1]]);
                btns[3].setBackgroundColor(colors[colIndex[3]]);
                check();
            }
        });
        btns[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(0);
                changeColor(2);
                changeColor(4);
                btns[0].setBackgroundColor(colors[colIndex[0]]);
                btns[2].setBackgroundColor(colors[colIndex[2]]);
                btns[4].setBackgroundColor(colors[colIndex[4]]);
                check();
            }
        });
        btns[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(1);
                changeColor(5);
                btns[1].setBackgroundColor(colors[colIndex[1]]);
                btns[5].setBackgroundColor(colors[colIndex[5]]);
                check();
            }
        });
        btns[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(0);
                changeColor(4);
                changeColor(6);
                btns[0].setBackgroundColor(colors[colIndex[0]]);
                btns[4].setBackgroundColor(colors[colIndex[4]]);
                btns[6].setBackgroundColor(colors[colIndex[6]]);
                check();
            }
        });
        btns[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(1);
                changeColor(3);
                changeColor(5);
                changeColor(7);
                btns[1].setBackgroundColor(colors[colIndex[1]]);
                btns[3].setBackgroundColor(colors[colIndex[3]]);
                btns[5].setBackgroundColor(colors[colIndex[5]]);
                btns[7].setBackgroundColor(colors[colIndex[7]]);
                check();
            }
        });
        btns[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(2);
                changeColor(4);
                changeColor(8);
                btns[2].setBackgroundColor(colors[colIndex[2]]);
                btns[4].setBackgroundColor(colors[colIndex[4]]);
                btns[8].setBackgroundColor(colors[colIndex[8]]);
                check();
            }
        });
        btns[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(3);
                changeColor(7);
                btns[3].setBackgroundColor(colors[colIndex[3]]);
                btns[7].setBackgroundColor(colors[colIndex[7]]);
                check();
            }
        });
        btns[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(4);
                changeColor(6);
                changeColor(8);
                btns[4].setBackgroundColor(colors[colIndex[4]]);
                btns[6].setBackgroundColor(colors[colIndex[6]]);
                btns[8].setBackgroundColor(colors[colIndex[8]]);
                check();
            }
        });
        btns[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor(5);
                changeColor(7);
                btns[5].setBackgroundColor(colors[colIndex[5]]);
                btns[7].setBackgroundColor(colors[colIndex[7]]);
                check();
            }
        });
        Button randombtn = findViewById(R.id.buttonReturn);
        randombtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomize();
                for(Button b : btns) {
                    b.setClickable(true);
                }
            }
        });
        Button btnSet = findViewById(R.id.btnSet);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set();
                for(Button b : btns) {
                    b.setClickable(true);
                }
            }
        });
    }

    public void set() {
        colIndex[0] = colIndex[2] = colIndex[4] = colIndex[6] = colIndex[8] = 0;
        colIndex[1] = colIndex[3] = colIndex[5] = colIndex[7] = 2;
        for(int i = 0; i < 9; i++) {
            btns[i].setBackgroundColor(colors[colIndex[i]]);
        }
    }
    public void randomize() {
        for(int i = 0; i < 9; i++) {
            colIndex[i] = random.nextInt(3);
        }

        for(int i = 0; i < 9; i++) {
            btns[i].setBackgroundColor(colors[colIndex[i]]);
        }
    }
    public void changeColor(int num) {
        if (colIndex[num] == 2) {
            colIndex[num] = 0;
        } else {
            colIndex[num]++;
        }
    }
    public void check() {
        int blue = 0, red = 0, yellow = 0;
        for(int i : colIndex) {
            if (i == 0) {
                blue++;
            }
            if (i == 1) {
                red++;
            }
            if (i == 2) {
                yellow++;
            }
        }
        if (blue == 9 || red == 9 || yellow == 9) {
            Toast.makeText(getBaseContext(), "YOU WON!!", Toast.LENGTH_SHORT).show();
            for(Button b : btns) {
                b.setClickable(false);
            }
        }
    }
}