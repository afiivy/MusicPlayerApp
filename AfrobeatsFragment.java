package com.example.android.musicplayerapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AfrobeatsFragment extends Fragment {
    public AfrobeatsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate
                ( R.layout.music_list, container, false );

        final ArrayList<Music> music = new ArrayList<Music> ();
        music.add ( new Music ( R.string.afrobeats_runtown, R.string.afrobeats_mad_over_you ) );
        music.add ( new Music ( R.string.afrobeats_maleek_berry, R.string.afrobeats_kontrol ) );
        music.add ( new Music ( R.string.afrobeats_el, R.string.afrobeats_obuu_mo ) );
        music.add ( new Music ( R.string.afrobeats_wiyaala, R.string.afrobeats_leno ) );
        music.add ( new Music ( R.string.afrobeats_yxng_bane, R.string.afrobeats_rihanna ) );
        music.add ( new Music ( R.string.afrobeats_davido, R.string.afrobeats_aye ) );

        ListView listView = rootView.findViewById ( R.id.list );
        MusicAdapter adapter = new MusicAdapter
                ( getActivity (), music );
        listView.setAdapter ( adapter );
        return rootView;
    }


}





