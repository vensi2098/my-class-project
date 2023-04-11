package com.example.camaragallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.camaragallery.databinding.ActivityIphoneCamaraGalleryBinding;

public class IphoneCamaraGallery extends AppCompatActivity {
    ActivityIphoneCamaraGalleryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIphoneCamaraGalleryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}