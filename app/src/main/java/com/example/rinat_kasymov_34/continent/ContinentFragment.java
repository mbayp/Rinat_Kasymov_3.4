package com.example.rinat_kasymov_34.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rinat_kasymov_34.country.CountryFragment;
import com.example.rinat_kasymov_34.OnCLick;

import com.example.rinat_kasymov_34.R;
import com.example.rinat_kasymov_34.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnCLick {

    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList,this);
        binding.recyclerView.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://img.freepik.com/premium-vector/political-detailed-map-continent-eurasia-with-borders-countries-highly-detailed-political-map-world_599062-908.jpg", "Eurasia"));
        continentList.add(new ContinentModel("https://img.freepik.com/premium-vector/political-detailed-map-continent-north-america-with-borders-highly-detailed-political-map-world_599062-914.jpg?w=2000", "North America"));
        continentList.add(new ContinentModel("https://img.freepik.com/premium-vector/south-america-world-map-map-south-america-continent-silhouette_532867-82.jpg?w=2000", "South America"));
        continentList.add(new ContinentModel("https://img.freepik.com/free-vector/map-africa-flat-style_23-2147793363.jpg", "Africa"));
        continentList.add(new ContinentModel("https://img.freepik.com/premium-vector/political-detailed-map-continent-australia-with-borders-countries-highly-detailed-political-map-world_599062-907.jpg?w=2000", "Australia"));

    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}