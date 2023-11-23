package com.example.rinat_kasymov_34.continent;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rinat_kasymov_34.R;

import java.util.ArrayList;

import com.example.rinat_kasymov_34.OnCLick;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
   private ArrayList<ContinentModel> continentModels;
   private OnCLick onClick;

   public ContinentAdapter(ArrayList<ContinentModel> continentModels, OnCLick onclick){
       this.continentModels = continentModels;
       this.onClick = onclick;
   }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false ));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentModels.get(position));
        holder.itemView.setOnClickListener(view ->{
          onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentModels.size();
    }
}
