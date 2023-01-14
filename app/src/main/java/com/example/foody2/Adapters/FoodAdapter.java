package com.example.foody2.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;

import com.example.foody2.Models.FoodModel;
import com.example.foody2.R;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder2> {
    ArrayList<FoodModel> list2;
    Context context2;
    boolean isSelectMode=false;
    ArrayList<FoodModel> selectedItems=new ArrayList<>();

    public FoodAdapter(ArrayList<FoodModel> list2, Context context2) {
        this.list2 = list2;
        this.context2 = context2;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2= LayoutInflater.from(context2).inflate(R.layout.foods_recyclerview,parent,false);

        return new ViewHolder2(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        FoodModel model2=list2.get(position);
     holder.imageView4.setImageResource(model2.getPic2());
        holder.textView9.setText(list2.get(position).getText3());
        holder.textView11.setText(list2.get(position).getText4());
        holder.textView10.setText(list2.get(position).getText5());
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {
        ImageView imageView4;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        @SuppressLint("ResourceAsColor")
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public boolean onLongClick(View view) {
                    isSelectMode=true;
                    if(selectedItems.contains(list2.get(getAdapterPosition())))
                    {
                        itemView.setBackgroundColor(Color.TRANSPARENT);
                        selectedItems.remove((list2.get(getAdapterPosition())));
                    }
                    else
                    {
                        itemView.setBackgroundColor(R.color.teal_200);
                        selectedItems.add((list2.get(getAdapterPosition())));
                    }
                    if(selectedItems.size()==0)
                        isSelectMode=false;
                    return true;
                }
            });
            itemView.setOnClickListener((view) -> {
                if (isSelectMode) {
                    if (selectedItems.contains(list2.get(getAdapterPosition()))) {
                        itemView.setBackgroundColor(Color.TRANSPARENT);

                        selectedItems.remove((list2.get(getAdapterPosition())));
                    } else {
                        itemView.setBackgroundColor(R.color.teal_200);
                        selectedItems.add((list2.get(getAdapterPosition())));
                    }
                    if (selectedItems.size() == 0)
                        isSelectMode = false;
                }
                else
                {

                }
            });

            imageView4=itemView.findViewById(R.id.imageView4);

            textView9=itemView.findViewById(R.id.textView9);
            textView10=itemView.findViewById(R.id.textView10);
            textView11=itemView.findViewById(R.id.textView11);

        }
    }
}
