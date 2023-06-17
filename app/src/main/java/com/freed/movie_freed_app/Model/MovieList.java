package com.freed.movie_freed_app.Model;

public class MovieList {

    String title, details;
    int imageView;

    public MovieList(String title, String details, int year) {
        this.title = title;
        this.details = details;
        this.imageView = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView)
    {
        this.imageView = imageView;
    }
}
