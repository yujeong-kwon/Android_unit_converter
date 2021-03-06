package com.example.unit_converter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> items;

    public VPAdapter(@NonNull FragmentManager fm) {
        super(fm);

        items = new ArrayList<Fragment>();
        items.add(new FragmentLength());
        items.add(new FragmentWeight());
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

}
