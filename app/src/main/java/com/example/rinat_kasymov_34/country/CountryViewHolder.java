package com.example.rinat_kasymov_34.country;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.rinat_kasymov_34.R;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgCountry;
    private TextView tvCountry;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        imgCountry = itemView.findViewById(R.id.img_country);
        tvCountry = itemView.findViewById(R.id.tv_country);
    }

    public void bind(CountryModel countryModel) {
        tvCountry.setText(countryModel.getTvCountry());
        Glide.with(imgCountry).load(countryModel.getImgCountry()).into(imgCountry);
    }
}
