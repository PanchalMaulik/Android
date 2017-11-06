package com.mulik.example.vaksys_android.fragmentflexible2;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

public class Fragment_A extends Fragment{

    ListView list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_fragment_a,container,false);
        list = getActivity().findViewById(R.id.listView);
        Array

        return  view;
    }
}
