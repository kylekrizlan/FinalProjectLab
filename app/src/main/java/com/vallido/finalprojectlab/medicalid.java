package com.vallido.finalprojectlab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class medicalid extends AppCompatActivity {

    TextView textName, textDob, textBt, textHt, textWt;
    Button editButton;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalid);

        textName = findViewById(R.id.Name2);
        textDob = findViewById(R.id.Dob2);
        textBt = findViewById(R.id.bt2);
        textHt = findViewById(R.id.ht2);
        textWt = findViewById(R.id.wt2);
        editButton = findViewById(R.id.edit);



        editButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i=new Intent(medicalid.this, editpage.class);
                startActivityForResult(i, 1);

            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        textName = findViewById(R.id.Name2);
        textDob = findViewById(R.id.Dob2);
        textBt = findViewById(R.id.bt2);
        textHt = findViewById(R.id.ht2);
        textWt = findViewById(R.id.wt2);
        editButton = findViewById(R.id.edit);

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String name=data.getStringExtra("name");
                String dob=data.getStringExtra("dob");
                String bt=data.getStringExtra("bt");
                String ht=data.getStringExtra("ht");
                String wt=data.getStringExtra("wt");
                textName.setText(name);
                textDob.setText(dob);
                textBt.setText(bt);
                textHt.setText(ht);
                textWt.setText(wt);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }
    public void toHome (View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
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
