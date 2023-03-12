package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TimingStops extends AppCompatActivity {

    ImageView munshipuliyabutton;
    ImageView polybutton;
    ImageView charbaagbutton;
    ImageView airportbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timing_stops);

        munshipuliyabutton = findViewById(R.id.munshipuliyabutton);
        polybutton = findViewById(R.id.polybutton);
        airportbutton = findViewById(R.id.airportbutton);
        charbaagbutton = findViewById(R.id.charbaagbutton);

        munshipuliyabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimingStops.this, StopWrapperActivity.class);
                startActivity(intent);

            }
        });
        polybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimingStops.this, PolytechnicWrapper.class);
                startActivity(intent);

            }
        });
        charbaagbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimingStops.this, CharbaagWrapper.class);
                startActivity(intent);

            }
        });
        airportbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TimingStops.this, AirportWrapper.class);
                startActivity(intent);

            }
        });

    }
}