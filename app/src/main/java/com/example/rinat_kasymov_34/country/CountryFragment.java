package com.example.rinat_kasymov_34.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rinat_kasymov_34.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private Integer position;
    private ArrayList<CountryModel> countryModels = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerView.setAdapter(countryAdapter);
    }

    private void checkPosition(int position) {
        if (position == 0) {
            loadEurasia();
        } else if (position == 1) {
            loadNorthAmerica();
        } else if (position == 2) {
            loadSouthAmerica();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Victoria_%28Australia%29.svg/2560px-Flag_of_Victoria_%28Australia%29.svg.png", "Victoria"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_New_South_Wales.svg/langru-1500px-Flag_of_New_South_Wales.svg.png", " New South Wales"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Flag_of_Queensland.svg/250px-Flag_of_Queensland.svg.png", "Queensland"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Flag_of_Tasmania.svg/250px-Flag_of_Tasmania.svg.png", "Tasmania"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_South_Australia.svg/250px-Flag_of_South_Australia.svg.png", " South Australia"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Flag_of_Western_Australia_%281870%E2%80%931953%29.svg/240px-Flag_of_Western_Australia_%281870%E2%80%931953%29.svg.png", " West Australia"));


    }

    private void loadAfrica() {
        countryModels.add(new CountryModel("https://cdn.britannica.com/27/4227-004-32423B42/Flag-South-Africa.jpg", "South Africa"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/68/5068-004-72A3F250/Flag-Nigeria.jpg", "Nigeria"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/255px-Flag_of_Morocco.svg.png", "Morocco"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/54/5054-004-A09ABCDF/Flag-Ghana.jpg", "Ghana"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/70/5070-004-2963C5E1/Flag-Senegal.jpg", "Senegal"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/255px-Flag_of_Egypt.svg.png", "Egypt"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/255px-Flag_of_Uganda.svg.png", "Uganda"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/96/4496-004-278A6211/Flag-Sudan.jpg", "Sudan"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/18/18-004-43399622/Flag-Somalia.jpg", "Somali"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/225px-Flag_of_Tunisia.svg.png", "Tunisia"));

    }

    private void loadNorthAmerica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png", "USA"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png", "Canada"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Mexico.jpg/1200px-Flag_of_Mexico.jpg", "Mexico"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/10/5110-004-38075E57/Flag-Cuba.jpg", "Cuba"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/0a/Flag_of_Jamaica.svg", "Jamaica"));
        countryModels.add(new CountryModel("https://media.istockphoto.com/id/1158315128/vector/national-flag-of-bahamas.jpg?s=612x612&w=0&k=20&c=3OiuRpeq9mgvmo1SN5ll84JXFUUyBsmjBeKRR2LUklI=", "Bahama"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Flag_of_Barbados.svg/800px-Flag_of_Barbados.svg.png?20221208002018", "Barbados"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/1200px-Flag_of_Panama.svg.png", "Panama"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/255px-Flag_of_Costa_Rica.svg.png", "Costa Rica"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/5/56/Flag_of_Haiti.svg", "Haiti"));

    }

    private void loadSouthAmerica() {
        countryModels.add(new CountryModel("https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg", "Argentina"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/74/4874-004-50846A53/Flag-Uruguay.jpg", "Uruguay"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/47/6847-004-7D668BB0/Flag-Brazil.jpg", "Brazil"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/2560px-Flag_of_Chile.svg.png", "Chile"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/49/149-004-986E1BD8/flag-design-similarities-Ecuador-Colombia-flags-Venezuela.jpg", "Ecuador"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/255px-Flag_of_Colombia.svg.png", "Columbia"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/54/6754-004-AE3C4294/Flag-Bolivia.jpg", "Bolivia"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/48/3448-004-33B5D198/Flag-Peru.jpg", "Peru"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/04/4904-004-EBEFDE35/Flag-Venezuela.jpg", "Venezuela"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/d/d8/Paraguay_flag.png", "Paraguay"));

    }

    private void loadEurasia() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/250px-Flag_of_Kazakhstan.svg.png", "Kazakhstan"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/2560px-Flag_of_Japan.svg.png", "Japan"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/0b/Flag_of_Indonesia.png", "Indonesia"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Flag_of_Georgia.svg/255px-Flag_of_Georgia.svg.png", "Georgia"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png", "Germany"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/220px-Flag_of_Italy.svg.png", "Italy"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/9/9a/Flag_of_Spain.svg/1200px-Flag_of_Spain.svg.png", "Spain"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Flag_of_Portugal.svg/255px-Flag_of_Portugal.svg.png", "Portugal"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/2560px-Flag_of_France.svg.png", "France"));
    }
}