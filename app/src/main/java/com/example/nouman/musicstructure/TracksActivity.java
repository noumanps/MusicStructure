package com.example.nouman.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        TextView playList = findViewById(R.id.play_list_click);
        playList.setOnClickListener(activityListener);

        TextView album = findViewById(R.id.album_click);
        album.setOnClickListener(activityListener);

        TextView artist = findViewById(R.id.artist_click);
        artist.setOnClickListener(activityListener);

        TextView genre = findViewById(R.id.genre_click);
        genre.setOnClickListener(activityListener);

        TextView favorite = findViewById(R.id.favorite_click);
        favorite.setOnClickListener(activityListener);

        final ArrayList<ListModel> songList = new ArrayList<ListModel>();
        for (int i = 1; i <= 15; i++ ){
        songList.add(new ListModel(R.drawable.baseline_play_circle_outline_black_48, "Song " + i, "Artist " + i));
        }

        ListViewAdapter adapter = new ListViewAdapter(this, songList);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ListModel listItem = songList.get(position);
                Toast.makeText(getApplicationContext(), listItem.getSongName() + " is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private View.OnClickListener activityListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.play_list_click:
                    Intent playListIntent = new Intent(TracksActivity.this, PlayListActivity.class);
                    startActivity(playListIntent);
                    break;

                case R.id.album_click:
                    Intent albumIntent = new Intent(TracksActivity.this, AlbumsActivity.class);
                    startActivity(albumIntent);
                    break;

                case R.id.artist_click:
                    Intent artistIntent = new Intent(TracksActivity.this, ArtistActivity.class);
                    startActivity(artistIntent);
                    break;

                case R.id.genre_click:
                    Intent genreIntent = new Intent(TracksActivity.this, GenreActivity.class);
                    startActivity(genreIntent);
                    break;

                case R.id.favorite_click:
                    Intent favoriteIntent = new Intent(TracksActivity.this, FavoriteActivity.class);
                    startActivity(favoriteIntent);
                    break;
            }
        }
    };
}
