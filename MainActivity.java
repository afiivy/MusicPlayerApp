package com.example.android.musicplayerapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        //Set content to activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        ViewPager viewPager = findViewById ( R.id.viewpager );
        CategoryAdapter adapter = new CategoryAdapter ( this, getSupportFragmentManager () );
        viewPager.setAdapter ( adapter );
        TabLayout tabLayout = findViewById ( R.id.tabs );
        tabLayout.setupWithViewPager ( viewPager );

    }

}




