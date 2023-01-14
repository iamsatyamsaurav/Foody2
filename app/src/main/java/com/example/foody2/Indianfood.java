package com.example.foody2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foody2.Adapters.FoodAdapter;
import com.example.foody2.Models.FoodModel;

import java.util.ArrayList;

public class Indianfood extends AppCompatActivity {
    Button b1;
    RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indianfood);
        recyclerView2=findViewById(R.id.recyclerview2);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Indianfood.this,OrderPlaced.class);
                startActivity(p);
            }
        });
        ArrayList<FoodModel> list2=new ArrayList<>();
        list2.add(new FoodModel(R.drawable.roti,"Plain Roti","Rs15","Roti is the magical stovetop Indian flatbread that puffs up like a baloon with no yeast, baking powder or soda"));
        list2.add(new FoodModel(R.drawable.butternaan,"Butter Naan","Rs35","Butter naan is soft and extremely yummy, it is often served at buffets in festivals or special occasions. Naan, topped with melted butter is a delicious Indian bread"));
        list2.add(new FoodModel(R.drawable.biryani,"Chicken Biryani","Rs200","Chicken Biryani is a delicious savory rice dish that is loaded with spicy marinated chicken, caramelized onions, and flavorful saffron rice"));
        list2.add(new FoodModel(R.drawable.butterchicken,"Butter Chicken","Rs300","Butter Chicken is a type of curry made from chicken with a spiced tomato and butter (makhan) sauce. Its sauce is known for its rich texture"));
        list2.add(new FoodModel(R.drawable.chickencurry,"Chicken Curry","Rs350","A typical curry from the Indian subcontinent consists of chicken stewed in an onion- and tomato-based sauce, flavoured with ginger, garlic, tomato puree, chilli peppers and a variety of spices"));
        list2.add(new FoodModel(R.drawable.paneertikka,"Paneer Tikka","Rs250","Paneer Tikka is an Indian dish made from chunks of paneer marinated in spices and grilled in a tandoor.[1][2] It is a vegetarian alternative to chicken tikka and other meat dishes"));

        list2.add(new FoodModel(R.drawable.shahipaneer,"Shahi Paneer","Rs220","Shahi paneer is a preparation of paneer, native to the Indian subcontinent, consisting of a thick gravy of cream, tomatoes and Indian spices"));

        list2.add(new FoodModel(R.drawable.paneerbutter,"Butter Paneer","Rs220","Paneer Butter Masala is rich and creamy made of butter, paneer, onions, tomatoes, cashew and spice powders, and herbs"));
        list2.add(new FoodModel(R.drawable.kadahipaneer,"Kadahi Paneer","Rs250","Kadai Paneer is a tangy, deeply spiced paneer dish that is perfect for enjoying all year round"));

        FoodAdapter adapter2=new FoodAdapter(list2,this);
        recyclerView2.setAdapter(adapter2);


        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager2);
    }
}