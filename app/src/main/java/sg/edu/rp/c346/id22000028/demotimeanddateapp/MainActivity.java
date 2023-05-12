package sg.edu.rp.c346.id22000028.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnRestet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.date);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textView2);
        btnRestet=findViewById(R.id.reset_btn);

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = "Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) + "/" + dp.getYear();
                tvDisplay.setText(date);
            }
        });

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time ="Time is "+tp.getCurrentHour().toString()+":"+tp.getCurrentMinute();
                tvDisplay.setText(time);

            }
        });

    }

}
