package com.example.android.materialtab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.android.materialtab.adapter.TabFragmentPagerAdapter;


public class MainActivity extends AppCompatActivity {

//    deklarasi semua komponen yang digunakan

    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up toolbar
        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tabe1");

        //inisiasi tab dan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

//        set object adapter ke dalam ViewPager
        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //manimpilasi sedikit untuk set TextColor pada tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(android.R.color.white));

        //konfigurasi Gravity Fill untuk tab berada di posisi yang proporsional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }


}
