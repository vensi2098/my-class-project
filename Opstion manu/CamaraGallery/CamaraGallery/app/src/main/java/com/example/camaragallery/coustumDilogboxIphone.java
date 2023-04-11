package com.example.camaragallery;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.LinearLayout;

import com.example.camaragallery.databinding.ActivityCoustumDilogboxIphoneBinding;
import com.example.camaragallery.databinding.ActivityIphoneCamaraGalleryBinding;

public class coustumDilogboxIphone extends AppCompatActivity {
    ActivityCoustumDilogboxIphoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCoustumDilogboxIphoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        view();
    }

    private void view() {
        binding.button.setOnClickListener(v->{
            Dialog update =new Dialog(this);
            ActivityIphoneCamaraGalleryBinding iphoneCamaraGalleryBinding= ActivityIphoneCamaraGalleryBinding.inflate(getLayoutInflater());
            update. setContentView(iphoneCamaraGalleryBinding.getRoot());
            iphoneCamaraGalleryBinding.txtTake.setOnClickListener(v1 -> {
                Intent galleryy = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);

                gallery.launch(galleryy);
                update.dismiss();
            });
            iphoneCamaraGalleryBinding.txtChoose.setOnClickListener(v1 -> {

                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                camara.launch(i);
                update.dismiss();
            });
            iphoneCamaraGalleryBinding.txtCancel.setOnClickListener(v1 -> {

                update.dismiss();
            });
            update.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            update.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            update.setCancelable(false);
            update.show();
        });
    }
    ActivityResultLauncher<Intent> gallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Uri uri = data.getData();
                        binding.image.setImageURI(uri);


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
                        binding.image.setImageBitmap(b);



                    }
                }
            });
}