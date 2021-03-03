package com.example.bt1_classroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerCountry;
    Spinner spinnerUniversity;
    TextView txtResult1;
    TextView txtResult2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCountry = (Spinner) findViewById(R.id.spinner1);
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Viet Nam");
        arr1.add("Malaysia");
        arr1.add("Trung Quoc");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arr1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCountry.setAdapter(arrayAdapter);

        spinnerUniversity = (Spinner) findViewById(R.id.spinner2);
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("PTIT");
        arr2.add("HUST");
        arr2.add("NEU");
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arr2);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerUniversity.setAdapter(arrayAdapter2);

    }

    public void NopBai(View view) {

    }
}