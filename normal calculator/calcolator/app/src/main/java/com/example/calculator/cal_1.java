package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cal_1 extends AppCompatActivity {
    EditText edtNo1,edtNo2,edtNo3,edtNo4,edtNo5;
    TextView txtResult;
    Button btnPlus,btnSub,btnDivide,btnMulti,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal1);

        button();
    }

    private void button() {
        edtNo1=findViewById(R.id.edtNo1);
        edtNo2=findViewById(R.id.edtNo2);
        edtNo3=findViewById(R.id.edtNo3);
        edtNo4=findViewById(R.id.edtNo4);
        edtNo5=findViewById(R.id.edtNo5);
        txtResult=findViewById(R.id.txtResult);
        btnPlus=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnDivide=findViewById(R.id.btnDivide);
        btnMulti=findViewById(R.id.btnMulti);
        btnClear=findViewById(R.id.btnClear);

        Addition();
        clear();


    }


    private void Addition() {
        btnPlus.setOnClickListener( P  ->{
            String Number_1 =  edtNo1.getText().toString();
            String Number_2 =  edtNo2.getText().toString();
            String Number_3 =  edtNo3.getText().toString();
            String Number_4 =  edtNo4.getText().toString();
            String Number_5 =  edtNo5.getText().toString();

            int n1=Integer.parseInt(Number_1);
            int n2=Integer.parseInt(Number_2);
            int n3=Integer.parseInt(Number_3);
            int n4=Integer.parseInt(Number_4);
            int n5=Integer.parseInt(Number_5);

            int Result;
            Result=n1+n2+n3+n4+n5;
            txtResult.setText(Result +" ");

        });
    }
    private void clear() {
        btnClear.setOnClickListener( C -> {
            edtNo1.setText("");
            edtNo2.setText("");
            edtNo3.setText("");
            edtNo4.setText("");
            edtNo5.setText("");
            txtResult.setText("");
        });
    }
}