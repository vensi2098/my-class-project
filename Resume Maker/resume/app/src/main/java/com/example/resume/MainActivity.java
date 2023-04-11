package com.example.resume;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    EditText edtFname, edtLname, edtMoNumber, edtAddress, edtEid, edtYear10, edtYear12, edtYearGdt, edtPar10, edtPar12, edtParGdt, edtPje, edtInterest;
    CheckBox chkMusic, chkDancing, chkReading, chkSinging, chkWriting, chkDriving;
    CheckBox chkC, chkCPlus, chkCHes, chkCss, chkJava, chkKotlin, chkAndroid, chkWebdegine, chkHtml, chkPhp;
    RadioGroup RGroup1, RGroup2;
    AppCompatButton btnSub;

    String gender, married, hobby1, hobby2, hobby3, hobby4, hobby5, hobby6;// declair variable
    String lang1, lang2, lang3, lang4, lang5, lang6, lang7, lang8, lang9, lang10; // declair variable

    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resume();
        output();


    }


    private void resume() {
        edtFname = findViewById(R.id.edtFname);
        edtLname = findViewById(R.id.edtLname);
        edtMoNumber = findViewById(R.id.edtMoNumber);
        edtAddress = findViewById(R.id.edtAddress);
        edtEid = findViewById(R.id.edtEid);
        edtYear10 = findViewById(R.id.edtYear10);
        edtYear12 = findViewById(R.id.edtYear12);
        edtYearGdt = findViewById(R.id.edtYearGdt);
        edtPar10 = findViewById(R.id.edtPar10);
        edtPar12 = findViewById(R.id.edtPar12);
        edtParGdt = findViewById(R.id.edtParGdt);
        edtPje = findViewById(R.id.edtPje);
        edtInterest = findViewById(R.id.edtInterest);
        chkMusic = findViewById(R.id.chkMusic);
        chkDancing = findViewById(R.id.chkDancing);
        chkReading = findViewById(R.id.chkReading);
        chkSinging = findViewById(R.id.chkSinging);
        chkWriting = findViewById(R.id.chkWriting);
        chkDriving = findViewById(R.id.chkDriving);
        chkC = findViewById(R.id.chkC);
        chkCPlus = findViewById(R.id.chkCPlus);
        chkCHes = findViewById(R.id.chkCHes);
        chkCss = findViewById(R.id.chkCss);
        chkJava = findViewById(R.id.chkJava);
        chkKotlin = findViewById(R.id.chkKotlin);
        chkAndroid = findViewById(R.id.chkAndroid);
        chkWebdegine = findViewById(R.id.chkWebdegine);
        chkHtml = findViewById(R.id.chkHtml);
        chkPhp = findViewById(R.id.chkPhp);
        btnSub = findViewById(R.id.btnSub);
        RGroup1 = findViewById(R.id.Rgroup1);
        RGroup2 = findViewById(R.id.Rgroup2);

    }

    private void output() {

        btnSub.setOnClickListener(view -> {

            String fname = edtFname.getText().toString();
            String lname = edtLname.getText().toString();
            String mnumber = edtMoNumber.getText().toString();
            String add = edtAddress.getText().toString();
            String email = edtEid.getText().toString();
            String year10 = edtYear10.getText().toString();
            String year12 = edtYear12.getText().toString();
            String yeargdt = edtYearGdt.getText().toString();
            String par10 = edtPar10.getText().toString();
            String par12 = edtPar12.getText().toString();
            String pargdt = edtParGdt.getText().toString();
            String jobex = edtPje.getText().toString();
            String interest = edtInterest.getText().toString();


            // for radio button

            int selected = RGroup1.getCheckedRadioButtonId();
            RadioButton rb = findViewById(selected);
            if (selected != -1) {
                gender = rb.getText().toString();
            }
            int selected1 = RGroup2.getCheckedRadioButtonId();
            RadioButton rb1 = findViewById(selected1);

            if (selected1 != -1) {
                married = rb1.getText().toString();
            }

            // for chekbox hobby

            if (chkMusic.isChecked()) {
                sb.append(" " + chkMusic.getText().toString());
            }
            if (chkDancing.isChecked()) {
                sb.append(" " + chkDancing.getText().toString());
            }
            if (chkReading.isChecked()) {
                sb.append(" " + chkReading.getText().toString());
            }
            if (chkSinging.isChecked()) {
                sb.append(" " + chkSinging.getText().toString());
            }
            if (chkWriting.isChecked()) {
                sb.append(" " + chkWriting.getText().toString());
            }
            if (chkDriving.isChecked()) {
                sb.append(" " + chkDriving.getText().toString());
            }

            // for chekbox lang


            if (chkC.isChecked()) {
                sb1.append("  " + chkC.getText().toString());
            }
            if (chkCPlus.isChecked()) {
                sb1.append("  " + chkCPlus.getText().toString());
            }
            if (chkCHes.isChecked()) {
                sb1.append("  " + chkCHes.getText().toString());
            }
            if (chkCss.isChecked()) {
                sb1.append(" " + chkCss.getText().toString());
            }
            if (chkJava.isChecked()) {
                sb1.append(" " + chkJava.getText().toString());
            }
            if (chkKotlin.isChecked()) {
                sb1.append("  " + chkKotlin.getText().toString());
            }
            if (chkAndroid.isChecked()) {
                sb1.append("  " + chkAndroid.getText().toString());
            }
            if (chkWebdegine.isChecked()) {
                sb1.append("  " + chkWebdegine.getText().toString());
            }
            if (chkHtml.isChecked()) {
                sb1.append("  " + chkHtml.getText().toString());
            }
            if (chkPhp.isChecked()) {
                sb1.append(" " + chkPhp.getText().toString());
            }

            //       for all tost massage and validastion

            if (fname.isEmpty()) {
                Toast.makeText(this, "please enter first name", Toast.LENGTH_SHORT).show();
            } else if (fname.length() < 4 || fname.length() > 10) {
                Toast.makeText(this, "please enter first name  more than 4 latter ", Toast.LENGTH_SHORT).show();
            } else if (lname.isEmpty()) {
                Toast.makeText(this, "Please enter your last name ", Toast.LENGTH_SHORT).show();
            } else if (lname.length() < 4 || lname.length() > 10) {
                Toast.makeText(this, "please enter last name more than 3 latter ", Toast.LENGTH_SHORT).show();
            } else if (mnumber.isEmpty()) {
                Toast.makeText(this, "Please enter your mobile number ", Toast.LENGTH_SHORT).show();
            } else if (mnumber.length() < 10) {
                Toast.makeText(this, "please enter your mobile number wrong ,more than 9 latter", Toast.LENGTH_SHORT).show();
            } else if (add.isEmpty()) {
                Toast.makeText(this, "Please enter your address ", Toast.LENGTH_SHORT).show();
            } else if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email ", Toast.LENGTH_SHORT).show();
            } else if (gender == null) {
                Toast.makeText(this, "Please enter your gender ", Toast.LENGTH_SHORT).show();
            } else if (sb == null) {
                // && hobby2 == null && hobby3 == null && hobby4 == null &&  hobby5 == null && hobby6== null)
                Toast.makeText(this, "Please enter any  hobby ", Toast.LENGTH_SHORT).show();
            } else if (married == null) {
                Toast.makeText(this, "Please enter married status ", Toast.LENGTH_SHORT).show();
            } else if (year10.isEmpty()) {
                Toast.makeText(this, "Please enter year10 ", Toast.LENGTH_SHORT).show();
            } else if (year12.isEmpty()) {
                Toast.makeText(this, "Please enter year12 ", Toast.LENGTH_SHORT).show();
            } else if (yeargdt.isEmpty()) {
                Toast.makeText(this, "Please enter graduate ", Toast.LENGTH_SHORT).show();
            } else if (par10.isEmpty()) {
                Toast.makeText(this, "Please enter parsentage10 ", Toast.LENGTH_SHORT).show();
            } else if (par12.isEmpty()) {
                Toast.makeText(this, "Please enter parsentage12 ", Toast.LENGTH_SHORT).show();
            } else if (pargdt.isEmpty()) {
                Toast.makeText(this, "Please enter parsentage  graduate  ", Toast.LENGTH_SHORT).show();
            } else if (jobex.isEmpty()) {
                Toast.makeText(this, "Please enter past job experience  ", Toast.LENGTH_SHORT).show();
            } else if (interest.isEmpty()) {
                Toast.makeText(this, "Please enter interest ", Toast.LENGTH_SHORT).show();
            } else if (sb1 == null) {
//                && lang2 == null && lang3 == null && lang4 == null && lang5 == null && lang6 == null && lang7 == null && lang8 == null && lang9 == null && lang10 == null)

                Toast.makeText(this, "Please select any one hobby ", Toast.LENGTH_SHORT).show();
            } else {


                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("fname", fname);
                i.putExtra("lname", lname);
                i.putExtra("mnumber", mnumber);
                i.putExtra("add", add);
                i.putExtra("email", email);
                i.putExtra("gender", gender);
                i.putExtra("hobby1", " " + sb);
//                i.putExtra("hobby2",hobby2);
//                i.putExtra("hobby3",hobby3);
//                i.putExtra("hobby4",hobby4);
//                i.putExtra("hobby5",hobby5);
//                i.putExtra("hobby6",hobby6);
                i.putExtra("married", married);
                i.putExtra("year10", year10);
                i.putExtra("year12", year12);
                i.putExtra("yeargdt", yeargdt);
                i.putExtra("par10", par10);
                i.putExtra("par12", par12);
                i.putExtra("pargdt", pargdt);
                i.putExtra("jobex", jobex);
                i.putExtra("interest", interest);
                i.putExtra("lang1", " " + sb1);
//                i.putExtra("lang2",lang2);
//                i.putExtra("lang3",lang3);
//                i.putExtra("lang4",lang4);
//                i.putExtra("lang5",lang5);
//                i.putExtra("lang6",lang6);
//                i.putExtra("lang7",lang7);
//                i.putExtra("lang8",lang8);
//                i.putExtra("lang9",lang9);
//                i.putExtra("lang10",lang10);


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("File Master");
                builder.setMessage("Detected some apps Slowing down charging speed. click to improve");
                builder.setPositiveButton("OPTIMIZE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setTitle("upload");
                        builder1.setMessage("are you shure want to upload");
                        builder1.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int c) {
                                Toast.makeText(MainActivity.this, "upload succsess", Toast.LENGTH_SHORT).show();
                                startActivity(i);
                            }
                        });
                        builder1.setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "This is no", Toast.LENGTH_SHORT).show();

                            }
                        });
                        builder1.show();

                        Toast.makeText(MainActivity.this, "This is optimize", Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNegativeButton("LATTER", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {


                        Toast.makeText(MainActivity.this, "This is latter", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();

            }


//            StringBuilder str=new StringBuilder("");
//            str.append(hobby1);
//            str.append(hobby2);
//            str.append(hobby3);
//            str.append(hobby4);
//            str.append(hobby5);
//            str.append(hobby6);
        });
    }
}