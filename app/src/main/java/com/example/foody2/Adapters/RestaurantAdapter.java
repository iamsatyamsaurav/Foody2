package com.example.foody2.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody2.Chinesefood;
import com.example.foody2.Indianfood;
import com.example.foody2.Italianfood;
import com.example.foody2.Japanesefood;
import com.example.foody2.Koreanfood;
import com.example.foody2.Models.RestaurantModel;
import com.example.foody2.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.viewholder1>{
    ArrayList<RestaurantModel>list1;
    Context context1;

    public RestaurantAdapter(ArrayList<RestaurantModel> list1, Context context1) {
        this.list1 = list1;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public viewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1= LayoutInflater.from(context1).inflate(R.layout.restaurant_recylcerview,parent,false);
        return new viewholder1(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder1 holder, int position) {
        RestaurantModel model1=list1.get(position);
        holder.imageView2.setImageResource(model1.getPic1());
        holder.textView5.setText(model1.getText5());
        holder.textView6.setText(model1.getText6());
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class viewholder1 extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView2;
        TextView  textView5;
        TextView textView6;
        public viewholder1(@NonNull View itemView) {
            super(itemView);
            imageView2=itemView.findViewById(R.id.imageView2);
            textView5=itemView.findViewById(R.id.textView5);
            textView6=itemView.findViewById(R.id.textView6);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position =getAdapterPosition();
            switch (position)
            {
                case 0:
                    Intent i0=new Intent(context1, Indianfood.class);
                    context1.startActivity(i0);
                    break;
                case 1:
                    Intent i1=new Intent(context1, Chinesefood.class);
                    context1.startActivity(i1);
                    break;
                case 2:
                    Intent i2=new Intent(context1, Italianfood.class);
                    context1.startActivity(i2);
                    break;
                case 3:
                    Intent i3=new Intent(context1, Japanesefood.class);
                    context1.startActivity(i3);
                    break;
                case 4:
                    Intent i4=new Intent(context1, Koreanfood.class);
                    context1.startActivity(i4);
                    break;
            }
        }
    }
}
