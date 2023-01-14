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

public class Italianfood extends AppCompatActivity {
    Button b3;
    RecyclerView recyclerView4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italianfood);
        recyclerView4=findViewById(R.id.recyclerview4);
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Italianfood.this,OrderPlaced.class);
                startActivity(p);
            }
        });
        ArrayList<FoodModel> list2=new ArrayList<>();
        list2.add(new FoodModel(R.drawable.redpasta,"Red Sause Pasta","Rs100","Red sauce pasta made with tomatoes, onions, garlic,spices & herbs. It's a favorite with toddlers & kids - mildly spiced & tastes delicious!"));
        list2.add(new FoodModel(R.drawable.whitepasta,"White Sause Pasta","Rs130","White sauce pasta is a creamy, delicious and cheesy pasta tossed in white sauce or bechamel sauce. This pasta makes a great meal!"));
        list2.add(new FoodModel(R.drawable.pizzamarga,"Margherita Pizza","Rs350","One of the most loved Italian dishes, it just takes a few simple ingredients and you get insanely delicious results! You just can't go wrong with that tomato, basil and fresh mozzarella combo"));
        list2.add(new FoodModel(R.drawable.pizzachicken,"Chicken Pizza","Rs320","Chicken, sweet Italian sausage, cremini mushrooms, fontina cheese, and sliced red bell pepper are just a few of the ingredients we used to dress this dish up."));
        list2.add(new FoodModel(R.drawable.pomo,"Pomodoro ","Rs150","A light, quick and easy pasta recipe, Fettuccine Pomodoro is a delicious dish for breakfast, brunch or kid's tiffin!"));
        list2.add(new FoodModel(R.drawable.lasagna,"Lasagna","Rs120","The lasagna has the classic combination of tomato and basil along with bacon, lamb and parmesan"));

        list2.add(new FoodModel(R.drawable.tarimusu,"Tiramisu","Rs80","The delightful tiramisu recipe with sponge fingers soaked in coffee, layered around and smeared with a creamy mascarpone mixture"));

        list2.add(new FoodModel(R.drawable.panna,"Panna Cotta","Rs75","A creamy Italian delight, panna cotta is one of the simplest desserts made with just a handful of ingredients"));
        FoodAdapter adapter2=new FoodAdapter(list2,this);
        recyclerView4.setAdapter(adapter2);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        recyclerView4.setLayoutManager(layoutManager2);
    }
}