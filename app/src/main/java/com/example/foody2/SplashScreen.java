package com.example.foody2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
         TextView textview;
         LottieAnimationView lottie1;
         ImageView imageView8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        textview=findViewById(R.id.textview);
        lottie1=findViewById(R.id.lottie1);
        imageView8=findViewById(R.id.imageView8);

        imageView8.animate().translationY(500).setDuration(2000).setStartDelay(0);
        textview.animate().translationY(-1400).setDuration(2200).setStartDelay(0);
        lottie1.animate().translationX(2000).setDuration(2000).setStartDelay(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent s=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(s);
                finish();

            }
        },5000);
    }
}