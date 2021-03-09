package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   /* private EditText ed1,ed2;
    private Button btAdd;
    private Spinner spinner;
    private TextView textView;
    @Override*/

    private EditText edDate, edTime;
    private Button btDate,btTime;
    private int mDay, mMonth, mYear, mHour,mMinute;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitView();
        btDate.setOnClickListener(this);
        btTime.setOnClickListener(this);
    }

    private void innitView() {
        edDate = findViewById(R.id.txtDate);
        edTime = findViewById(R.id.txtTime);
        btDate = findViewById(R.id.btDate);
        btTime = findViewById(R.id.btTime);
    }

    @Override
    public void onClick(View v) {
        if(v==btDate){
            //get current date
            Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int y, int m, int d) {
                    edDate.setText(d+"/"+(m+1)+"/"+y);
                }
            }, mYear,mMonth,mDay);
            dialog.show();
        }
        
        if(v==btTime){
            Calendar c =Calendar.getInstance();
            mHour = c.get(Calendar.HOUR);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog dialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hour, int minute) {
                                edTime.setText(hour+":"+minute);
                        }
                    }, mHour,mMinute,false);
            
            dialog.show();;
        }
        
    }






    /*private void innitView() {
        ed1.findViewById(R.id.n1);
        ed2.findViewById(R.id.n2);
        btAdd.findViewById(R.id.btAdd);
        spinner.findViewById(R.id.spinner);
        
        textView.findViewById(R.id.txtResult);
        String[] str={"+","-","x",":"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.myspinner,str);
        adapter.setDropDownViewResource(R.layout.myspinner);


    }*/
}