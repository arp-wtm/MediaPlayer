package com.example.antonella.mediaplayer;
// Creative Commons page licence for file mp3 used :
// https://commons.wikimedia.org/wiki/File:SoundtrackMartindeRuiter.mp3
// file URL:
// https://upload.wikimedia.org/wikipedia/commons/d/de/SoundtrackMartindeRuiter.mp3
// Di Martin de Ruiter (open beelden) [CC BY-SA 3.0 nl
// (https://creativecommons.org/licenses/by-sa/3.0/nl/deed.en)],
// attraverso Wikimedia Commons

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.soundtrack_martin_de_ruiter);

        Button play = findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {

                mediaPlayer.start();

            }
        });

        Button pause = findViewById(R.id.pause_button);
        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause Button is clicked.
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }
}
