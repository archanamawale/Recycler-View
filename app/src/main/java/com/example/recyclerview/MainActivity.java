package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List <ItemData> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        data.add(new ItemData("Artificial Intelligence",R.drawable.search));
        data.add(new ItemData("Android",R.drawable.android));
        data.add(new ItemData("BigData",R.drawable.bigdata));
        data.add(new ItemData("Internet of Things",R.drawable.iot));
        data.add(new ItemData("Machine Learning",R.drawable.learning));
        recyclerAdapter=new RecyclerAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);



//        tech_names.add("Artificial Intelligence");
//        tech_names.add("Android");
//        tech_names.add("Bigdata");
//        tech_names.add("Internet of Things");
//        tech_names.add("Machine Learning");

    }
}