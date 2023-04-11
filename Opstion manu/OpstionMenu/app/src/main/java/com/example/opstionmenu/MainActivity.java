package com.example.opstionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.opstionmenu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        view();

    }

    private void view() {
        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.opstion_menu,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int i= item.getItemId();
        if (i == R.id.home) {
            Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();

        }
        else if (i==R.id.Setting){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();

        }
        else if (i==R.id.surch){
            Toast.makeText(this, "surch", Toast.LENGTH_SHORT).show();

        }
        else if (i==R.id.block){
            Toast.makeText(this, "block", Toast.LENGTH_SHORT).show();
        }

     return true;

    }
}