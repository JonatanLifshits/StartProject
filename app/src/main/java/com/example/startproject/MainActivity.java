package com.example.startproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements View.OnClickListener {
     EditText etFName;
     EditText etLName;

    private Button btnSumbit;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);

        btnSumbit = findViewById(R.id.btnSubmit);
        btnSumbit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
    }
}