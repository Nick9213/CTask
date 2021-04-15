package com.example.ctask.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ctask.Models.FoodModel;
import com.example.ctask.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsAdapter.ViewHolder> {
    List<FoodModel> foodModelList;
    Context context;
    View view;

    public FoodsAdapter(List<FoodModel> foodModelList, Context context) {
        this.foodModelList = foodModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodModel foodList = foodModelList.get(position);
        holder.tvFoodRating.setText(foodList.getFoodRatings());
        holder.tvFoodCatName.setText(foodList.getFoodCategory());
        holder.tvFoodName.setText(foodList.getFoodName());
        holder.tvFoodPrice.setText(String.format("$ "+foodList.getFoodPrice()));
        Picasso.get().load(foodList.getFoodImage()).into(holder.ivFoodImage);
    }

    @Override
    public int getItemCount() {
        return foodModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFoodImage;
        private TextView tvFoodPrice, tvFoodCatName, tvFoodName, tvFoodRating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoodImage = itemView.findViewById(R.id.ivFoodImage);
            tvFoodRating = itemView.findViewById(R.id.tvfoodRating);
            tvFoodCatName = itemView.findViewById(R.id.tvfoodCatName);
            tvFoodName = itemView.findViewById(R.id.tvFoodName);
            tvFoodPrice = itemView.findViewById(R.id.tvFoodPrice);
        }
    }
}
