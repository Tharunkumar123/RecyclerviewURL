package com.example.recyclerviewurl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.ViewHolder> {
    ArrayList<DataItems> dataItems;
    Bitmap bitmap;

    CustomAdaptor(ArrayList<DataItems> dataItems) {
        this.dataItems = dataItems;

    }


    @NonNull
    @Override
    public CustomAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        DataItems objDataItems = dataItems.get(position);
        holder.title.setText(objDataItems.title);
        DownloadImageWithURLTask downloadImageWithURLTask = new DownloadImageWithURLTask(holder.imageURL, holder.progressBar);
        downloadImageWithURLTask.execute(objDataItems.movieImage);
//        holder.movieImage.setImageDrawable(holder.movieImage.getContext().getResources().getDrawable(objDataItems.imageURL));

//        Glide.with(holder.imageURL.getContext())
//                .load(objDataItems.movieImage)
//                .into(holder.imageURL);
        holder.year.setText(objDataItems.year);
        holder.genre.setText(objDataItems.genre);
        holder.rating.setText(objDataItems.rating);
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageURL;
        TextView year;
        TextView genre;
        TextView rating;
        ProgressBar progressBar;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.movie_title);
            imageURL = itemView.findViewById(R.id.movie_image);
            year = itemView.findViewById(R.id.year);
            genre = itemView.findViewById(R.id.movie_genres);
            rating = itemView.findViewById(R.id.movie_rating);
            progressBar = itemView.findViewById(R.id.progressBar);

        }


    }

    private class DownloadImageWithURLTask extends AsyncTask<String, String, Bitmap> {
        ImageView movieImage;
        ProgressBar progressBar;

        public DownloadImageWithURLTask(ImageView movieImage, ProgressBar progressBar) {
            this.movieImage = movieImage;
            this.progressBar = progressBar;
        }

        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        protected Bitmap doInBackground(String... urls) {

            try {

                bitmap = BitmapFactory.decodeStream((InputStream) new URL(urls[0]).getContent());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }


        protected void onPostExecute(Bitmap result) {
            if (result != null) {
                progressBar.setVisibility(View.GONE);
                movieImage.setImageBitmap(result);


            }


        }
    }
}

