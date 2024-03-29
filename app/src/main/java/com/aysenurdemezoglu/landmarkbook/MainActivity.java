package com.aysenurdemezoglu.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.aysenurdemezoglu.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandMark> landMarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landMarkArrayList = new ArrayList<>();

        LandMark pisa = new LandMark("Pisa","Italy",R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel","France",R.drawable.eiffel);
        LandMark colosseum = new LandMark("Colosseum","Italy",R.drawable.colosseum);
        LandMark londonBridge = new LandMark("London Bridge","England",R.drawable.londonbridge);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
        


    }
}