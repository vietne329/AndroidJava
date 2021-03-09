package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;

    private String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String st = adapter.getItem(position);
                Toast.makeText(MainActivity.this, "Your select item :"+st, Toast.LENGTH_LONG).show();

            }
        });
    }

    private void initView() {
        listView = findViewById(R.id.listView);
        list = getResources().getStringArray(R.array.technology);
        adapter= new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtView,list);

        listView.setAdapter(adapter);
    }
}