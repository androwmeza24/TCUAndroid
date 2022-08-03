package com.example.tcu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class santaTeresita extends AppCompatActivity {
    MediaPlayer mp;
    ImageButton play;
    MediaPlayer vmp[]=new MediaPlayer[9];
    int posicion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa_teresita);
        play= (ImageButton) findViewById(R.id.imageButtonPrueba);
        vmp[0]=MediaPlayer.create(this,R.raw.race);
        vmp[1]=MediaPlayer.create(this,R.raw.tea);
        vmp[2]=MediaPlayer.create(this,R.raw.sound);
    }

    public void regresar(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void play_pause(View view){
        if (vmp[posicion].isPlaying()) {
            vmp[posicion].pause();
        }else{
            vmp[posicion].start();
        }
    }
    public void play_pause1(View view){
        if (vmp[3].isPlaying()) {
            vmp[1].pause();
            vmp[2].pause();
            vmp[3].pause();
        }else{
            vmp[3].start();
        }
    }

}