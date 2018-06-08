package com.example.startproject;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    private EditText etNum1;
    private EditText etNum2;

    private Button btnAdd;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;

    private TextView tvResult;
    String oper = " ";


    public static final String TAG = "My logs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
