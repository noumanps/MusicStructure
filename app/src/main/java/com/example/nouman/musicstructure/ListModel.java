package com.example.nouman.musicstructure;

public class ListModel {

    private int mImageResource;

    private String mSongName;

    private String mArtistName;

    public ListModel(int imageResource, String songName, String artistName) {
        mImageResource = imageResource;
        mSongName = songName;
        mArtistName = artistName;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
