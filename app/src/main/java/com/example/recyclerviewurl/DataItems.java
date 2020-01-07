package com.example.recyclerviewurl;

import android.widget.ImageView;
import android.widget.ProgressBar;

public class DataItems {

    public String title;
    public String year;
    public String genre;
    public String rating;

   String movieImage;


    public DataItems(String movieImage,String title, String year, String genre, String rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
//        this.imageId = imageId;
        this.movieImage=movieImage;
    }
}
