package com.example.dilogboxaleartactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.dilogboxaleartactivity.databinding.ActivitySingleAndMultipleBinding;

public class SingleAndMultipleActivity extends AppCompatActivity {
    String[]listar={"pizza","burger","browny","bread"};

    ActivitySingleAndMultipleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding=ActivitySingleAndMultipleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(b1 ->{

            AlertDialog.Builder builder=new AlertDialog.Builder(SingleAndMultipleActivity.this);
            builder.setTitle("Reset Settings?");
            builder.setMessage("This will reset your device to its default factory settings.");
            builder.setPositiveButton("ACCEPT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Toast.makeText(SingleAndMultipleActivity.this, "This is accept button", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(SingleAndMultipleActivity.this, "This is no button", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("DISMISS", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
//
            builder.show();

        });

    }


}