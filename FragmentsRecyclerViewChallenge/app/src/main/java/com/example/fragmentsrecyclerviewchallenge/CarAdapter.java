package com.example.fragmentsrecyclerviewchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    public static final String VOLKSWAGEN = "Volkswagen";
    public static final String MERCEDES = "Mercedes";
    public static final String NISSAN = "Nissan";

    ArrayList<Car> cars;

    public CarAdapter(Context context, ArrayList<Car> list) {
        cars = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMake;
        TextView tvModel, tvOwner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivMake = itemView.findViewById(R.id.ivMake);
            tvModel = itemView.findViewById(R.id.tvModel);
            tvOwner = itemView.findViewById(R.id.tvOwner);
        }
    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(cars.get(position));

        String make = cars.get(position).getMake();
        if (make.equals(VOLKSWAGEN)) {
            holder.ivMake.setImageResource(R.drawable.volkswagen);
        } else if (make.equals(MERCEDES)) {
            holder.ivMake.setImageResource(R.drawable.mercedes);
        } else {
            holder.ivMake.setImageResource(R.drawable.nissan);
        }

        holder.tvModel.setText(cars.get(position).getModel());
        holder.tvOwner.setText(cars.get(position).getOwner());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
