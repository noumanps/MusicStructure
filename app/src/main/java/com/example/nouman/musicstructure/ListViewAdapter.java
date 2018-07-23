package com.example.nouman.musicstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ListModel> {

    public ListViewAdapter(Context context, ArrayList<ListModel> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListModel currentListItem = getItem(position);

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentListItem.getImageResource());

        TextView songText = listItemView.findViewById(R.id.song_text_view);
        songText.setText(currentListItem.getSongName());

        TextView artistText = listItemView.findViewById(R.id.artist_text_view);
        artistText.setText(currentListItem.getArtistName());

        return listItemView;
    }

}
