package com.example.healthchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bodyfat extends AppCompatActivity {

    private double bmi1;
    private double age2;
    private double bodyFat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyfat);


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        EditText bmi = findViewById(R.id.bmi);
        EditText age = findViewById(R.id.age);
        TextView resultView = findViewById(R.id.result);

        Button calculateButton = findViewById(R.id.button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the user's input
                bmi1 = Double.parseDouble(bmi.getText().toString());
                age2 = Double.parseDouble(age.getText().toString());

                // Perform the body fat calculation
                bodyFat =(1.20 * bmi1) + (0.23 *age2) - 5.4;

                // Display the result
                resultView.setText(bodyFat+"%");
            }
        });


    }
}