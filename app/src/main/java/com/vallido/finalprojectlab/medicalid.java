package com.vallido.finalprojectlab;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalid);

        textName = findViewById(R.id.name);
        textDob = findViewById(R.id.dob);
        textBt = findViewById(R.id.bt2);
        textHt = findViewById(R.id.ht2);
        textWt = findViewById(R.id.wt2);
        editButton = findViewById(R.id.edit);
        editButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i=new Intent(medicalid.this, editpage.class);
                startActivity(i);
            }
        });
        String name, dob, bt ,ht, wt;
        try {
            FileInputStream fin1 = openFileInput("fname.txt");
            int a;
            String temp1 = "";
            while ((a = fin1.read()) != -1) {
                temp1 = temp1 + Character.toString((char) a);
            }
            name = temp1;
            fin1.close();

            FileInputStream fin2 = openFileInput("fdob.txt");
            int b;
            String temp2 = "";
            while ((b = fin2.read()) != -1) {
                temp2 = temp2 + Character.toString((char) b);
            }
            dob = temp2;
            fin2.close();

            FileInputStream fin3 = openFileInput("fbt.txt");
            int c;
            String temp3 = "";
            while ((c = fin3.read()) != -1) {
                temp3 = temp3 + Character.toString((char) c);
            }
            bt = temp3;
            fin3.close();

            FileInputStream fin4 = openFileInput("fht.txt");
            int d;
            String temp4 = "";
            while ((d = fin4.read()) != -1) {
                temp4 = temp4 + Character.toString((char) d);
            }
            ht = temp4;
            fin4.close();

            FileInputStream fin5 = openFileInput("fwt.txt");
            int e;
            String temp5 = "";
            while ((e = fin5.read()) != -1) {
                temp5 = temp5 + Character.toString((char) e);
            }
            wt = temp5;
            fin5.close();

            textName.setText(name);
            textDob.setText(dob);
            textBt.setText(bt);
            textHt.setText(ht);
            textWt.setText(wt);
        } catch (Exception e) {
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
