package com.example.kgregg.wtf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
    }

    public void openPlay (View view){
        Intent i = new Intent(this, PlayActivity.class);
        startActivity(i);
    }

    public void openPlaylist (View view){
        Intent i = new Intent(this, PlaylistActivity.class);
        startActivity(i);
    }
    public void openFavorite (View view){
        Intent i = new Intent(this, FavoriteActivity.class);
        startActivity(i);
    }
}
