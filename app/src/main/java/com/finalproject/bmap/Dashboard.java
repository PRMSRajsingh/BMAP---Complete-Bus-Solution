package com.finalproject.bmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Dashboard extends AppCompatActivity {
    EditText mobileNumber;
    Button otpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        mobileNumber = findViewById(R.id.mobileNumber);
        otpButton = findViewById(R.id.sendOtpButton);


        otpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mobileNumber.getText().toString().trim().isEmpty()) {

                    if (mobileNumber.getText().toString().trim().length() == 10) {

                        // Connect to firebase
                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                                "+91" + mobileNumber.getText().toString(),
                                60,
                                TimeUnit.SECONDS,
                                Dashboard.this,
                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                    @Override
                                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                                    }

                                    @Override
                                    public void onVerificationFailed(@NonNull FirebaseException e) {
                                        Toast.makeText(Dashboard.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                                    }

                                    @Override
                                    public void onCodeSent(@NonNull String backendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                        super.onCodeSent(backendotp, forceResendingToken);
                                        Intent intent = new Intent(getApplicationContext(), VerifyOtp.class);
                                        intent.putExtra("backendotp",backendotp);
                                        startActivity(intent);
                                        finish();


                                    }
                                }
                        );

                    } else {
                        Toast.makeText(Dashboard.this, "Please enter the correct Number", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(Dashboard.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}