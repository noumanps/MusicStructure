package com.example.nouman.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        TextView playList = findViewById(R.id.play_list_click);
        playList.setOnClickListener(activityListener);

        TextView tracks = findViewById(R.id.track_click);
        tracks.setOnClickListener(activityListener);

        TextView artist = findViewById(R.id.artist_click);
        artist.setOnClickListener(activityListener);

        TextView genre = findViewById(R.id.genre_click);
        genre.setOnClickListener(activityListener);

        TextView album = findViewById(R.id.album_click);
        album.setOnClickListener(activityListener);
    }

    private View.OnClickListener activityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.play_list_click:
                    Intent playListIntent = new Intent(FavoriteActivity.this, PlayListActivity.class);
                    startActivity(playListIntent);
                    break;

                case R.id.track_click:
                    Intent trackIntent = new Intent(FavoriteActivity.this, TracksActivity.class);
                    startActivity(trackIntent);
                    break;

                case R.id.artist_click:
                    Intent artistIntent = new Intent(FavoriteActivity.this, ArtistActivity.class);
                    startActivity(artistIntent);
                    break;

                case R.id.genre_click:
                    Intent genreIntent = new Intent(FavoriteActivity.this, GenreActivity.class);
                    startActivity(genreIntent);
                    break;

                case R.id.album_click:
                    Intent albumIntent = new Intent(FavoriteActivity.this, AlbumsActivity.class);
                    startActivity(albumIntent);
                    break;
            }
        }
    };
}
