package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        TextView tFname = findViewById(R.id.tFname);
        TextView tLname = findViewById(R.id.tLname);
        TextView tBdate = findViewById(R.id.tBdate);
        TextView tGender = findViewById(R.id.tGender);
        TextView tPnumber = findViewById(R.id.tPnumber);
        TextView tEmail = findViewById(R.id.tEmail);
        TextView tCourse = findViewById(R.id.tCourse);
        TextView tAddress = findViewById(R.id.tAddress);
        TextView tGrad = findViewById(R.id.tGrad);
        TextView tNation = findViewById(R.id.tNation);
        TextView tEmergency = findViewById(R.id.tEmergency);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String pnumber = intent.getStringExtra("pnumber_key");
        String email = intent.getStringExtra("email_key");
        String course = intent.getStringExtra("course_key");
        String address = intent.getStringExtra("address_key");
        String grad = intent.getStringExtra("grad_key");
        String nation = intent.getStringExtra("nation_key");
        String emergency = intent.getStringExtra("emergency_key");

        tFname.setText(fname);
        tLname.setText(lname);
        tGender.setText(gender);
        tBdate.setText(bdate);
        tPnumber.setText(pnumber);
        tEmail.setText(email);
        tCourse.setText(course);
        tAddress.setText(address);
        tGrad.setText(grad);
        tNation.setText(nation);
        tEmergency.setText(emergency);

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassingIntentsExercise2.this, PassingIntentsExercise.class);
                startActivity(intent);
            }
        });
    }
}