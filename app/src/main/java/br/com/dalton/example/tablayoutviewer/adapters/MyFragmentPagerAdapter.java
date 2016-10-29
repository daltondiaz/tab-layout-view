package br.com.dalton.example.tablayoutviewer.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.dalton.example.tablayoutviewer.fragments.FirstFragment;
import br.com.dalton.example.tablayoutviewer.fragments.SecondFragment;

/**
 * Created by Dalton on 29/10/2016.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    private String[] mTableTitles;

    public MyFragmentPagerAdapter(FragmentManager fm, String[] mTableTitles) {
        super(fm);
        this.mTableTitles = mTableTitles;
    }

    /**
     * Return the fragment associated with a specified position
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FirstFragment();

            case 1:
                return new SecondFragment();

            default:
                return null;
        }
    }

    /**
     * Returns total numbers of Tabs/Views
     * @return
     */
    @Override
    public int getCount() {
        return this.mTableTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTableTitles[position];
    }
}
