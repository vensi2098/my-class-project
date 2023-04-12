package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.time.Instant;

public class MainActivity2 extends AppCompatActivity {
    TextView txtfname,txtlname,txtmnumber,txtadd,txtemail,txtgender,txthobby1,txthobby2,txthobby3,txthobby4,txthobby5,txthobby6,txtmarried;
    TextView txtyear10,txtyear12,txtyeargdt,txtpar10,txtpar12,txtpargdt,txtjobex,txtinterest;
    TextView txtlang1,txtlang2,txtlang3,txtlang4,txtlang5,txtlang6,txtlang7,txtlang8,txtlang9,txtlang10;
    ImageView btnBack,imgg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findid();
        backbutton();
        glide();

    }

    private void glide() {
        //Glide.with(this).load("https://picsum.photos/200/300").into(imgg);
        Picasso.get().load("https://i.picsum.photos/id/657/200/300.jpg?hmac=EHK6W3Q_p0WAYArHzSre54j6vS3QLdqcMKvty45Bo40").into(imgg);
    }

    private void findid() {
        imgg=findViewById(R.id.profile_image);
        btnBack=findViewById(R.id.btnBack);
        txtfname=findViewById(R.id.txtfname);
        txtlname=findViewById(R.id.txtlname);
        txtmnumber=findViewById(R.id.txtmnumber);
        txtadd=findViewById(R.id.txtadd);
        txtemail=findViewById(R.id.txtemail);
        txtjobex=findViewById(R.id.txtjobex);
        txtinterest=findViewById(R.id.txtinterest);
        txthobby1=findViewById(R.id.txthobby1);
//        txthobby2=findViewById(R.id.txthobby2);
//        txthobby3=findViewById(R.id.txthobby3);
//        txthobby4=findViewById(R.id.txthobby4);
//        txthobby5=findViewById(R.id.txthobby5);
//        txthobby6=findViewById(R.id.txthobby6);
        txtgender=findViewById(R.id.txtgender);
        txtmarried=findViewById(R.id.txtmarried);
        txtyear10=findViewById(R.id.txtyear10);
        txtyear12=findViewById(R.id.txtyear12);
        txtyeargdt=findViewById(R.id.txtyeargdt);
        txtpar10=findViewById(R.id.txtpar10);
        txtpar12=findViewById(R.id.txtpar12);
        txtpargdt=findViewById(R.id.txtpargdt);
        txtlang1=findViewById(R.id.txtlang1);
//        txtlang2=findViewById(R.id.txtlang2);
//        txtlang3=findViewById(R.id.txtlang3);
//        txtlang4=findViewById(R.id.txtlang4);
//        txtlang5=findViewById(R.id.txtlang5);
//        txtlang6=findViewById(R.id.txtlang6);
//        txtlang7=findViewById(R.id.txtlang7);
//        txtlang8=findViewById(R.id.txtlang8);
//        txtlang9=findViewById(R.id.txtlang9);
//        txtlang10=findViewById(R.id.txtlang10);


        String fname=getIntent().getStringExtra("fname");
        String lname=getIntent().getStringExtra("lname");
        String mnumber=getIntent().getStringExtra("mnumber");
        String add=getIntent().getStringExtra("add");
        String email=getIntent().getStringExtra("email");
        String gender=getIntent().getStringExtra("gender" );
        String hobby1=getIntent().getStringExtra("hobby1");
//        String hobby2=getIntent().getStringExtra("hobby2");
//        String hobby3=getIntent().getStringExtra("hobby3");
//        String hobby4=getIntent().getStringExtra("hobby4");
//        String hobby5=getIntent().getStringExtra("hobby5");
//        String hobby6=getIntent().getStringExtra("hobby6");
        String married=getIntent().getStringExtra("married");
        String year10=getIntent().getStringExtra("year10");
        String year12=getIntent().getStringExtra("year12");
        String yeargdt=getIntent().getStringExtra("yeargdt");
        String par10=getIntent().getStringExtra("par10");
        String par12=getIntent().getStringExtra("par12");
        String  pargdt=getIntent().getStringExtra("pargdt");
        String jobex=getIntent().getStringExtra("jobex");
        String  interest=getIntent().getStringExtra("interest");
        String  lang1=getIntent().getStringExtra("lang1");
//        String  lang2=getIntent().getStringExtra("lang2");
//        String lang3=getIntent().getStringExtra("lang3");
//        String  lang4=getIntent().getStringExtra("lang4");
//        String lang5=getIntent().getStringExtra("lang5");
//        String lang6=getIntent().getStringExtra("lang6");
//        String lang7=getIntent().getStringExtra("lang7");
//        String lang8=getIntent().getStringExtra("lang8");
//        String lang9=getIntent().getStringExtra("lang9");
//        String lang10=getIntent().getStringExtra("lang10");


        txtfname.setText("‣  FIRST NAME  :  "+fname);
        txtlname.setText("‣  LAST NAME  :  "+lname);
        txtmnumber.setText("‣  MOBILE NUMBER  :  "+mnumber);
        txtadd.setText("‣  ADDRESS  :  "+add);
        txtemail.setText("‣  EMAIL ID  :  "+email);
        txtgender.setText("‣  GENDER  :  "+gender);
        txthobby1.setText("‣  HOBBY  :  "+hobby1);
//        txthobby2.setText(hobby2);
//        txthobby3.setText(hobby3);
//        txthobby4.setText(hobby4);
//        txthobby5.setText(hobby5);
//        txthobby6.setText(hobby6);
        txtmarried.setText("‣  MARRID STATUS  :  "+married);
        txtyear10.setText("‣  YEAR 10  :  "+year10);
        txtyear12.setText("‣  YEAR 12  :  "+year12);
        txtyeargdt.setText("‣  YEAR GRADUATE  :  "+yeargdt);
        txtpar10.setText("‣  PARSENTAGE 10  :  "+par10);
        txtpar12.setText("‣  PARSENTAGE 12  :  "+ par12);
        txtpargdt.setText("‣  PARSENTAGE GRADUATE  :  "+pargdt);
        txtjobex.setText("‣  PAST JOB EXPERIENCE  :  "+jobex);
        txtinterest.setText("‣  INTETEST  :  "+interest);
        txtlang1.setText("‣  SKILLS  :  "+lang1);
//        txtlang2.setText(lang2);
//        txtlang3.setText(lang3);
//        txtlang4.setText(lang4);
//        txtlang5.setText(lang5);
//        txtlang6.setText(lang6);
//        txtlang7.setText(lang7);
//        txtlang8.setText(lang8);
//        txtlang9.setText(lang9);
//        txtlang10.setText(lang10);

    }
    private void backbutton() {

        btnBack.setOnClickListener(view -> {

            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        });
    }


}