package com.anoop.healthchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.snackbar.Snackbar;

public class KgToLb extends AppCompatActivity {


    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_lb);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        EditText kg = findViewById(R.id.input);
        Button b1 = findViewById(R.id.button);
        TextView textview= findViewById(R.id.output);




        //convert kg to pounds

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kilograms = kg.getText().toString();

                float kilo = Float.parseFloat(kilograms);

                float pounds = (float) (kilo * 2.20462);

                textview.setText(""+pounds);

                Snackbar snackbar = Snackbar.make(view, "Weight in KG = " + kilograms + "kg and in Lbs = "+ pounds +"lbs", Snackbar.LENGTH_LONG);
                snackbar.show();

                Toast.makeText(KgToLb.this, pounds+" Lbs", Toast.LENGTH_LONG).show();

            }
        });




        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}