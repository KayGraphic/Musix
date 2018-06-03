package com.example.kgregg.wtf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);


        TextView play = (TextView) findViewById(R.id.play_view);
        TextView playlist = (TextView) findViewById(R.id.playlist_view);
        TextView favorites = (TextView) findViewById(R.id.favorite_view);



// Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(FavoriteActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(FavoriteActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

       favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainlistIntent = new Intent(FavoriteActivity.this, FavoriteActivity.class);
                startActivity(mainlistIntent);
            }
        });


    }}