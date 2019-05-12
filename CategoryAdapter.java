package com.example.android.musicplayerapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super ( fm );
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AfrobeatsFragment ();
        } else if (position == 1) {
            return new AzontoFragment ();
        } else if (position == 2) {
            return new DanceHallFragment ();
        } else if (position == 3) {
            return new HighlifeFragment ();
        } else {
            return new HiplifeFragment ();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString ( R.string.category_afrobeats );
        } else if (position == 1) {
            return mContext.getString ( R.string.category_Azonto );
        } else if (position == 2) {
            return mContext.getString ( R.string.category_DanceHall );
        } else if (position == 3) {
            return mContext.getString ( R.string.category_Highlife );
        } else {
            return mContext.getString ( R.string.category_Hiplife );
        }

    }


}
