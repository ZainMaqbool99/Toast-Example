package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class XYoffsetToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xyoffset_toast);

        Button btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(x->{
            EditText txtX = findViewById(R.id.txtX);
            EditText txtY = findViewById(R.id.txtY);

            Toast tst = Toast.makeText(getApplicationContext(), "Hello User! Have a good day.", Toast.LENGTH_SHORT);
            tst.setGravity(Gravity.CENTER, Integer.valueOf(txtX.getText().toString()), Integer.valueOf(txtY.getText().toString()));
            tst.show();
        });


    }
}