package com.finalproject.bmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainDashboard extends AppCompatActivity {
    //for button
    ImageView nearbutton;
    ImageView farebutton;
    ImageView timingbutton;
    //for navigation

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    // for logout

    private FirebaseAuth mAuth;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        // for navigation

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.nabigationview);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigration_open, R.string.navigration_closed);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


// for Button
        nearbutton = findViewById(R.id.NearbyButton);
        nearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDashboard.this, nearByStops.class);
                startActivity(intent);
            }
        });
        farebutton = findViewById(R.id.fareCalculator);
        farebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainDashboard.this, FareCalculator.class);
                startActivity(intent);

            }
        });

        timingbutton = findViewById(R.id.busTiming);
        timingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDashboard.this, TimingStops.class);
                startActivity(intent);
            }
        });

        // for logout

     /*   navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.share:
                        Toast.makeText(MainDashboard.this, "share", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.home_menu:
                        Toast.makeText(MainDashboard.this, "hhome", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.Logout:
                        Toast.makeText(MainDashboard.this, "logout", Toast.LENGTH_SHORT).show();
                        return true;

                    case R.id.Version:
                        Toast.makeText(MainDashboard.this, "hversion", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.term:
                        Toast.makeText(MainDashboard.this, "term", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return true;
            }
        });
*/

    }
}