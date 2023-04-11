package com.example.chkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView txtTitle;
EditText edtName,edtPassword,edtConform,edtAddress;
CheckBox chkMusic,chkDancing,chkReading;
Button btnSubmit;
RadioGroup rGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registration();
    }

    private void registration() {
          txtTitle=findViewById(R.id.txtTitle);
          edtName=findViewById(R.id.edtName);
          edtPassword=findViewById(R.id.edtPassword);
          edtConform=findViewById(R.id.edtConform);
          edtAddress=findViewById(R.id.edtAddress);
          chkMusic=findViewById(R.id.chkMusic);
          chkDancing=findViewById(R.id.chkDancing);
          chkReading=findViewById(R.id.chkReading);
       btnSubmit=findViewById(R.id.btnSubmit);
        rGroup=findViewById(R.id.rGroup);
         button();
         click();
    }

    private void click() { // Radio button and Gender check mate

        rGroup.setOnCheckedChangeListener((radioGroup, i) -> {
            RadioButton rb=findViewById(i);
            Log.e("TAG","registration:gender  "+rb.getText());

        });
    }

     private void button() {

       btnSubmit.setOnClickListener( View ->{

              String name=edtName.getText().toString();
              String password=edtPassword.getText().toString();
              String cpass=edtConform.getText().toString();
              String add=edtAddress.getText().toString();

              boolean a=chkMusic.isChecked();
              boolean b=chkDancing.isChecked();
              boolean c=chkReading.isChecked();

    Toast.makeText(this, "Submit", Toast.LENGTH_SHORT).show();

              Log.e("registration:","Submit button is click");
              Log.e("registration:","Name" +name);
              Log.e("registration:","Password"+password);
              Log.e("registration:","cPassword"+cpass);
              Log.e("registration:","Address"+add);
              Log.e("registration:","chkMusic"+a);
              Log.e("registration:","chkDancing"+b);
              Log.e("registration:","chkReading"+c);

             if(chkMusic.isChecked())
             {
                 Log.e("Tag", "registration:"+chkMusic.getText().toString());
             }
             if(chkDancing.isChecked())
              {
                Log.e("Tag", "registration:"+chkDancing.getText().toString());
              }
              if(chkReading.isChecked())
              {
                 Log.e("Tag", "registration:"+chkReading.getText().toString());
              }
      });

 }

}