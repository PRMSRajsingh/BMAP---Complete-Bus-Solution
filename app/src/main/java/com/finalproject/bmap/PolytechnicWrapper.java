package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PolytechnicWrapper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polytechnic_wrapper);

        getSupportFragmentManager().beginTransaction().replace(R.id.PolytechnicWrapper,new PolytechnicFragment()).commit();
    }
}