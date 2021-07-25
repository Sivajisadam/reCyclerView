package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImagesAdapter imagesAdapter;
    ArrayList<Integer> imegesList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.reycycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        imagesAdapter =new ImagesAdapter(this, imegesList);
        recyclerView.setAdapter(imagesAdapter);
        addImagesToList();

    }

    private void addImagesToList() {
        imegesList.add(R.drawable.ntr1);
        imegesList.add(R.drawable.ntr2);
        imegesList.add(R.drawable.ntr3);
        imagesAdapter.notifyDataSetChanged();
    }
}