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

public class Japanesefood extends AppCompatActivity {
    Button b4;
    RecyclerView recyclerView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanesefood);
        recyclerView5=findViewById(R.id.recyclerview5);
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(Japanesefood.this,OrderPlaced.class);
                startActivity(p);
            }
        });
        ArrayList<FoodModel> list2=new ArrayList<>();
        list2.add(new FoodModel(R.drawable.r,"Ramen","Rs130","Ramen (ラーメン) is a noodle soup dish that was originally imported from China and has become one of the most popular dishes in Japan"));
        list2.add(new FoodModel(R.drawable.m,"Miso","Rs120","Miso soup is a traditional Japanese soup that starts with a dashi stock and is flavored with miso paste. Dashi is an umami-rich stock made from dried seaweed and dried fish"));
        list2.add(new FoodModel(R.drawable.fugu,"Fugu","Rs180","Fugu is a fish that is usually served as sashimi or in certain kinds of Japanese nabe hot pots"));
        list2.add(new FoodModel(R.drawable.champon,"Champon","Rs220"," Champon (ちゃんぽん) is a noodle soup dish consisting of pork, seafood, and vegetables served on top of the noodle"));
        list2.add(new FoodModel(R.drawable.gyoza,"Gyoza ","Rs250","The dumplings are prepared with a filling of minced pork meat, cabbage, garlic, onion, and ginger. They are then lightly fried until they become crunchy and of a nice dark-gold color"));
        list2.add(new FoodModel(R.drawable.edamame,"Edamame","Rs220","Edamame (枝豆) is a preparation of immature soybeans in the pod, found in cuisines with origins in East Asia. The pods are boiled or steamed and may be served with salt or other condiments"));

        list2.add(new FoodModel(R.drawable.gyudon,"Gyudon","Rs180","A bowl of steamed rice is topped with thinly sliced beef and tender onion, simmered in dashi broth (a popular Japanese ingredient), and seasoned with mirin and soy sauce"));

        list2.add(new FoodModel(R.drawable.o,"Oden","Rs175","Oden (おでん, 御田) is a type of nabemono (Japanese one-pot dishes), consisting of several ingredients such as boiled eggs, daikon, konjac"));
        FoodAdapter adapter2=new FoodAdapter(list2,this);
        recyclerView5.setAdapter(adapter2);

        LinearLayoutManager layoutManager2=new LinearLayoutManager(this);
        recyclerView5.setLayoutManager(layoutManager2);
    }
}