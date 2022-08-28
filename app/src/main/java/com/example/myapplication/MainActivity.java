package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaCodec;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private RelativeLayout homeRL;
   private TextView cityNameTV,temperatureTV,conditionTV;
   private RecyclerView weatherRV;
   private ImageView iconIV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeRL = findViewById(R.id.idRLHome);
        cityNameTV= findViewById(R.id.idTVCityName);
        temperatureTV = findViewById(R.id.idTVTemperature);
        conditionTV = findViewById(R.id.idTVCondition);
        iconIV = findViewById(R.id.idIVIcon);
       // weatherRV = findViewById(R.id.idRVWeather);


    }
}