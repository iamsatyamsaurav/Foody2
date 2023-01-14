package com.example.foody2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.foody2.Adapters.RestaurantAdapter;
import com.example.foody2.Models.RestaurantModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview1;
//    ImageView imageView2;
    ImageButton imageButton1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview1=findViewById(R.id.recyclerview1);
//        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageButton1=(ImageButton)findViewById(R.id.imagebutton1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(MainActivity.this,Map.class);
                startActivity(m);
            }
        });

        ArrayList<RestaurantModel>list1=new ArrayList<>();
        list1.add(new RestaurantModel(R.drawable.indian,"Indian Paradise       (4.2/5 star)","The Indian cuisine offers a great variety of authentic Indian food loaded with great taste and aroma"));
        list1.add(new RestaurantModel(R.drawable.chinese,"The Chinese Cuisine  (3.9/5 star)","Chinese Paradise is the best place where one can get authentic chinese food that has diversified color and excellent taste"));
        list1.add(new RestaurantModel(R.drawable.italian,"Slice of Italy       (4.0/5 star)","If you are craving for the real italian taste, this is the best place to try out italian cuisines"));
        list1.add(new RestaurantModel(R.drawable.japanese,"The Susi Gen        (3.7/5 star)","The place were India feels like Japan with the delicious Japanese foods and great vibes"));
        list1.add(new RestaurantModel(R.drawable.korean,"Ticket to Korea       (4.1/5 star)","The best place for meat eaters to satisfy their craving for meat and what can be better than Ticket to Korea for experiencing Korean food"));
        RestaurantAdapter adapter= new RestaurantAdapter(list1, this);
        recyclerview1.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerview1.setLayoutManager(layoutManager);
    }
}