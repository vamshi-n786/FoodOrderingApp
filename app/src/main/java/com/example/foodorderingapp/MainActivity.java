package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodorderingapp.Adapters.MainAdapter;
import com.example.foodorderingapp.Models.MainModel;
import com.example.foodorderingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list= new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger", "5","cripsy chessy burger"));
        list.add(new MainModel(R.drawable.pizza,"Pizza", "4","cripsy chessy pizza"));
        list.add(new MainModel(R.drawable.biryani,"Biryani", "10","cripsy chessy biryani"));
        list.add(new MainModel(R.drawable.noodles,"Noodles", "4","cripsy chessy noodles"));
        list.add(new MainModel(R.drawable.sandwidch,"Samdwidch", "8","cripsy chessy sandwidch"));

        MainAdapter adapter= new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }
}