package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Connect3 extends AppCompatActivity {
    Button[][] btns = new Button[5][5];
    Integer[][] checker = new Integer[5][5];
    //empty is  0, blue is 1, red is 2
    Boolean playerTurn = true;
    //true is blue, false is red
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);
        LinearLayout ll = (LinearLayout) findViewById(R.id.LL);
        ll.setBackgroundColor(Color.BLACK);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.cl);
        cl.setBackgroundColor(Color.BLUE);

        btns[0][0] = findViewById(R.id.btn11);
        btns[0][1] = findViewById(R.id.btn12);
        btns[0][2] = findViewById(R.id.btn13);
        btns[0][3] = findViewById(R.id.btn14);
        btns[0][4] = findViewById(R.id.btn15);
        btns[1][0] = findViewById(R.id.btn21);
        btns[1][1] = findViewById(R.id.btn22);
        btns[1][2] = findViewById(R.id.btn23);
        btns[1][3] = findViewById(R.id.btn24);
        btns[1][4] = findViewById(R.id.btn25);
        btns[2][0] = findViewById(R.id.btn31);
        btns[2][1] = findViewById(R.id.btn32);
        btns[2][2] = findViewById(R.id.btn33);
        btns[2][3] = findViewById(R.id.btn34);
        btns[2][4] = findViewById(R.id.btn35);
        btns[3][0] = findViewById(R.id.btn41);
        btns[3][1] = findViewById(R.id.btn42);
        btns[3][2] = findViewById(R.id.btn43);
        btns[3][3] = findViewById(R.id.btn44);
        btns[3][4] = findViewById(R.id.btn45);
        btns[4][0] = findViewById(R.id.btn51);
        btns[4][1] = findViewById(R.id.btn52);
        btns[4][2] = findViewById(R.id.btn53);
        btns[4][3] = findViewById(R.id.btn54);
        btns[4][4] = findViewById(R.id.btn55);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                btns[i][j].setBackgroundColor(Color.WHITE);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                checker[i][j] = 0;
            }
        }

        btns[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 4; i >= 0; i--) {
                    if (checker[i][0] == 0) {
                        if (playerTurn == true) {
                            btns[i][0].setBackgroundColor(Color.BLUE);
                            cl.setBackgroundColor(Color.RED);
                            checker[i][0] = 1;
                            playerTurn = false;
                        } else {
                            btns[i][0].setBackgroundColor(Color.RED);
                            cl.setBackgroundColor(Color.BLUE);
                            checker[i][0] = 2;
                            playerTurn = true;
                        }
                        patternCheck();
                        break;
                    }
                }
            }
        });

        btns[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 4; i >= 0; i--) {
                    if (checker[i][1] == 0) {
                        if (playerTurn == true) {
                            btns[i][1].setBackgroundColor(Color.BLUE);
                            cl.setBackgroundColor(Color.RED);
                            checker[i][1] = 1;
                            playerTurn = false;
                        } else {
                            btns[i][1].setBackgroundColor(Color.RED);
                            cl.setBackgroundColor(Color.BLUE);
                            checker[i][1] = 2;
                            playerTurn = true;
                        }
                        patternCheck();
                        break;
                    }
                }
            }
        });

        btns[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 4; i >= 0; i--) {
                    if (checker[i][2] == 0) {
                        if (playerTurn == true) {
                            btns[i][2].setBackgroundColor(Color.BLUE);
                            cl.setBackgroundColor(Color.RED);
                            checker[i][2] = 1;
                            playerTurn = false;
                        } else {
                            btns[i][2].setBackgroundColor(Color.RED);
                            cl.setBackgroundColor(Color.BLUE);
                            checker[i][2] = 2;
                            playerTurn = true;
                        }
                        patternCheck();
                        break;
                    }
                }
            }
        });

        btns[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 4; i >= 0; i--) {
                    if (checker[i][3] == 0) {
                        if (playerTurn == true) {
                            btns[i][3].setBackgroundColor(Color.BLUE);
                            cl.setBackgroundColor(Color.RED);
                            checker[i][3] = 1;
                            playerTurn = false;
                        } else {
                            btns[i][3].setBackgroundColor(Color.RED);
                            cl.setBackgroundColor(Color.BLUE);
                            checker[i][3] = 2;
                            playerTurn = true;
                        }
                        patternCheck();
                        break;
                    }
                }
            }
        });

        btns[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 4; i >= 0; i--) {
                    if (checker[i][4] == 0) {
                        if (playerTurn == true) {
                            btns[i][4].setBackgroundColor(Color.BLUE);
                            cl.setBackgroundColor(Color.RED);
                            checker[i][4] = 1;
                            playerTurn = false;
                        } else {
                            btns[i][4].setBackgroundColor(Color.RED);
                            cl.setBackgroundColor(Color.BLUE);
                            checker[i][4] = 2;
                            playerTurn = true;
                        }
                        patternCheck();
                        break;
                    }
                }
            }
        });

        Button btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setBackgroundColor(Color.YELLOW);
        btnReset.setTextColor(Color.BLACK);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });
    }
    public void patternCheck() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (checker[i][j] == 0) {
                    continue;
                }
                if (i > 2 && j > 2) {
                    continue;
                } else if (i > 2) {
                    if (checker[i][j] == checker[i][j+1] && checker[i][j+1]  == checker[i][j+2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                } else if (j > 2) {
                    if (checker[i][j] == checker[i+1][j] && checker[i+1][j]  == checker[i+2][j]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j-1] && checker[i+1][j-1]  == checker[i+2][j-2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                } else if (j < 2) {
                    if (checker[i][j] == checker[i][j+1] && checker[i][j+1]  == checker[i][j+2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j] && checker[i+1][j]  == checker[i+2][j]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j+1] && checker[i+1][j+1]  == checker[i+2][j+2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                } else {
                    if (checker[i][j] == checker[i][j+1] && checker[i][j+1]  == checker[i][j+2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j] && checker[i+1][j]  == checker[i+2][j]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j+1] && checker[i+1][j+1]  == checker[i+2][j+2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                    if (checker[i][j] == checker[i+1][j-1] && checker[i+1][j-1]  == checker[i+2][j-2]) {
                        if (checker[i][j] == 1) {
                            Toast.makeText(getBaseContext(), "Game Over! BLUE WON!!", Toast.LENGTH_SHORT).show();
                        } else if (checker[i][j] == 2) {
                            Toast.makeText(getBaseContext(), "Game Over! RED WON!!", Toast.LENGTH_SHORT).show();
                        }
                        disable();
                        return;
                    }
                }
            }
        }
    }

    public void disable() {
        for (Button b : btns[0]) {
            b.setClickable(false);
        }
    }
}