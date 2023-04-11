package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Day extends AppCompatActivity {
    EditText edtValue;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        set();
    }

    private void set() {

        edtValue=findViewById(R.id.edtValue);
        btnSubmit=findViewById(R.id.btnSubmit);

        week();
    }

    private void week() {

        btnSubmit.setOnClickListener( Submit ->{
            int day=Integer.parseInt(edtValue.getText().toString());
            switch (day)
            {
                case 1:
                    Toast.makeText(this, "Sunday", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(this, "Monday", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(this, "Tuesday", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(this, "Wednesday", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(this, "Thursday", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    Toast.makeText(this, "Friday", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    Toast.makeText(this, "Saturday", Toast.LENGTH_SHORT).show();
                    break;
            }
        });
    }
}