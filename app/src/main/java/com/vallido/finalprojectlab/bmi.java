package com.vallido.finalprojectlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmi extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private TextView bmires;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height =  findViewById(R.id.height);
        weight =  findViewById(R.id.weight);
        bmires =  findViewById(R.id.bmires);
        result =  findViewById(R.id.result);

    }
    public void calculateBMI(View view) {
        String hght = height.getText().toString();
        String wght = weight.getText().toString();

        if (hght != null && !"".equals(hght) && wght != null  &&  !"".equals(wght)) {
            float heightValue = Float.parseFloat(hght) / 100;
            float weightValue = Float.parseFloat(wght);
            float bmi = weightValue / (heightValue * heightValue);
            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel;

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel = getString(R.string.vsuwght);
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            bmiLabel = getString(R.string.suwght);
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = getString(R.string.uwght);
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = getString(R.string.normal);
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = getString(R.string.owght);
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.mobese);
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmiLabel = getString(R.string.sobese);
        } else {
            bmiLabel = getString(R.string.vsobese);
        }
        String str = String.format("%.2f",bmi);
        bmires.setText(str);
        result.setText(bmiLabel);
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
