package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HiplifeFragment extends Fragment {
    public HiplifeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.music_list, container, false );

        final ArrayList<Music> music = new ArrayList<Music> ();
        music.add ( new Music ( R.string.hiplife_ebony, R.string.hiplife_fada ) );
        music.add ( new Music ( R.string.hiplife_bisa_kdei, R.string.hiplife_brother ) );
        music.add ( new Music ( R.string.hiplife_gunu, R.string.hiplife_mbrantie ) );
        music.add ( new Music ( R.string.hiplife_manifest, R.string.hiplife_woa ) );
        music.add ( new Music ( R.string.hiplife_obour, R.string.hiplife_obour2 ) );
        music.add ( new Music ( R.string.hiplife_kinaata, R.string.hiplife_confession ) );

        ListView listView = rootView.findViewById ( R.id.list );
        MusicAdapter adapter = new MusicAdapter
                ( getActivity (), music );
        listView.setAdapter ( adapter );

        return rootView;
    }


}
