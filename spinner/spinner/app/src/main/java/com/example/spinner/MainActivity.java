package com.example.spinner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spinner.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList weeklist=new ArrayList();
//    String[] listCity = {"surat", "rajkot", "vdodra", "ahemdabad", "bhavnagar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        view();

    }

    private void view() {
        weeklist.add("Sunday");
        weeklist.add("Monday");
        weeklist.add("Tuesday");
        weeklist.add("Wednesday");
        weeklist.add("thursday");
        weeklist.add("Friday");
        weeklist.add("Saturday");
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.text, R.id.txtSpinner, weeklist);
        binding.spinner.setAdapter(adapter);

        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String name=(String) weeklist.get(position);
                Log.e("TAG", "onItemSelected: "+name );
                Toast.makeText(MainActivity.this,""+name, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}