package com.example.textview_edittext_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTen;
    Button btnXacNhan;
    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
    }

    private void addControl() {
        editTen = findViewById(R.id.edtTen);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnXacNhan = findViewById(R.id.btnXacNhan);

    }

    public void XuLyXacNhan(View view) {
        txtKetQua.setText(editTen.getText().toString());
    }
}