package com.example.sony.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sony.remindme.R;

/**
 * Created by Nikita on 04.06.2017.
 * Copyright © 2017 All rights reserved.
 */
public class BirthdaysFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdaysFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdaysFragment fragment = new BirthdaysFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
