package com.mulik.example.vaksys_android.fragmentflexible2;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_b extends Fragment {

    TextView text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment_b,container,false);
        text = v.findViewById(R.id.textView);

        return v;
    }

    public void changeData(int index){
        String[] description = getResources().getStringArray(R.array.description);
        text.setText(description[index]);
    }
}
