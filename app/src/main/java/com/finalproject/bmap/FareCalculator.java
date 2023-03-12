package com.finalproject.bmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FareCalculator extends AppCompatActivity {

    EditText fromField, toField;
    TextView resultView,distanceMeasure,estTime;
    Button getfare;
    String Munshipuliya = "Munshipuliya";
    String Polytechnic = "Polytechnic";
    String Hazratganj = "Hazratganj";
    String Charbaag = "Charbaag";
    String Airport = "Airport";
    String fromFieldString, toFieldString;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_calculator);


        fromField = findViewById(R.id.fareFromField);
        toField = findViewById(R.id.fareToField);
        getfare = findViewById(R.id.getFareButton);
        resultView = findViewById(R.id.fareResult);
        distanceMeasure = findViewById(R.id.distanceMeasure);
        estTime = findViewById(R.id.estTime);


        getfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fromFieldString = fromField.getText().toString();
                toFieldString = toField.getText().toString();
// For Fare Caluclulation 
                
                //  From Munshipuliya
                
                if (fromFieldString.equals(Munshipuliya) && toFieldString.equals(Polytechnic)) { resultView.setText("10");
                distanceMeasure.setText("2 KM");
                estTime.setText("5 Minute");}
                if (fromFieldString.equals(Munshipuliya) && toFieldString.equals(Hazratganj)) { resultView.setText("30");
                    distanceMeasure.setText("8 KM");
                    estTime.setText("20 Minute");}
                if (fromFieldString.equals(Munshipuliya) && toFieldString.equals(Charbaag)) { resultView.setText("40");
                    distanceMeasure.setText("12 KM");
                    estTime.setText("30 Minute");}
                if (fromFieldString.equals(Munshipuliya) && toFieldString.equals(Airport)) { resultView.setText("60");
                    distanceMeasure.setText("22 KM");
                    estTime.setText("60 Minute");}
                //from Polytechnic
                if (fromFieldString.equals(Polytechnic) && toFieldString.equals(Airport)) {resultView.setText("50");
                    distanceMeasure.setText("20 KM");
                    estTime.setText("55 Minute");}
                if (fromFieldString.equals(Polytechnic) && toFieldString.equals(Charbaag)) {resultView.setText("25");
                    distanceMeasure.setText("10 KM");
                    estTime.setText("25 Minute");}
                if (fromFieldString.equals(Polytechnic) && toFieldString.equals(Hazratganj)) {resultView.setText("20");
                    distanceMeasure.setText("7 KM");
                    estTime.setText("20 Minute");}
                if (fromFieldString.equals(Polytechnic) && toFieldString.equals(Munshipuliya)) {resultView.setText("10");
                    distanceMeasure.setText("2 KM");
                    estTime.setText("5 Minute");}
                // From Hazratganj
                
                if (fromFieldString.equals(Hazratganj) && toFieldString.equals(Munshipuliya)) {resultView.setText("30");
                    distanceMeasure.setText("8 KM");
                    estTime.setText("20 Minute");}
                if (fromFieldString.equals(Hazratganj) && toFieldString.equals(Polytechnic)) {resultView.setText("20"); distanceMeasure.setText("7 KM");
                    estTime.setText("25 Minute");}
                if (fromFieldString.equals(Hazratganj) && toFieldString.equals(Charbaag)) {resultView.setText("10");
                    distanceMeasure.setText("4 KM");
                    estTime.setText("10 Minute");}
                if (fromFieldString.equals(Hazratganj) && toFieldString.equals(Airport)) {resultView.setText("30");
                    distanceMeasure.setText("15 KM");
                    estTime.setText("45 Minute");}
                
                //From Charbaag
                if (fromFieldString.equals(Charbaag) && toFieldString.equals(Airport)) {resultView.setText("20");
                    distanceMeasure.setText("13 KM");
                    estTime.setText("40 Minute");}
                if (fromFieldString.equals(Charbaag) && toFieldString.equals(Hazratganj)) {resultView.setText("10");
                    distanceMeasure.setText("4 KM");
                    estTime.setText("10 Minute");}
                if (fromFieldString.equals(Charbaag) && toFieldString.equals(Polytechnic)) {resultView.setText("25");
                    distanceMeasure.setText("10 KM");
                    estTime.setText("25 Minute");}
                if (fromFieldString.equals(Charbaag) && toFieldString.equals(Munshipuliya)) {resultView.setText("40");
                    distanceMeasure.setText("12 KM");
                    estTime.setText("30 Minute");}

                // From Airport
                if (fromFieldString.equals(Airport) && toFieldString.equals(Munshipuliya)) {resultView.setText("60");
                    distanceMeasure.setText("22 KM");
                    estTime.setText("60 Minute");}
                if (fromFieldString.equals(Airport) && toFieldString.equals(Polytechnic)) {resultView.setText("50");
                    distanceMeasure.setText("20 KM");
                    estTime.setText("55 Minute");}
                if (fromFieldString.equals(Airport) && toFieldString.equals(Hazratganj)) {resultView.setText("30");
                    distanceMeasure.setText("15 KM");
                    estTime.setText("45 Minute");}
                if (fromFieldString.equals(Airport) && toFieldString.equals(Charbaag)) {resultView.setText("20");
                    distanceMeasure.setText("13 KM");
                    estTime.setText("40 Minute");}


                
                

            }
        });

    }
}