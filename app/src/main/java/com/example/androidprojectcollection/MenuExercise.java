package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnChanger);
        btnChanger.setBackgroundColor(Color.BLUE);
        ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
        params.width = 520;
        params.height = 550;
        btnChanger.setLayoutParams(params);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mItemChange) {
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundColor(Color.BLUE);
            btnChanger.setVisibility(View.VISIBLE);
            btnChanger.setText("");
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width = 520;
            params.height = 550;
            btnChanger.setLayoutParams(params);
        } else if (item.getItemId() == R.id.mItemExit) {
            finish();
        } else if (item.getItemId() == R.id.mItemRed) {
            btnChanger.setBackgroundColor(Color.RED);
        } else if (item.getItemId() == R.id.mItemGone) {
            btnChanger.setVisibility(View.INVISIBLE);
        } else if (item.getItemId() == R.id.mItemText) {
            btnChanger.setText("Prince");
        } else if (item.getItemId() == R.id.mItemTextColor) {
            btnChanger.setTextColor(Color.BLACK);
        } else if (item.getItemId() == R.id.mItemEnlarge) {
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width = 1000;
            params.height = 1050;
            btnChanger.setLayoutParams(params);
        }

        return true;
    }
}