package com.freed.movie_freed_app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freed.movie_freed_app.R;

import java.util.List;

import com.freed.movie_freed_app.Model.MovieList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MovieView> {

    static List<MovieList> movieLists;
    public static Context context;

    public MyAdapter(Context context, List<MovieList> movieLists) {
        this.context = context;
        this.movieLists = movieLists;
    }

    @NonNull
    @Override
    public MovieView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.moive_list_row, parent, false);

        return new MovieView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieView holder, int position) {

        MovieList movieList = movieLists.get(position);

        holder.title.setText(movieList.getTitle());
        holder.details.setText(movieList.getDetails());
        holder.imageMovie.setImageResource(movieList.getImageView());
    }

    @Override
    public int getItemCount() {

        return movieLists.size();
    }
}
