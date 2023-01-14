package com.example.foody2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class OrderPlaced extends AppCompatActivity {
    TextView textview20;
    TextView textview21;
    LottieAnimationView lottie2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_placed);
        textview20=findViewById(R.id.textview20);
        textview21=findViewById(R.id.textview21);
        lottie2=findViewById(R.id.lottie2);
    }
}