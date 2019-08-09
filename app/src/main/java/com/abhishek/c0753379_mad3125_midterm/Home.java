package com.abhishek.c0753379_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Home extends AppCompatActivity {
    RecyclerView rvRocket;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rvRocket=findViewById(R.id.rvRocket);
        rvRocket.setLayoutManager(new LinearLayoutManager(this));
        adapter=new HomeAdapter();
        rvRocket.setAdapter(adapter);
    }
}
