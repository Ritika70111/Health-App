package com.mohvia.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.mohvia.healthapp.R;

public class videos1 extends AppCompatActivity {
    Button clik;
    VideoView videov;
    MediaController  mediac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos1);
        clik=(Button)findViewById(R.id.button14);
        videov=(VideoView)findViewById(R.id.videoView3);
        mediac=new MediaController(this);

    }
    public void videoplay(View v){
       String videopath="android.resource://com.mohvia.healthapp"+R.raw.v1;
        Uri uri=Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();
    }
}
