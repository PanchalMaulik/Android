package com.mulik.example.vaksys_android.fragmentflexible2;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements Fragment_a.Communicator{

    Fragment_a f1;
    Fragment_b f2;
    FragmentManager manager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager= getFragmentManager();
        f1 = (Fragment_a) manager.findFragmentById(R.id.fragment);
        f1.setCommunicator(this);
    }

    @Override
    public void respond(int index) {
        f2 = (Fragment_b) manager.findFragmentById(R.id.fragment2);
        if(f2!=null && f2.isVisible()){
            f2.changeData(index);
        }else {
            Intent intent = new Intent(this, Another_activity.class);
            intent.putExtra("index",index);
            startActivity(intent);
        }
    }
}
