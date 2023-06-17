package com.freed.movie_freed_app;

import com.freed.movie_freed_app.R;
import com.freed.movie_freed_app.Adapters.MyAdapter;
import com.freed.movie_freed_app.Model.MovieList;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<MovieList> movieLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        movieLists = new ArrayList<>();

        adapter = new MyAdapter(this, movieLists);

//        for (int i = 1 ; i < 11 ; i++)
//        {
//            MovieList item1 = new MovieList("Promising Young Woman", "A young woman, traumatized by a tragic event in her past, seeks out vengeance against those who crossed her path.", R.drawable.promising_young_woman2020);
//
//            movieLists.add(item1);
//        }

        recyclerView.setAdapter(adapter);

        ShowItemMovie();
    }

    private void ShowItemMovie() {

        MovieList item1 = new MovieList("Promising Young Woman", "A young woman, traumatized by a tragic event in her past, seeks out vengeance against those who crossed her path.", R.drawable.promising_young_woman2020);
        movieLists.add(item1);

        MovieList item2 = new MovieList("One Night in Miami", "One Night in Miami is a fictional account of one incredible night where icons Muhammad Ali, Malcolm X, Sam Cooke, and Jim Brown gathered discussing their roles in the civil rights movement and cultural upheaval of the 60s.", R.drawable.one_night_in_miami2020);
        movieLists.add(item2);

        MovieList item3 = new MovieList("Soul ", "After landing the gig of a lifetime, a New York jazz pianist suddenly finds himself trapped in a strange land between Earth and the afterlife.", R.drawable.soul2020);
        movieLists.add(item3);

        MovieList item4 = new MovieList("News of the World", "A Civil War veteran agrees to deliver a girl, taken by the Kiowa people years ago, to her aunt and uncle, against her will. They travel hundreds of miles and face grave dangers as they search for a place that either can call home.", R.drawable.news_of_the_world2020);
        movieLists.add(item4);

        MovieList item5 = new MovieList("Wonder Woman 1984", "Diana must contend with a work colleague and businessman, whose desire for extreme wealth sends the world down a path of destruction, after an ancient artifact that grants wishes goes missing.", R.drawable.wonder_woman_1984_2020);
        movieLists.add(item5);

        MovieList item6 = new MovieList("Tenet", "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.", R.drawable.tenet2020);
        movieLists.add(item6);

        MovieList item7 = new MovieList("Run Hide Fight", "17-year-old Zoe Hull uses her wits, survival skills, and compassion to fight for her life, and those of her fellow classmates, against a group of live-streaming school shooters.", R.drawable.run_hide_fight2020);
        movieLists.add(item7);

        MovieList item8 = new MovieList("Pieces of a Woman", "When a young mother's home birth ends in unfathomable tragedy, she begins a year-long odyssey of mourning that fractures relationships with loved ones in this deeply personal story of a woman learning to live alongside her loss.", R.drawable.pieces_of_a_woman2020);
        movieLists.add(item8);

        MovieList item9 = new MovieList("We Can Be Heroes", "When alien invaders kidnap Earth's superheroes, their children must team up and learn to work together if they want to save their parents and the world.", R.drawable.we_can_be_heroes2020);
        movieLists.add(item9);

        MovieList item10 = new MovieList("The King of Staten Island", "Scott has been a case of arrested development since his firefighter dad died. He spends his days smoking weed and dreaming of being a tattoo artist until events force him to grapple with his grief and take his first steps forward in life.", R.drawable.the_king_of_staten_island2020);
        movieLists.add(item10);

        adapter.notifyDataSetChanged();
    }
}