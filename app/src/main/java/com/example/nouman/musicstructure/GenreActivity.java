package com.example.nouman.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        TextView playList = findViewById(R.id.play_list_click);
        playList.setOnClickListener(activityListener);

        TextView tracks = findViewById(R.id.track_click);
        tracks.setOnClickListener(activityListener);

        TextView artist = findViewById(R.id.artist_click);
        artist.setOnClickListener(activityListener);

        TextView album = findViewById(R.id.album_click);
        album.setOnClickListener(activityListener);

        TextView favorite = findViewById(R.id.favorite_click);
        favorite.setOnClickListener(activityListener);
    }

    private View.OnClickListener activityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.play_list_click:
                    Intent playListIntent = new Intent(GenreActivity.this, PlayListActivity.class);
                    startActivity(playListIntent);
                    break;

                case R.id.track_click:
                    Intent trackIntent = new Intent(GenreActivity.this, TracksActivity.class);
                    startActivity(trackIntent);
                    break;

                case R.id.artist_click:
                    Intent artistIntent = new Intent(GenreActivity.this, ArtistActivity.class);
                    startActivity(artistIntent);
                    break;

                case R.id.album_click:
                    Intent albumIntent = new Intent(GenreActivity.this, AlbumsActivity.class);
                    startActivity(albumIntent);
                    break;

                case R.id.favorite_click:
                    Intent favoriteIntent = new Intent(GenreActivity.this, FavoriteActivity.class);
                    startActivity(favoriteIntent);
                    break;
            }
        }
    };
}
