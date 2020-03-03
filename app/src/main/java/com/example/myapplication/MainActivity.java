package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup radio_1;
    RadioGroup radio_2;
    RadioGroup radio_3;
    EditText txtMessage;
    Button btnSubmit;
    ImageView imgSubmit1;
    ImageView imgSubmit2;
    ImageView imgSubmit3;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    //String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_1 = findViewById(R.id.radio_group1);
        radio_2 = findViewById(R.id.radio_group2);
        radio_3 = findViewById(R.id.radio_group3);
        txtMessage = findViewById(R.id.txt_message);

        btnSubmit = findViewById(R.id.btn_submit);

        imgSubmit1 = findViewById(R.id.img_square);
        imgSubmit2 = findViewById(R.id.img_triangle);
        imgSubmit3 = findViewById(R.id.img_circle);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1 = radio_1.getCheckedRadioButtonId();
                int selectedId2 = radio_2.getCheckedRadioButtonId();
                int selectedId3 = radio_3.getCheckedRadioButtonId();

                radioButton1 = findViewById(selectedId1);
                radioButton2 = findViewById(selectedId2);
                radioButton3 = findViewById(selectedId3);

                double num1,num2,num3,sum;
                radioButton1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                       int  type = 1;

                    }
                });

                radioButton2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {


                        int type = 2;


                    }
                });

                radioButton3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                       int type = 3;

                    }
                });






                String words = (String) radioButton1.getText()+ "100, " + radioButton2.getText() + "200, " + radioButton3.getText() + "300 " +txtMessage.getText();

                //txtMessage.setText(words);



                 if( TextUtils.isEmpty(txtMessage.getText())){


                    Toast.makeText(MainActivity.this, "Message is Required",Toast.LENGTH_LONG).show();

                }else{
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                    alertDialogBuilder.setMessage(words);
                    alertDialogBuilder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }


            }
        });




    }
}
