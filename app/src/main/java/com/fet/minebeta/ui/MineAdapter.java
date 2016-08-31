package com.fet.minebeta.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fet.minebeta.R;

/**
 * Created by FET on 27/08/2016.
 * All rights reserved.
 * Please contact @fettucciari.leonardo@gmail.com
 */
public class MineAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MineAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return MineFragment.newInstance("MineCoal", "Coal", 0, 1, R.layout.coal_mine_fragment_layout);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return MineFragment.newInstance("MineIron", "Iron", 1000, 2, R.layout.iron_mine_fragment_layout);
            case 2: // Fragment # 1 - This will show SecondFragment
                return MineFragment.newInstance("MineGold", "Gold", 2000, 5, R.layout.gold_mine_fragment_layout);
            default:
                return null;
        }
    }

}
