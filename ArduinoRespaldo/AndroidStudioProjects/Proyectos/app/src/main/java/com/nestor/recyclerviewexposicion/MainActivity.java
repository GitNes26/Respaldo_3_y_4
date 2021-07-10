package com.nestor.recyclerviewexposicion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this);

        LayoutManager.setOrientation((LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager((LayoutManager));

        final List<ModelClaas> modelClaasList = new ArrayList<>();
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 1", "Este es el Muuu de la vaca 1"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 2", "Este es el Muuu de la vaca 2"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 3", "Este es el Muuu de la vaca 3"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 4", "Este es el Muuu de la vaca 4"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 5", "Este es el Muuu de la vaca 5"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 6", "Este es el Muuu de la vaca 6"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 7", "Este es el Muuu de la vaca 7"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 8", "Este es el Muuu de la vaca 8"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 9", "Este es el Muuu de la vaca 9"));
        modelClaasList.add(new ModelClaas(R.drawable.vaca, "Vaca 10", "Este es el Muuu de la vaca 10"));

        Adapter adapter = new Adapter(modelClaasList);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        modelClaasList.get(recyclerView.getChildAdapterPosition(v)).getTitle(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}