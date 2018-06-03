package com.example.kgregg.wtf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);


        TextView play = (TextView) findViewById(R.id.play_view);
        TextView playlist = (TextView) findViewById(R.id.playlist_view);
        TextView favorites = (TextView) findViewById(R.id.favorite_view);






// Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(PlaylistActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PlaylistActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteslistIntent = new Intent(PlaylistActivity.this, FavoriteActivity.class);
                startActivity(favoriteslistIntent);
            }
        });
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");


        LinearLayout rootView = (LinearLayout)findViewById(R.id.basePlayListView);
        int index = 0;
        while (index < words.size()){


            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));

            rootView.addView(wordView);
            index++;
        }


    }}