package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SimpleToastExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_toast_example);

        Toast.makeText(getApplicationContext(), "Hello User! Stay Blessed.", Toast.LENGTH_SHORT)
                .show();
    }
}