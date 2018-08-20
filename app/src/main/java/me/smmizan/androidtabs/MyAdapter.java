package me.smmizan.androidtabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {

    private final List<Fragment> my_list = new ArrayList<Fragment>();
    private final List<String> my_titles = new ArrayList<String>();

    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return my_list.get(position);
    }


    @Override
    public int getCount() {
        return my_list.size();
    }

    public void addMyFragment(Fragment f, String title){
        my_list.add(f);
        my_titles.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return my_titles.get(position);
    }
}
