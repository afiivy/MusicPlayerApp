package com.example.android.musicplayerapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super ( context, 0, music );

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );

        }
        Music currentMusic = getItem ( position );
        TextView songTextView = listItemView.findViewById ( R.id.song_text_view );
        songTextView.setText ( currentMusic.getSong () );
        TextView artistTextView = listItemView.findViewById ( R.id.artist_text_view );
        artistTextView.setText ( currentMusic.getArtist () );

        return listItemView;

    }


}