package com.example.using_id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyOk(View view) {
        TextView textView = findViewById(R.id.textView2);
        textView.setText("My name is Viet - B17DCDT212");

    }
}