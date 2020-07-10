package com.harpreet.yogaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.harpreet.yogaapp.Adapter.RecyclerViewAdapter;
import com.harpreet.yogaapp.Model.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercises extends AppCompatActivity {
    List<Exercise> exerciseList=new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);
        initData();
        recyclerView=(RecyclerView)findViewById(R.id.list_ex);
        adapter=new RecyclerViewAdapter(exerciseList,getBaseContext());
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        exerciseList.add(new Exercise(R.drawable.simpleyoga,"Simple Yoga"));
        exerciseList.add(new Exercise(R.drawable.straightyoga,"Straight Yoga"));
        exerciseList.add(new Exercise(R.drawable.legstretching,"Leg Stretching"));
        exerciseList.add(new Exercise(R.drawable.circleyoga,"Circle Yoga"));
        exerciseList.add(new Exercise(R.drawable.arcyoga,"Arc Yoga"));
        exerciseList.add(new Exercise(R.drawable.strecthing,"Strecthing Yoga"));
    }
}
