package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
EditText edtValue;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button();

    }

    private void button() {
        edtValue=findViewById(R.id.edtValue);
        btnSubmit=findViewById(R.id.btnSubmit);

        Output();
    }

    private void Output() {
        btnSubmit.setOnClickListener(View ->{
            String v1=edtValue.getText().toString();
            Toast.makeText(this, ""+v1, Toast.LENGTH_LONG).show();
        });
    }
}