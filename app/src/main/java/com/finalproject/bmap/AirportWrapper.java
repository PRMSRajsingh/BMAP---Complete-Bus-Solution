package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AirportWrapper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_wrapper);
        getSupportFragmentManager().beginTransaction().replace(R.id.AirportWrapper,new AirportFragment()).commit();

    }
}