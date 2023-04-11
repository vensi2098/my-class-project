package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Grade extends AppCompatActivity {
    EditText edtValue;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        grade();
    }

    private void grade() {
        edtValue=findViewById(R.id.edtValue);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener( view -> {
            int grade=Integer.parseInt(edtValue.getText().toString());

            if(grade <35 )
            {
                Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
            }
            else if (grade >=35 &&  grade<50)
            {
                Toast.makeText(this, " Grade C", Toast.LENGTH_SHORT).show();
            }
            else if (grade>=50 && grade<70)
            {
                Toast.makeText(this, "Grade B", Toast.LENGTH_SHORT).show();
            }
            else if(grade>=70 && grade<90)
            {
                Toast.makeText(this, "Grade A", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Grade A+", Toast.LENGTH_SHORT).show();
            }

        });
    }
}