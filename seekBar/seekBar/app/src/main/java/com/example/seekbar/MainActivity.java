package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtAns;
     SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output();
    }

    private void output() {
        seekbar=findViewById(R.id.Seekbar);
        txtAns=findViewById(R.id.txtAns);

        seekbar.setOnSeekBarChangeListener(new seekbar.OnSeekBarChangeListener(){
    }
}