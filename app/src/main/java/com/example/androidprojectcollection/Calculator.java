package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        TextView num = (TextView) findViewById(R.id.textView2);
        TextView equ = (TextView) findViewById(R.id.textView);
        final String[] input = {""};
        final String[] inputSeq = {""};
        final int[] inputSize = {0};
        final int[] opSize = {0};
        final int[] lastInput = {0};
        final boolean[] go = {false};
        //false if op, true if digit

        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("7");
                } else {
                    num.setText("7");
                }
                inputSize[0]++;
                equ.append("7");
                input[0] = input[0].concat("7");
                inputSeq[0] = inputSeq[0].concat("7");
                lastInput[0] = 1;
            }
        });

        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("8");
                } else {
                    num.setText("8");
                }
                inputSize[0]++;
                equ.append("8");
                input[0] = input[0].concat("8");
                inputSeq[0] = inputSeq[0].concat("8");
                lastInput[0] = 1;
            }
        });

        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("9");
                } else {
                    num.setText("9");
                }
                inputSize[0]++;
                equ.append("9");
                input[0] = input[0].concat("9");
                inputSeq[0] = inputSeq[0].concat("9");
                lastInput[0] = 1;
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("4");
                } else {
                    num.setText("4");
                }
                inputSize[0]++;
                equ.append("4");
                input[0] = input[0].concat("4");
                inputSeq[0] = inputSeq[0].concat("4");
                lastInput[0] = 1;
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("5");
                } else {
                    num.setText("5");
                }
                inputSize[0]++;
                equ.append("5");
                input[0] = input[0].concat("5");
                inputSeq[0] = inputSeq[0].concat("5");
                lastInput[0] = 1;
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("6");
                } else {
                    num.setText("6");
                }
                inputSize[0]++;
                equ.append("6");
                input[0] = input[0].concat("6");
                inputSeq[0] = inputSeq[0].concat("6");
                lastInput[0] = 1;
            }
        });

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("1");
                } else {
                    num.setText("1");
                }
                inputSize[0]++;
                equ.append("1");
                input[0] = input[0].concat("1");
                inputSeq[0] = inputSeq[0].concat("1");
                lastInput[0] = 1;
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("2");
                } else {
                    num.setText("2");
                }
                inputSize[0]++;
                equ.append("2");
                input[0] = input[0].concat("2");
                inputSeq[0] = inputSeq[0].concat("2");
                lastInput[0] = 1;
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("3");
                } else {
                    num.setText("3");
                }
                inputSize[0]++;
                equ.append("3");
                input[0] = input[0].concat("3");
                inputSeq[0] = inputSeq[0].concat("3");
                lastInput[0] = 1;
            }
        });

        Button btnDot = (Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (lastInput[0] != 2) {
                    if (inputSize[0] != 0) {
                        num.append(".");
                        equ.append(".");
                    } else {
                        equ.append("0.");
                        num.setText("0.");
                    }
                    inputSize[0]++;
                    input[0] = input[0].concat(".");
                    inputSeq[0] = inputSeq[0].concat(".");
                    lastInput[0] = 2;
                } else {
                    input[0] = input[0].substring(0, input[0].length() - 1);
                    inputSeq[0] = inputSeq[0].substring(0, inputSeq[0].length() - 1);
                    equ.setText(input[0]);
                    num.setText(inputSeq[0]);
                    if (Character.isDigit(input[0].charAt(input[0].length() - 1))) {
                        lastInput[0] = 1;
                    } else {
                        lastInput[0] = 3;
                    }
                }
            }
        });

        Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (go[0] == false) {
                    num.setText("");
                    go[0] = true;
                }
                if (inputSize[0] != 0 || opSize[0] == 1) {
                    num.append("0");
                    equ.append("0");
                    input[0] = input[0].concat("0");
                    inputSeq[0] = inputSeq[0].concat("0");
                    inputSize[0]++;
                    lastInput[0] = 1;
                }
            }
        });

        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (lastInput[0] != 3) {
                    if (inputSize[0] != 0 && lastInput[0] != 3) {
                        inputSize[0] = 0;
                        if (opSize[0] != 0) {
                            double temp = eval(inputSeq[0]);
                            num.setText(Double.toString(temp));
                            inputSeq[0] = Double.toString(temp);
                        }
                        opSize[0] = 1;
                        num.append("+");
                        equ.append("+");
                        input[0] = input[0].concat("+");
                        inputSeq[0] = inputSeq[0].concat("+");
                        lastInput[0] = 3;
                    }
                } else {
                    input[0] = input[0].substring(0, input[0].length() - 1);
                    inputSeq[0] = inputSeq[0].substring(0, inputSeq[0].length() - 1);
                    input[0] = input[0].concat("+");
                    inputSeq[0] = inputSeq[0].concat("+");
                    equ.setText(input[0]);
                    num.setText(inputSeq[0]);
                }
            }
        });

        Button btnMin = (Button) findViewById(R.id.btnMin);
        btnMin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (lastInput[0] != 3) {
                    if (inputSize[0] != 0) {
                        inputSize[0] = 0;
                        if (opSize[0] != 0) {
                            double temp = eval(inputSeq[0]);
                            num.setText(Double.toString(temp));
                            inputSeq[0] = Double.toString(temp);
                        }
                        opSize[0] = 1;
                        num.append("-");
                        equ.append("-");
                        input[0] = input[0].concat("-");
                        inputSeq[0] = inputSeq[0].concat("-");
                        lastInput[0] = 3;
                    }
                } else {
                    input[0] = input[0].substring(0, input[0].length() - 1);
                    inputSeq[0] = inputSeq[0].substring(0, inputSeq[0].length() - 1);
                    input[0] = input[0].concat("-");
                    inputSeq[0] = inputSeq[0].concat("-");
                    equ.setText(input[0]);
                    num.setText(inputSeq[0]);
                }
            }
        });

        Button btnMul = (Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (lastInput[0] != 3) {
                    if (inputSize[0] != 0) {
                        inputSize[0] = 0;
                        if (opSize[0] != 0) {
                            double temp = eval(inputSeq[0]);
                            num.setText(Double.toString(temp));
                            inputSeq[0] = Double.toString(temp);
                        }
                        opSize[0] = 1;
                        num.append("*");
                        equ.append("*");
                        input[0] = input[0].concat("*");
                        inputSeq[0] = inputSeq[0].concat("*");
                        lastInput[0] = 3;
                    }
                } else {
                    input[0] = input[0].substring(0, input[0].length() - 1);
                    inputSeq[0] = inputSeq[0].substring(0, inputSeq[0].length() - 1);
                    input[0] = input[0].concat("*");
                    inputSeq[0] = inputSeq[0].concat("*");
                    equ.setText(input[0]);
                    num.setText(inputSeq[0]);
                }
            }
        });

        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (lastInput[0] != 3) {
                    if (inputSize[0] != 0) {
                        inputSize[0] = 0;
                        if (opSize[0] != 0) {
                            double temp = eval(inputSeq[0]);
                            num.setText(Double.toString(temp));
                            inputSeq[0] = Double.toString(temp);
                        }
                        opSize[0] = 1;
                        num.append("/");
                        equ.append("/");
                        input[0] = input[0].concat("/");
                        inputSeq[0] = inputSeq[0].concat("/");
                        lastInput[0] = 3;
                    }
                } else {
                    input[0] = input[0].substring(0, input[0].length() - 1);
                    inputSeq[0] = inputSeq[0].substring(0, inputSeq[0].length() - 1);
                    input[0] = input[0].concat("/");
                    inputSeq[0] = inputSeq[0].concat("/");
                    equ.setText(input[0]);
                    num.setText(inputSeq[0]);
                }
            }
        });

        Button btnEqu = (Button) findViewById(R.id.btnEqu);
        btnEqu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                go[0] = false;
                if (inputSize[0] != 0) {
                    inputSize[0] = 0;
                    double total = eval(input[0]);
                    num.setText(Double.toString(total));
                    input[0] = "";
                    inputSeq[0] = "";
                    equ.setText("");
                    lastInput[0] = 0;
                }
            }
        });
    }
    public double eval(String str) {
        List<Double> digits = new ArrayList<>();
        List<String> ops = new ArrayList<>();
        Stack<Double> equation = new Stack<>();
        String strNum = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                strNum += str.charAt(i);
            } else {
                digits.add(Double.parseDouble(strNum));
                strNum = "";
                ops.add(String.valueOf(str.charAt(i)));
            }
        }
        digits.add(Double.parseDouble(strNum));
        equation.push(digits.remove(0));
        while (digits.size() > 0) {
            String op = ops.remove(0);
            if (op.equals("*")) {
                double num1 = equation.pop();
                double num2 = digits.remove(0);
                equation.push(num1 * num2);
            }
            if (op.equals("/")) {
                double num1 = equation.pop();
                double num2 = digits.remove(0);
                equation.push(num1 / num2);
            }
            if (op.equals("-")) {
                double num1 = digits.remove(0);
                num1 = num1 * -1;
                equation.push(num1);
            }
            if (op.equals("+")) {
                equation.push(digits.remove(0));
            }
        }
        double total = 0;
        while (equation.size() > 0) {
            total += equation.pop();
        }
        return total;
    }
}