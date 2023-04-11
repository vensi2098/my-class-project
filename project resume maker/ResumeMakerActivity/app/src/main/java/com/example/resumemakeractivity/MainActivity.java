package com.example.resumemakeractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edtFname,edtLname,edtMoNumber,edtAddress,edtEid,edtYear10,edtYear12,edtYearGdt,edtPar10,edtPar12,edtParGdt,edtPje,edtInterest;
    CheckBox chkMusic,chkDancing,chkReading,chkSinging,chkWriting,chkDriving;
    CheckBox chkC,chkCPlus,chkCHes,chkCss,chkJava,chkKotlin,chkAndroid,chkWebdegine,chkHtml,chkPhp;
    RadioGroup RGroup1,RGroup2;
    AppCompatButton btnSub;
    String gender,married;
    StringBuilder sb=new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resumeid();
        outout();
    }

    private void resumeid() {
        edtFname=findViewById(R.id.edtFname);
        edtLname=findViewById(R.id.edtLname);
        edtMoNumber=findViewById(R.id.edtMoNumber);
        edtAddress=findViewById(R.id.edtAddress);
        edtEid=findViewById(R.id.edtEid);
        edtYear10=findViewById(R.id.edtYear10);
        edtYear12=findViewById(R.id.edtYear12);
        edtYearGdt=findViewById(R.id.edtYearGdt);
        edtPar10=findViewById(R.id.edtPar10);
        edtPar12=findViewById(R.id.edtPar12);
        edtParGdt=findViewById(R.id.edtParGdt);
        edtPje=findViewById(R.id.edtPje);
        edtInterest=findViewById(R.id.edtInterest);
        chkMusic=findViewById(R.id.chkMusic);
        chkDancing=findViewById(R.id.chkDancing);
        chkReading=findViewById(R.id.chkReading);
        chkSinging=findViewById(R.id.chkSinging);
        chkWriting=findViewById(R.id.chkWriting);
        chkDriving=findViewById(R.id.chkDriving);
        chkC=findViewById(R.id.chkC);
        chkCPlus=findViewById(R.id.chkCPlus);
        chkCHes=findViewById(R.id.chkCHes);
        chkCss=findViewById(R.id.chkCss);
        chkJava=findViewById(R.id.chkJava);
        chkKotlin=findViewById(R.id.chkKotlin);
        chkAndroid=findViewById(R.id.chkAndroid);
        chkWebdegine=findViewById(R.id.chkWebdegine);
        chkHtml=findViewById(R.id.chkHtml);
        chkPhp = findViewById(R.id.chkPhp);
        btnSub=findViewById(R.id.btnSub);
        RGroup1=findViewById(R.id.Rgroup1);
        RGroup2=findViewById(R.id.Rgroup2);

    }

    private void outout() {

        btnSub.setOnClickListener(view -> {

            String firstName=edtFname.getText().toString();
            String lastName=edtLname.getText().toString();
            String mobileNumber=edtMoNumber.getText().toString();
            String address=edtAddress.getText().toString();
            String email=edtEid.getText().toString();
            String year10=edtYear10.getText().toString();
            String year12=edtYear12.getText().toString();
            String yearGdt=edtYearGdt.getText().toString();
            String par10=edtPar10.getText().toString();
            String par12=edtPar12.getText().toString();
            String parGdt=edtParGdt.getText().toString();
            String jobex=edtPje.getText().toString();
            String interest=edtInterest.getText().toString();

            // for radio button

            int selected=RGroup1.getCheckedRadioButtonId();
            RadioButton rb=findViewById(selected);
            if (selected != -1)
            {
                gender=rb.getText().toString();
            }
            int selected1=RGroup2.getCheckedRadioButtonId();
            RadioButton rb1=findViewById(selected1);
            if (selected1 != -1)
            {
                married=rb1.getText().toString();
            }

            // FOR HOBBY

            if(chkMusic.isChecked())
            {
              sb.append(" "+chkMusic.getText().toString());
            }
            if(chkDancing.isChecked())
            {
                sb.append(" "+chkDancing.getText().toString());
            }
            if(chkReading.isChecked())
            {
               sb.append(" "+chkReading.getText().toString());
            }
            if(chkSinging.isChecked())
            {
                sb.append(" "+chkSinging.getText().toString());
            }
            if(chkWriting.isChecked())
            {
                sb.append(" "+chkWriting.getText().toString());
            }
            if(chkDriving.isChecked())
            {
                sb.append(" "+chkDriving.getText().toString());
            }


        });
    }


}