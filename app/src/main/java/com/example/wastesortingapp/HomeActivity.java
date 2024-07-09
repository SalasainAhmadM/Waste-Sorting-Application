package com.example.wastesortingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CardView bioCard,nonbioCard,camCard,aboutCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home);

        bioCard = findViewById(R.id.bioCard);
        nonbioCard = findViewById(R.id.nonbioCard);
        camCard = findViewById(R.id.camCard);
        aboutCard = findViewById(R.id.aboutCard);

        bioCard.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, BiodegradableActivity.class);
            Toast.makeText(this, "Biodegradable", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            overridePendingTransition(0, 0);
        });
        nonbioCard.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, NonBiodegradableActivity.class);
            Toast.makeText(this, "Non-Biodegradable", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            overridePendingTransition(0, 0);
        });
        camCard.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            Toast.makeText(this, "Camera Scanner", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            overridePendingTransition(0, 0);
        });
        aboutCard.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            overridePendingTransition(0, 0);
        });


    }
}