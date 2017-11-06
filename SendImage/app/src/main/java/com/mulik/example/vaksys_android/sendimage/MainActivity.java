package com.mulik.example.vaksys_android.sendimage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendImage(View v){
        Intent intent = null, chooser = null;
        if(v.getId() == R.id.sendImage){
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("image/png");
            Uri uri = Uri.parse("android.resource://com.mulik.example.vaksys_android.sendimage/"+R.drawable.ic);
            shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, This is test Sharing");
            startActivity(Intent.createChooser(shareIntent, "Send your image"));
        }
    }
}
