package com.example.nouman.musicstructure;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GridViewAdapter.ItemListener {

    RecyclerView gridRecyclerView;
    ArrayList<GridModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridRecyclerView = findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new GridModel("Play List", R.drawable.baseline_playlist_play_black_48, "#B05F6D" ));
        arrayList.add(new GridModel("Tracks", R.drawable.baseline_library_music_black_48, "#EB6B56"));
        arrayList.add(new GridModel("Albums", R.drawable.baseline_album_black_48, "#FFC153"));
        arrayList.add(new GridModel("Artist", R.drawable.baseline_recent_actors_black_48, "#47B39D"));
        arrayList.add(new GridModel("Genre", R.drawable.baseline_style_black_48, "#EA8D8D"));
        arrayList.add(new GridModel("Favorite", R.drawable.baseline_favorite_border_black_48, "#A890FE"));

        GridViewAdapter adapter = new GridViewAdapter(this, arrayList, this);
        gridRecyclerView.setAdapter(adapter);

        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        gridRecyclerView.setLayoutManager(manager);
    }

    @Override
    public void onItemClick(GridModel item) {
        int i = arrayList.indexOf(item);
        Intent intent;
        switch (i){
            case 0:
                intent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(intent);
                break;
        }
    }
}
