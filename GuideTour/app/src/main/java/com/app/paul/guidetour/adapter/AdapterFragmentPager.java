package com.app.paul.guidetour.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.app.paul.guidetour.fragment.FragmentCofee;
import com.app.paul.guidetour.fragment.FragmentHotels;
import com.app.paul.guidetour.fragment.FragmentPlaces;
import com.app.paul.guidetour.fragment.FragmentRestaurants;

/**
 * Adapter for fragments in the tabs
 */
public class AdapterFragmentPager extends FragmentStatePagerAdapter {

    public AdapterFragmentPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new FragmentRestaurants();
            case 1:
                return new FragmentCofee();
            case 2:
                return new FragmentHotels();
            case 3:
                return new FragmentPlaces();



        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }




}
