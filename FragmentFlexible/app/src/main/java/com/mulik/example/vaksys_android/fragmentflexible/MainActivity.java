package com.mulik.example.vaksys_android.fragmentflexible;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void respond(int i) {
            android.app.FragmentManager manager = getFragmentManager();
            Fragment_b fb = (Fragment_b) manager.findFragmentById(R.id.fragment2);
            fb.changeData(i);

        }

    }

