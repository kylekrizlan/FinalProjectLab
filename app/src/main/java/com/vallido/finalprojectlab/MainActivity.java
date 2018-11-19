package com.vallido.finalprojectlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toExercise(View view) {
        Intent i = new Intent (getApplicationContext(), exercise.class);
        startActivity(i);
    }
    public void toBmi(View view) {
        Intent i = new Intent (getApplicationContext(), bmi.class);
        startActivity(i);
    }
    public void toNutrition(View view) {
        Intent i = new Intent (getApplicationContext(), Nutrition.class);
        startActivity(i);
    }
    public void toSleep(View view) {
        Intent i = new Intent (getApplicationContext(), sleep.class);
        startActivity(i);
    }
    public void toMedication(View view) {
        Intent i = new Intent(getApplicationContext(), medication.class);
        startActivity(i);
    }
    public void toHealthrecord(View view) {
        Intent i = new Intent (getApplicationContext(), healthrecords.class);
        startActivity(i);
    }
    public void toMedicalID(View view) {
        Intent i = new Intent (getApplicationContext(), medicalid.class);
        startActivity(i);
    }
}
