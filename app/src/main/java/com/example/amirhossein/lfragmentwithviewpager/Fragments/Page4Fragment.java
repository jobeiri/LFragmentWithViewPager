package com.example.amirhossein.lfragmentwithviewpager.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amirhossein.lfragmentwithviewpager.R;

/**
 * Created by Amir Hossein on 4/27/2018.
 */

public class Page4Fragment extends Fragment {

    public static Page4Fragment newInstance() {

        return new Page4Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page4fragment, container, false);
        return view;

    }
}

