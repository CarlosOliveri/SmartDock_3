package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class MainActivity extends AppCompatActivity {

   private RelativeLayout homeRL;
   private TextView cityNameTV,temperatureTV,conditionTV;
   private RecyclerView weatherRV;
   private ImageView iconIV;
   private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeRL = findViewById(R.id.idRLHome);
        cityNameTV = findViewById(R.id.idTVCityName);
        temperatureTV = findViewById(R.id.idTVTemperature);
        conditionTV = findViewById(R.id.idTVCondition);
        iconIV = findViewById(R.id.idIVIcon);
        // weatherRV = findViewById(R.id.idRVWeather);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSpotifyPlayer();

            }

        });
    }
        public void openSpotifyPlayer(){

            Intent intent = new Intent(this, SpotifyPlayer.class);
            startActivity(intent);


        }



}