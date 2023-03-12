package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StopWrapperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_wrapper);
        getSupportFragmentManager().beginTransaction().replace(R.id.stopWrapper,new StopFragment()).commit();
    }
}