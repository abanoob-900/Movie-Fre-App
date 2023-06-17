package com.freed.movie_freed_app.Adapters;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.freed.movie_freed_app.DetailsActivity;
import com.freed.movie_freed_app.R;

import com.freed.movie_freed_app.Model.MovieList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieView extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView title, details;
    ImageView imageMovie;
    MovieList movieList;

    public MovieView(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.titleMovieId);
        details = itemView.findViewById(R.id.detailsMovieId);
        imageMovie = itemView.findViewById(R.id.imageMovieId);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int position = getAdapterPosition();

        movieList = MyAdapter.movieLists.get(position);

        Intent intent = new Intent(MyAdapter.context, DetailsActivity.class);

        intent.putExtra("title", movieList.getTitle());
        intent.putExtra("details", movieList.getDetails());
        intent.putExtra("imageView", movieList.getImageView());

        MyAdapter.context.startActivity(intent);
    }
}
