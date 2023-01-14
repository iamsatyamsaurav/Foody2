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

public class Chinesefood extends AppCompatActivity {
    Button b2;
    RecyclerView recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinesefood);
        recyclerView3=findViewById(R.id.recyclerview3);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Chinesefood.this,OrderPlaced.class);
                startActivity(p);
            }
        });
        ArrayList<FoodModel> list2=new ArrayList<>();
        list2.add(new FoodModel(R.drawable.friedrice,"Fried rice","Rs120","Fried rice is a dish of cooked rice that has been stir-fried in a wok or a frying pan and is usually mixed with other ingredients such as eggs, vegetables etc"));
        list2.add(new FoodModel(R.drawable.chaomin,"Chowmein","Rs80","Chowmein is a Chinese dish of fried (chow) noodles (mein). The variations are endless depending on the chef or region, stir-fried with pork, chicken, shrimp and vegetables, such as cabbage, beansprouts, bell pepper"));
        list2.add(new FoodModel(R.drawable.springroll,"Spring Roll","Rs100","Spring roll is a traditional Chinese savory snack where a pastry sheet is filled with vegetables, rolled & fried"));
        list2.add(new FoodModel(R.drawable.hakkanoodle,"Hakka Noodle","Rs120","Hakka noodles is a Chinese preparation where boiled noodles are stir fried with sauces and vegetables or meats"));
        list2.add(new FoodModel(R.drawable.chillipotato,"Chilli Potato","Rs80","Chilli potato is a spicy starter snack from the indo-Chinese cuisine where fried potatoes are tossed in a spicy, sour and slightly sweet chilli"));
        list2.add(new FoodModel(R.drawable.manchurian,"Manchurian","Rs130","Manchurian is a class of Indian Chinese dishes made by roughly chopping and deep-frying ingredients such as chicken, cauliflower, prawns, fish, mutton, and paneer, and then sautéeing it in soya sauce"));

        list2.add(new FoodModel(R.drawable.vegmomos,"Momos","Rs80","Momos are bite-size dumplings made with a spoonful of stuffing wrapped in dough. Usually steamed, though they are sometimes fried or steam-fried"));

        list2.add(new FoodModel(R.drawable.chillichicken,"Chicken Chilli","Rs150","Chilli chicken is a sweet, spicy & slightly sour crispy appetizer made with chicken, bell peppers, garlic, chilli sauce & soya sauce"));
        FoodAdapter adapter2=new FoodAdapter(list2,this);
        recyclerView3.setAdapter(adapter2);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        recyclerView3.setLayoutManager(layoutManager2);
    }
}