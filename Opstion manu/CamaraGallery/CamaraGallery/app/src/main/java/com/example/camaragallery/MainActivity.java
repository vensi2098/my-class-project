package com.example.camaragallery;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.camaragallery.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        forGallery();
        forCammara();

    }

    //
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == 100 && resultCode == RESULT_OK){
//            Uri uri= data.getData();
//            binding.cImg.setImageURI(uri);
//
//        }
//        else if(requestCode==101)
//        {
//            Bitmap b = (Bitmap) data.getExtras().get("data");
//            binding.cCamara.setImageBitmap(b);
//        }
//    }
//
    ActivityResultLauncher<Intent> gallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Uri uri = data.getData();
                        binding.cImg.setImageURI(uri);


                    }
                }
            });
    ActivityResultLauncher<Intent> camara = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Bitmap b = (Bitmap) data.getExtras().get("data");
                        binding.cCamara.setImageBitmap(b);



                    }
                }
            });

    private void forGallery() {
        binding.btnClickImg.setOnClickListener(v -> {
            Intent galleryy = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//            startActivityForResult(gallery, 100);
            gallery.launch(galleryy);
        });
    }

    private void forCammara() {
        binding.clickCamara.setOnClickListener(v1 -> {

            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//         startActivityForResult(camara,101);
            camara.launch(i);
        });
    }
}