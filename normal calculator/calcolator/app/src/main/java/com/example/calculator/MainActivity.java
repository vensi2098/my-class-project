package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorAdditionalInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.Flow;

public class MainActivity extends AppCompatActivity {

    EditText edtNo1,edtNo2;
    TextView txtResult;
    Button btnPlus,btnSub,btnDivide,btnMulti,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button();
    }
    private void Button()
    {
        edtNo1=findViewById(R.id.edtNo1);
        edtNo2=findViewById(R.id.edtNo2);
        txtResult=findViewById(R.id.txtResult);
        btnPlus=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnDivide=findViewById(R.id.btnDivide);
        btnMulti=findViewById(R.id.btnMulti);
        btnClear=findViewById(R.id.btnClear);

        Addition();
        Subscription();
        Multiplication();
        Division();
        clear();

    }
         private void Addition()
         {
          btnPlus.setOnClickListener(A ->{

              String Number_1 =  edtNo1.getText().toString();
              String Number_2 =  edtNo2.getText().toString();

              int  N1= Integer.parseInt(Number_1);
              int  N2= Integer.parseInt(Number_2);
              int Result;
              Result = N1+N2;

             txtResult.setText(Result+"  ");


          });
         }

    private void Subscription()
    {
        btnSub.setOnClickListener(S ->{

            String Number_1 =  edtNo1.getText().toString();
            String Number_2 =  edtNo2.getText().toString();

            int  N1= Integer.parseInt(Number_1);
            int  N2= Integer.parseInt(Number_2);
            int Result;
            Result = N1-N2;

            txtResult.setText(Result+"  ");


        });
    }
    private void Multiplication()
    {
        btnMulti.setOnClickListener(M ->{

            String Number_1 =  edtNo1.getText().toString();
            String Number_2 =  edtNo2.getText().toString();

            int  N1= Integer.parseInt(Number_1);
            int  N2= Integer.parseInt(Number_2);
            int Result;
            Result = N1*N2;

            txtResult.setText(Result+"  ");


        });
    }

    private void Division()
    {
        btnDivide.setOnClickListener(D ->{

            String Number_1 =  edtNo1.getText().toString();
            String Number_2 =  edtNo2.getText().toString();

            int  N1= Integer.parseInt(Number_1);
            int  N2= Integer.parseInt(Number_2);
            int Result;
            Result = N1/N2;

            txtResult.setText(Result+"  ");


        });
    }

    private void clear()
    {
        btnClear.setOnClickListener(C ->{

           edtNo1.setText("");
           edtNo2.setText("");
           txtResult.setText("");
        });
    }
}