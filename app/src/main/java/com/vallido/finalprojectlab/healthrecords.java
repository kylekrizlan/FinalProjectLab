package com.vallido.finalprojectlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class healthrecords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthrecords);
    }
    public void toAllRecords(View view) {
        Intent i = new Intent(getApplicationContext(), allrecords.class);
        startActivity(i);
    }
    public void toLabResults(View view) {
        Intent i = new Intent(getApplicationContext(), labresults.class);
        startActivity(i);
    }
    public void toImmunization(View view) {
        Intent i = new Intent(getApplicationContext(), immunizations.class);
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
