package com.finalproject.bmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

public class VerifyOtp extends AppCompatActivity {

    String getotpbackend;

    EditText otp;
    Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        otp = findViewById(R.id.enterOtp);
        verifyButton = findViewById(R.id.verifyOtpButton);

        // Calling otp from previous screen
        getotpbackend = getIntent().getStringExtra("backendotp");

        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!otp.getText().toString().trim().isEmpty()) {
                    String enteredOtp = otp.getText().toString();

                    if (getotpbackend != null) {
                        PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(
                             getotpbackend, enteredOtp
                        );
                        FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential).
                                addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                   if (task.isSuccessful()){
                                       Intent intent = new Intent(getApplicationContext(),MainDashboard.class);
                                       startActivity(intent);
                                       finish();
                                   }else {
                                       Toast.makeText(VerifyOtp.this, "Please Enter correct OTP", Toast.LENGTH_SHORT).show();
                                   }
                                    }
                                });

                    }else {
                        Toast.makeText(VerifyOtp.this, "Please Check your Internet Connection", Toast.LENGTH_SHORT).show();
                    }

                   /* if (otp.getText().toString().trim().length() == 6){
                        Toast.makeText(VerifyOtp.this, "verified", Toast.LENGTH_SHORT).show();
                       // Intent intent = new Intent(getApplicationContext(),MainDashboard.class);
                       // startActivity(intent);
                    }else {
                        Toast.makeText(VerifyOtp.this, "Please Enter the Correct OTP", Toast.LENGTH_SHORT).show();
                    }
                   */
                } else {
                    Toast.makeText(VerifyOtp.this, "Please Enter the OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}