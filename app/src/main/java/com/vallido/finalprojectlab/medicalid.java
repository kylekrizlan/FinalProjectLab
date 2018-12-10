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

        String filename1="flname.txt";
        StringBuffer name = new StringBuffer();
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(openFileInput(filename1)));
            String inputString;

            while ((inputString = inputReader.readLine()) != null) {
                name.append(inputString + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filename2="fldob.txt";
        StringBuffer dob = new StringBuffer();
        try {

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(openFileInput(filename2)));
            String inputString;

            while ((inputString = inputReader.readLine()) != null) {
                dob.append(inputString + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename3="flbt.txt";
        StringBuffer bt = new StringBuffer();
        try {

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput(filename3)));
            String inputString;

            while ((inputString = inputReader.readLine()) != null) {
                bt.append(inputString + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filename4="flht.txt";
        StringBuffer ht = new StringBuffer();
        try {

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput(filename4)));
            String inputString;

            while ((inputString = inputReader.readLine()) != null) {
                ht.append(inputString + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String filename5="flwt.txt";
        StringBuffer wt = new StringBuffer();
        try {

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput(filename5)));
            String inputString;

            while ((inputString = inputReader.readLine()) != null) {
                wt.append(inputString + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        textName.setText(name.toString());
        textDob.setText(dob.toString());
        textBt.setText(bt.toString());
        textHt.setText(ht.toString());
        textWt.setText(wt.toString());

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
