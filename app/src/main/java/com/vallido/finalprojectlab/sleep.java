package com.vallido.finalprojectlab;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class sleep extends AppCompatActivity {

    EditText sleephrs;
    TextView sleephrs2;
    Button saveButton, loadButton;
    String fname = "sleep.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        sleephrs = findViewById(R.id.sleephours);
        sleephrs2 = findViewById(R.id.sleephours2);
        saveButton = findViewById(R.id.save);
        loadButton = findViewById(R.id.load);
        String hrs = "";

        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String hrs = sleephrs.getText().toString();
                try {
                    FileOutputStream fos = openFileOutput(fname, Context.MODE_PRIVATE);
                    byte[] buf = hrs.getBytes();
                    fos.write(buf);
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try {
                    FileInputStream fin = openFileInput(fname);
                    int c;
                    String temp = "";
                    while ((c = fin.read()) != -1) {
                        temp = temp + Character.toString((char) c);
                    }
                    fin.close();
                    sleephrs2.setText(temp);
                    Toast.makeText(getBaseContext(), "updated", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                }
            }
        });
    }
    public void toHome(View view) {
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
