package com.example.nouman.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

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
}
