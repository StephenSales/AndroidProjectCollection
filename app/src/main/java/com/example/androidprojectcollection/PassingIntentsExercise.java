package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        EditText eFname = findViewById(R.id.eFname);
        EditText eLname = findViewById(R.id.eLname);
        EditText eBdate = findViewById(R.id.eBdate);
        EditText ePnumber = findViewById(R.id.ePnumber);
        EditText eEmail = findViewById(R.id.eEmail);
        EditText eCourse = findViewById(R.id.eCourse);
        EditText eAddress = findViewById(R.id.eAddress);
        EditText eGrad = findViewById(R.id.eGrad);
        EditText eNation = findViewById(R.id.eNation);
        EditText eEmergency = findViewById(R.id.eEmergency);
        RadioButton rMale = findViewById(R.id.rMale);
        RadioButton rFemale = findViewById(R.id.rFemale);
        RadioButton rOther = findViewById(R.id.rOther);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = eFname.getText().toString();
                String lname = eLname.getText().toString();

                String gender;
                if (rMale.isChecked()) {
                    gender = "Male";
                } else if (rFemale.isChecked()) {
                    gender = "Female";
                } else if (rOther.isChecked()) {
                    gender = "Others";
                } else {
                    gender = "Unknown";
                }

                String bdate = eBdate.getText().toString();
                String pnumber = ePnumber.getText().toString();
                String email = eEmail.getText().toString();
                String course = eCourse.getText().toString();
                String address = eAddress.getText().toString();
                String grad = eGrad.getText().toString();
                String nation = eNation.getText().toString();
                String emergency = eEmergency.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", fname);
                intent.putExtra("lname_key", lname);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bdate_key", bdate);
                intent.putExtra("pnumber_key", pnumber);
                intent.putExtra("email_key", email);
                intent.putExtra("course_key", course);
                intent.putExtra("address_key", address);
                intent.putExtra("grad_key", grad);
                intent.putExtra("nation_key", nation);
                intent.putExtra("emergency_key", emergency);

                startActivity(intent);
            }
        });

        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eFname.setText("");
                eLname.setText("");
                rMale.setChecked(false);
                rFemale.setChecked(false);
                rOther.setChecked(false);
                eBdate.setText("");
                ePnumber.setText("");
                eEmail.setText("");
                eCourse.setText("");
                eAddress.setText("");
                eGrad.setText("");
                eNation.setText("");
                eEmergency.setText("");
            }
        });
    }
}