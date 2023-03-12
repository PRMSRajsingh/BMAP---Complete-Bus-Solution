package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CharbaagWrapper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charbaag_wrapper);

        getSupportFragmentManager().beginTransaction().replace(R.id.CharbaagWrapper,new CharbaagFragment()).commit();
    }
}