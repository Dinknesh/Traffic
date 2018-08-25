package com.example.amanda.traffic.Fragment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter2 extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PageAdapter2(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                StepListFragment tab1 = new StepListFragment();
                return tab1;
            case 1:
                StepMapFragment tab2 = new StepMapFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
