package com.example.a15032021;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {
    private int[] icon;
    private String[] title;
    private String[] subtitle;
    private String[] content;
    private Activity context;

    public MyListAdapter(@NonNull Activity context, int[] icon, String[] title, String[] subtitle, String[] content) {
        super(context, R.layout.list_item,title);
        this.context = context;
        this.title = title;
        this.icon = icon;
        this.subtitle = subtitle;
        this.content = content;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_item,null,true);
        ImageView i = v.findViewById(R.id.icon);
        TextView tt = v.findViewById(R.id.title);
        TextView tt2 = v.findViewById(R.id.subtitle);
        TextView tt3 = v.findViewById(R.id.content);

        i.setImageResource(icon[position]);
        tt.setText(title[position]);
        tt2.setText(subtitle[position]);
        tt3.setText(content[position]);

        return v;
    }

    public String getTitle(int pos) {
        return title[pos];
    }
}
