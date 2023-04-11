package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    CardView cdvApple,cdvBnana;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Allfrute();
        clickevent();
    }

    private void Allfrute() {
        progressbar=findViewById(R.id.progressbar);
        cdvApple=findViewById(R.id.cdvApple);
        cdvBnana=findViewById(R.id.cdvBnana);
    }

    private void clickevent() {
        cdvApple.setOnClickListener(view -> {
            progressbar.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(MainActivity.this,FruteDetaleActivity.class);

                        startActivity(i);

                    }
                },2000);

        });
//        cdvBnana.setOnClickListener(view1 ->{
//            Intent i=new Intent(this,FruteDetaleActivity.class);
//            startActivity(i);
//        } );
//
    }

}