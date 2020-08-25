package com.mohvia.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
     private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        btn1=(Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openActivity2();
            }
        });
        btn2=(Button)findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        btn3=(Button)findViewById(R.id.button4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        btn4=(Button)findViewById(R.id.button5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
    }
    public void openActivity2(){
        Intent intent=new Intent(this,music.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent=new Intent(this,videos.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent=new Intent(this,questionnaire.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent=new Intent(this,psychiatrist.class);
        startActivity(intent);
    }
}
