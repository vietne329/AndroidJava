package com.example.a04_07_nhom10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    private AutoCompleteTextView oneText;
    private MultiAutoCompleteTextView manyText;
    private String[] list;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneText = findViewById(R.id.oneAuto);
        manyText = findViewById(R.id.manyAuto);
        list = getResources().getStringArray(R.array.auto);
        oneText.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list));
        manyText.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list));
        oneText.addTextChangedListener(this);

        manyText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        manyText.addTextChangedListener(this);

        btn = findViewById(R.id.bt);
        registerForContextMenu(btn);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mRed:
                btn.setTextColor(Color.RED);
                break;
            case R.id.mGreen:
                btn.setTextColor(Color.GREEN);
                break;
            case R.id.mBlue:
                btn.setTextColor(Color.BLUE);
                break;
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFile:

                Toast.makeText(MainActivity.this,"Select File",Toast.LENGTH_SHORT).show();

                break;
            case R.id.mEmail:

                Toast.makeText(MainActivity.this,"Select Email",Toast.LENGTH_SHORT).show();

                break;

            case R.id.mPhone:

                Toast.makeText(MainActivity.this,"Select Phone",Toast.LENGTH_SHORT).show();

                break;

            case R.id.mExit:
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}