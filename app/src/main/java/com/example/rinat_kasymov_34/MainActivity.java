package com.example.rinat_kasymov_34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rinat_kasymov_34.continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}