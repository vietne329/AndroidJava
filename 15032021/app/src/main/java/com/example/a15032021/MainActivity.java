package com.example.a15032021;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private int[] icon = {R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};
    private String[] title = {"Facebook","Football","Google","Football2"};
    private String[] subtitle = {"subtitle 1","subtitle 1","subtitle 3","subtitle 4"};
    private String[] content = {"content1","content2","content3","content4"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        subtitle = getResources().getStringArray(R.array.sub);
        listview = findViewById(R.id.listView);
        MyListAdapter adapter = new MyListAdapter(this ,icon,title,subtitle,content);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for(int i=0;i<adapter.getCount();i++)
                {
                    parent.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    parent.getChildAt(position).setBackground(getDrawable(R.drawable.ic_launcher_background));
                }
                String st = "Select: "+adapter.getTitle(position);
                Toast.makeText(MainActivity.this,st,Toast.LENGTH_SHORT).show();
            }
        });
    }

}