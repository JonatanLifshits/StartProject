package com.example.startproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    public static final String NEW_CAT_DETECTED = "ru.alexanderklimov.action.NEW_CAT";
    public static final String ALARM_MESSAGE = "Срочно пришлите кота";
    private Button btnSM;
    byte CatName;
    byte currentLongitude;
    byte currentLatitude;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSM = findViewById(R.id.btnSM);
        btnSM.setOnClickListener(this);

        Intent intent = new Intent(NEW_CAT_DETECTED);
        intent.putExtra("cat name", CatName);
        intent.putExtra("longitude", currentLongitude);
        intent.putExtra("latitude", currentLatitude);
        sendBroadcast(intent);
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
    }

    @Override
    public void onClick(View v) {

    }
}