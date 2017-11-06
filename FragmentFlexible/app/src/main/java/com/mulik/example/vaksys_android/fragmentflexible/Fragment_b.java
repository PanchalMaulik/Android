package com.mulik.example.vaksys_android.fragmentflexible;

import android.app.Fragment;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_b extends Fragment {
    TextView text;
    String data;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_b,container,false);
        if(savedInstanceState ==null){

        }else {
            data=savedInstanceState.getString("text");
            TextView myText= view.findViewById(R.id.textView);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = getActivity().findViewById(R.id.textView );
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeData(int i){

        Resources res = getResources();
        String[] description = res.getStringArray(R.array.description);
        this.data = description[i];
        text.setText(description[i]);
    }
}
