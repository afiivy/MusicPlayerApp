package com.example.android.musicplayerapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DanceHallFragment extends Fragment {

    public DanceHallFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.music_list, container, false );

        ArrayList<Music> music = new ArrayList<Music> ();
        music.add ( new Music ( R.string.dancehall_shatta_wale, R.string.dancehall_kakai ) );
        music.add ( new Music ( R.string.dancehall_stonebwoy, R.string.dancehall_go_higher ) );
        music.add ( new Music ( R.string.dancehall_popcaan, R.string.dancehall_nice ) );
        music.add ( new Music ( R.string.dancehall_magic, R.string.dancehall_gaoue ) );
        music.add ( new Music ( R.string.dancehall_alkaline, R.string.dancehall_atm ) );
        music.add ( new Music ( R.string.dancehall_kranium, R.string.dancehall_believe ) );

        ListView listView = rootView.findViewById ( R.id.list );
        MusicAdapter adapter = new MusicAdapter ( getActivity (), music );
        listView.setAdapter ( adapter );
        return rootView;
    }

}
