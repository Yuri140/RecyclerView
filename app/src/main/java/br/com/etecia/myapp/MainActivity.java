package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView idRecyclerViewFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerViewFilmes = findViewById(R.id.idRecyclerViewFilmes);

        idRecyclerViewFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecyclerViewFilmes.setHasFixedSize(true);

        //idRecyclerViewFilmes.setAdapter(adapter);
        //https://www.amazon.com.br/Prime-Video-Filmes/s?rh=n%3A18730410011%2Cp_n_entity_type%3A19218549011&page=3
    }
}