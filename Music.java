package com.example.android.musicplayerapp;

public class Music {
    //**Name of artist**/
    private int mArtist;

    private int mSong;

    public Music(int Artist, int Song) {
        mArtist = Artist;
        mSong = Song;

    }

    public int getArtist() {
        return mArtist;
    }

    public int getSong() {
        return mSong;
    }


}
