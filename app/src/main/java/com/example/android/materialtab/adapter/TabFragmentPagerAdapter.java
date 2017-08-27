package com.example.android.materialtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.android.materialtab.fragment.Tab1Fragment;
import com.example.android.materialtab.fragment.Tab2Fragment;


public class TabFragmentPagerAdapter extends FragmentPagerAdapter{
    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm){

        super(fm);
    }

    //method ini yang akan memanipulasi penampilan fragment di layar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position){

        return title[position];
    }

    @Override
    public int getCount(){

        return title.length;
    }

}
