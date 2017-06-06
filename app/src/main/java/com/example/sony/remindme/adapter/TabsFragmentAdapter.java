package com.example.sony.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import com.example.sony.remindme.fragment.AbstractTabFragment;
import com.example.sony.remindme.fragment.BirthdaysFragment;
import com.example.sony.remindme.fragment.HistoryFragment;
import com.example.sony.remindme.fragment.IdeasFragment;
import com.example.sony.remindme.fragment.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikita on 04.06.2017.
 * Copyright © 2017 All rights reserved.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private SparseArray<AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new SparseArray<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
