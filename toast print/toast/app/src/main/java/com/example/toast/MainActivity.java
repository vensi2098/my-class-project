package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtValue;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interview();
    }

    private void interview() {

        edtValue = findViewById(R.id.edtValue);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(submit -> {
            int age = Integer.parseInt(edtValue.getText().toString());
            if (age < 18) {
                Toast.makeText(this, "  Not capable for vote", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, " capable for vote", Toast.LENGTH_SHORT).show();
            }
        });

    }
}