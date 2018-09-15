package com.app.paul.guidetour.activity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.app.paul.guidetour.adapter.AdapterFragmentPager;
import com.app.paul.guidetour.R;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adapter
        ViewPager mViewPagerTour = findViewById(R.id.view_pager_tour);
        AdapterFragmentPager adapterFragmentPager = new AdapterFragmentPager(getSupportFragmentManager());
        mViewPagerTour.setAdapter(adapterFragmentPager);

        //Tabs set of icons
        TabLayout mTabLayoutHost = findViewById(R.id.tablayout_host);
        mTabLayoutHost.setTabTextColors(ColorStateList.valueOf(Color.parseColor("white")));
        mTabLayoutHost.setupWithViewPager(mViewPagerTour);
        mTabLayoutHost.getTabAt(0).setIcon(R.drawable.ic_restaurant);
        mTabLayoutHost.getTabAt(1).setIcon(R.drawable.ic_cofee);
        mTabLayoutHost.getTabAt(2).setIcon(R.drawable.ic_hotel);
        mTabLayoutHost.getTabAt(3).setIcon(R.drawable.ic_places);
    }

}
