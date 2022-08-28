package com.example.myapplication;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class SpotifyPlayer extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_spotify);

        Slidr.attach(this);


    }
}
