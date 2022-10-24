package com.example.homi3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.homi3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import com.example.homi3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private RecyclerView rv;
    private ArrayList<String> menuList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler_view);
        menuList.add("Пицца");
        menuList.add("Шаурма");
        menuList.add("Шорпо");
        menuList.add("Плов");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        menuList.add("Гамбургер");
        MenuAdapter adapter = new MenuAdapter(menuList);

        rv.setAdapter(adapter);

    }

}
