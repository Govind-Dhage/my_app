package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private int[]images={R.drawable.allveg,R.drawable.apple,R.drawable.books,R.drawable.coding,
R.drawable.computee,R.drawable.degree,R.drawable.onion,R.drawable.potato,R.drawable.tomato,R.drawable.smile};
private RecyclerView.LayoutManager layoutManager;
private RecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new GridLayoutManager(this,2);
//        LinearLayout linearLayout= new LinearLayout(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecycleAdapter(images);
        recyclerView.setAdapter(adapter);

    }
}