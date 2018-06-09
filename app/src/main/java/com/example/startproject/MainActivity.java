package com.example.startproject;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity {
    int DIALOG_TIME = 1;
    int myHours = 14;
    int myMinutes = 35;
    private TextView tvTime;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTime = findViewById(R.id.tvTime);
    }
    public void onclick(View v){
        showDialog(DIALOG_TIME);
    }
    protected Dialog onCreateDialog(int id){
        if (id == DIALOG_TIME){
            TimePickerDialog tpd = new TimePickerDialog(this, myCallBack, myHours, myMinutes, true);
            return tpd;
        }
        return super.onCreateDialog(id);
    }
    TimePickerDialog.OnTimeSetListener myCallBack = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myHours = hourOfDay;
            myMinutes = minute;
            tvTime.setText("Time is " + myHours + " hours " + myMinutes + " minutes");
        }
    };
}