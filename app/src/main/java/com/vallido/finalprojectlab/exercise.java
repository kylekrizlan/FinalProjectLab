package com.vallido.finalprojectlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }
    public void toWarmup(View view) {
        Intent i = new Intent(getApplicationContext(), warmup.class);
        startActivity(i);
    }
    public void toChest(View view) {
        Intent i = new Intent(getApplicationContext(), chestworkout.class);
        startActivity(i);
    }
    public void toCore(View view) {
        Intent i = new Intent(getApplicationContext(), coreworkout.class);
        startActivity(i);
    }
    public void toArm(View view) {
        Intent i = new Intent(getApplicationContext(), armworkout.class);
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
