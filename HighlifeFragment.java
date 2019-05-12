package com.example.android.musicplayerapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HighlifeFragment extends Fragment {


    public HighlifeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.music_list, container, false );

        final ArrayList<Music> music = new ArrayList<Music> ();
        music.add ( new Music ( R.string.highlife_dadday_lumba, R.string.highlife_dangerous ) );
        music.add ( new Music ( R.string.highlife_adane, R.string.highlife_maafio ) );
        music.add ( new Music ( R.string.highlife_dede, R.string.highlife_iron_boy ) );
        music.add ( new Music ( R.string.highlife_antwi, R.string.highlife_jerry ) );
        music.add ( new Music ( R.string.highlife_osibisa, R.string.highlife_home ) );

        ListView listView = rootView.findViewById ( R.id.list );
        MusicAdapter adapter = new MusicAdapter
                ( getActivity (), music );
        listView.setAdapter ( adapter );
        return rootView;
    }

}
