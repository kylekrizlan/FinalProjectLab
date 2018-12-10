package com.vallido.finalprojectlab;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileOutputStream;


public class editpage extends AppCompatActivity {
    EditText textName, textDob, textBt, textHt, textWt;
    Button saveButton;
    public String flname="name.txt", fldob="dob.txt", flbt="bt.txt", flht="ht.txt", flwt="wt.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpage);

        textName = findViewById(R.id.name);
        textDob = findViewById(R.id.dob);
        textBt = findViewById(R.id.bt2);
        textHt = findViewById(R.id.ht2);
        textWt = findViewById(R.id.wt2);
        saveButton=findViewById(R.id.save);

        saveButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String name=textName.getText().toString();
                String dob=textDob.getText().toString();
                String bt=textBt.getText().toString();
                String ht=textHt.getText().toString();
                String wt=textWt.getText().toString();

                try {
                    FileOutputStream fos1 = openFileOutput(flname, Context.MODE_PRIVATE);
                    byte[] buf1 = name.getBytes();
                    fos1.write(buf1);
                    fos1.close();

                    FileOutputStream fos2 = openFileOutput(fldob, Context.MODE_PRIVATE);
                    byte[] buf2 = dob.getBytes();
                    fos2.write(buf2);
                    fos2.close();

                    FileOutputStream fos3 = openFileOutput(flbt, Context.MODE_PRIVATE);
                    byte[] buf3 = bt.getBytes();
                    fos3.write(buf3);
                    fos3.close();

                    FileOutputStream fos4 = openFileOutput(flht, Context.MODE_PRIVATE);
                    byte[] buf4 = ht.getBytes();
                    fos4.write(buf4);
                    fos4.close();

                    FileOutputStream fos5 = openFileOutput(flwt, Context.MODE_PRIVATE);
                    byte[] buf5 = wt.getBytes();
                    fos5.write(buf5);
                    fos5.close();

                    Toast.makeText(getBaseContext(),"saved",Toast.LENGTH_SHORT).show();
                } catch (Exception e ){
                    e.printStackTrace();
                }
                Intent i = new Intent(getApplicationContext(), medicalid.class);
                i.putExtra("name", name);
                setResult(2, i);
                startActivity(i);

            }
        });
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
