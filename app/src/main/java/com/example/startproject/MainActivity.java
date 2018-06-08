package com.example.startproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView tvOut;
    private Button btnOk;
    private Button btnCancel;

    public static final String TAG = "My logs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"найдем view элементы");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        Log.d(TAG,"присваеваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG ,"по id определяем кнопку, вызвавшую этот обработчик");
       switch(v.getId()){
           case R.id.btnOk:
               Log.d(TAG ,"кнопка ОК");
               tvOut.setText("Нажата кнопка Ок");
               Toast.makeText(this, "нажата кнопка Ок" , Toast.LENGTH_LONG).show();
               break;
           case R.id.btnCancel:
               Log.d(TAG ,"кнопка Cancel");
               tvOut.setText("Нажата кнопка Cancel");
               Toast.makeText(this ,"нажата кнопка Cancel" ,Toast.LENGTH_LONG).show();
               break;
       }
    }
}

