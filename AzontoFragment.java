package com.example.android.musicplayerapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AzontoFragment extends Fragment {

    public AzontoFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate ( R.layout.music_list, container, false );
        final ArrayList<Music> music = new ArrayList<Music> ();
        music.add ( new Music ( R.string.azonto_fuse, R.string.azonto_azonto ) );
        music.add ( new Music ( R.string.azonto_eazzy, R.string.azonto_wengeze ) );
        music.add ( new Music ( R.string.azonto_mr_eazi, R.string.azonto_leg_over ) );
        music.add ( new Music ( R.string.azonto_gasmilla, R.string.azonto_telemo ) );
        music.add ( new Music ( R.string.azonto_dj_spinall, R.string.azonto_ohema ) );
        music.add ( new Music ( R.string.azonto_sarkodia, R.string.azonto_u_go_kill_me ) );
        music.add ( new Music ( R.string.azonto_edem, R.string.azonto_ghetto ) );

        ListView listView = rootView.findViewById ( R.id.list );
        MusicAdapter adapter = new MusicAdapter ( getActivity (), music );
        listView.setAdapter ( adapter );
        return rootView;

    }


}
