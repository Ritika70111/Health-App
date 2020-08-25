package com.mohvia.healthapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class aby extends AppCompatActivity {
     private static final int Request_call=1;

     private Button callBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aby);

        callBtn=findViewById(R.id.button9);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callButton();
            }
        });
    }
    private void callButton(){

        String number="8287965861";
        if(number.trim().length()>0){
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!=
                    PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.CALL_PHONE},Request_call);
            }
            else{
                String dial="tel:"+number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==Request_call){
            if(grantResults.length>0&& grantResults[0]==PackageManager.PERMISSION_GRANTED){
                callButton();
            }
            else{
                Toast.makeText(this,"permission Denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
