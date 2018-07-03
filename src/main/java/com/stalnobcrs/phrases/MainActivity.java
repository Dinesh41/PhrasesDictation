package com.stalnobcrs.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickTask(View view)
    {
        int id=view.getId();
        String ourid=view.getResources().getResourceEntryName(id);
        Log.i("button id",ourid);
        int resid=getResources().getIdentifier(ourid,"raw",getPackageName());
        MediaPlayer mp=MediaPlayer.create(this,resid);
        mp.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
