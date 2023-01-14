package com.example.foody2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foody2.Adapters.FoodAdapter;
import com.example.foody2.Models.FoodModel;

import java.util.ArrayList;

public class Koreanfood extends AppCompatActivity {
    Button b5;
    RecyclerView recyclerView6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreanfood);
        recyclerView6=findViewById(R.id.recyclerview6);
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Koreanfood.this,OrderPlaced.class);
                        startActivity(p);
            }
        });
        ArrayList<FoodModel> list2=new ArrayList<>();
        list2.add(new FoodModel(R.drawable.seol,"Seolleongtang","Rs150","The winter soup is made from ox bones and beef bones boiled over for hours. The white-colored soups is reach in proteins"));
        list2.add(new FoodModel(R.drawable.tteo,"Tteokbokki","Rs180","Tteokbokki is a famous Korean street food in Seoul which is made with sweet and chewy rice cakes and fish cakes"));
        list2.add(new FoodModel(R.drawable.kimbap,"Kimbap","Rs220","It is made with sushi rice, meat, spinach, and stir-fried vegetables wrapped in a seaweed roll. The roll is then cut to small bite-sized discs and served with kimchi"));
        list2.add(new FoodModel(R.drawable.hap,"Haemul Pajeon","Rs120","This is a pancake made with rice and egg batter mixed with a variety of seafood and green onions. Common seafood items include shellfish, oysters, shrimp, and squid"));
        list2.add(new FoodModel(R.drawable.kimchi,"Kimchi","Rs100","Kimchi is a spicy, crunchy salad made up from fermented vegetables with cabbage as its main ingredient"));
        list2.add(new FoodModel(R.drawable.samgyeopsal,"Samgyeopsal","Rs200","The strips of thick prk belly grilled meat are dipped in seasoning made with sesame oil and wrapped in lettuce along with a strip of garlic and onion"));

        list2.add(new FoodModel(R.drawable.jap,"Japchae","Rs250","Japchae is made up of glass noodles stirred in sesame oil with beef, mushrooms, and an assortment of other vegetables. These clear, thin noodles are made with sweet potato"));

        list2.add(new FoodModel(R.drawable.bibi,"Bibimbap","Rs175","Bibimbap is a tasty mixture of rice, vegetables, beef, gochujang (hot chili paste), and a fried egg seasoned with soy sauce and sesame seeds"));
        FoodAdapter adapter2=new FoodAdapter(list2,this);
        recyclerView6.setAdapter(adapter2);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        recyclerView6.setLayoutManager(layoutManager2);
    }
}