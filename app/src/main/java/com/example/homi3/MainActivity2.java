package com.example.homi3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<String> menuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rv = findViewById(R.id.recycler_view);
        menuList.add("Мерседес");
        menuList.add("Бмв");
        menuList.add("Тойта");
        menuList.add("Хонда");
        menuList.add("Ауди");
        menuList.add("Ниссан");
        menuList.add("Лада");
        MenuAdapter adapter = new MenuAdapter(menuList);

        rv.setAdapter(adapter);

    }


}
