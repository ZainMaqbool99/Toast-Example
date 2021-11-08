package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpleTst = findViewById(R.id.btnSimpleToast);
        Button btnXYToast = findViewById(R.id.btnXYToast);

        btnSimpleTst.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, SimpleToastExample.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        btnXYToast.setOnClickListener(x->{
            Intent intent = new Intent(MainActivity.this, XYoffsetToast.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}