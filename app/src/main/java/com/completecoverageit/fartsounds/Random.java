package com.completecoverageit.fartsounds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.view.View;
import java.util.HashMap;
import android.media.AudioManager;
import android.media.SoundPool;


public class Random extends Activity {
    private SoundPool pool;
    private HashMap<Integer, Integer> soundsMap;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        pool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        soundsMap = new HashMap<Integer, Integer>();
        soundsMap.put(1, pool.load(this, R.raw.fart01, 1));
        soundsMap.put(2, pool.load(this, R.raw.fart02, 1));
        soundsMap.put(3, pool.load(this, R.raw.fart03, 1));
        soundsMap.put(4, pool.load(this, R.raw.fart04, 1));
        soundsMap.put(5, pool.load(this, R.raw.fart05, 1));
        soundsMap.put(6, pool.load(this, R.raw.fart06, 1));
        soundsMap.put(7, pool.load(this, R.raw.fart07, 1));
        soundsMap.put(8, pool.load(this, R.raw.fart08, 1));
        soundsMap.put(9, pool.load(this, R.raw.fart09, 1));
        soundsMap.put(10, pool.load(this, R.raw.fart10, 1));
        soundsMap.put(11, pool.load(this, R.raw.fart11, 1));
        soundsMap.put(12, pool.load(this, R.raw.fart12, 1));
        soundsMap.put(13, pool.load(this, R.raw.fart13, 1));
        soundsMap.put(14, pool.load(this, R.raw.fart14, 1));
        soundsMap.put(15, pool.load(this, R.raw.fart15, 1));
        soundsMap.put(16, pool.load(this, R.raw.fart16, 1));
        soundsMap.put(17, pool.load(this, R.raw.fart17, 1));
        soundsMap.put(18, pool.load(this, R.raw.fart18, 1));
        soundsMap.put(19, pool.load(this, R.raw.fart19, 1));
        soundsMap.put(20, pool.load(this, R.raw.fart20, 1));
        soundsMap.put(21, pool.load(this, R.raw.fart21, 1));
        soundsMap.put(22, pool.load(this, R.raw.fart22, 1));
        soundsMap.put(23, pool.load(this, R.raw.fart24, 1));
        soundsMap.put(24, pool.load(this, R.raw.fart28, 1));
        soundsMap.put(25, pool.load(this, R.raw.fart31, 1));
        soundsMap.put(26, pool.load(this, R.raw.fart33, 1));
        soundsMap.put(27, pool.load(this, R.raw.fart38, 1));
        soundsMap.put(28, pool.load(this, R.raw.fart39, 1));
        soundsMap.put(29, pool.load(this, R.raw.fart40, 1));
        soundsMap.put(30, pool.load(this, R.raw.fart41, 1));
    }

    public void playSound(View v) {
        int random = 1 + (int) (Math.random() * ((30 - 1) + 1));
        pool.play(soundsMap.get(random), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void goToMainMenu (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
}