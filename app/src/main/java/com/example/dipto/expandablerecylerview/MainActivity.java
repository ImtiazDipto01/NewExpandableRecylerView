package com.example.dipto.expandablerecylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dipto.expandablerecylerview.adapter.GenreAdapter;
import com.example.dipto.expandablerecylerview.models.Artist;
import com.example.dipto.expandablerecylerview.models.Genre;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    GenreAdapter genreAdapter ;
    List<Genre> list ;
    private LinearLayoutManager layoutmanager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.expandable_recyler);
        genreAdapter = new GenreAdapter(getData(), getApplicationContext()) ;
        layoutmanager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setAdapter(genreAdapter);
    }

    private List<Genre> getData(){

        list = new ArrayList<>() ;
        List<Artist> artist = new ArrayList<>() ;

        for(int i = 0; i < 4 ; i++){

            for(int j = 0 ; j < 3 ; j++){
                Artist artistmodel = new Artist() ;

                if(j == 2){
                    artistmodel.setName("Dipto");
                }
                else if(j == 1){
                    artistmodel.setName("Sadikul");
                }
                else if(j == 0){
                    artistmodel.setName("Imtiaz");
                }

                artist.add(artistmodel) ;
            }
            Genre genre = new Genre("Soul Full" + i, artist) ;
            list.add(genre);
        }

        return list ;
    }
}
