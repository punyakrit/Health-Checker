package com.example.healthchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BmiCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }






    }
}