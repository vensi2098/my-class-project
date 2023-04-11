package com.example.reletive_layout;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registration();
    }
    void registration()
    {
        Button btnSubmit=findViewById(R.id.btnSubmit);
        EditText edtName=findViewById(R.id.edtName);
        EditText edtEnterPassword=findViewById(R.id.edtEnterPassword);
        EditText edtConformPassword=findViewById(R.id.edtConformPassword);
        EditText edtAddress=findViewById(R.id.edtAddress);


        btnSubmit.setOnClickListener(View -> {

            String name =edtName.getText().toString();
            String enterPassword=edtEnterPassword.getText().toString();
            String ConformPassword=edtConformPassword.getText().toString();
            String PleaseEnterAddress=edtAddress.getText().toString();


            Toast.makeText(this, "submit", Toast.LENGTH_SHORT).show();


            Log.e( "registration: ","submit button Click" );
            Log.e( "registration: ","name :- " +name );
            Log.e( "registration: ","enter password :- " +enterPassword );
            Log.e( "registration: ","Enter conform password :- " +ConformPassword);
            Log.e( "registration: ","please enter your address :- " +PleaseEnterAddress);

        });
    }
}