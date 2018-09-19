package com.example.user.birthdaycard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondpage extends AppCompatActivity {
MediaPlayer voice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        Intent intent=getIntent();
        voice=MediaPlayer.create(secondpage.this,R.raw.momvoice);
        }
    public void playvoice(View view)
    {
        voice.start();
    }
    public void handleonclick2(View view)
    {
        Intent intent2=new Intent(this,thirdpage.class);
        startActivity(intent2);

    }
}
