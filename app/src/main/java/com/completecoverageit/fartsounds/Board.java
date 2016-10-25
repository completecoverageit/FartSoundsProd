package com.completecoverageit.fartsounds;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.view.View;
import java.util.HashMap;
import android.media.AudioManager;
import android.media.SoundPool;
import android.widget.Button;


public class Board extends AppCompatActivity {
    private SoundPool pool;
    private HashMap<Integer, Integer> soundsMap;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        Button txt1 = (Button)findViewById(R.id.fart01);
        Typeface font = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt1.setTypeface(font);

        Button txt2 = (Button)findViewById(R.id.fart02);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt2.setTypeface(font2);

        Button txt3 = (Button)findViewById(R.id.fart03);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt3.setTypeface(font3);

        Button txt4 = (Button)findViewById(R.id.fart04);
        Typeface font4 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt4.setTypeface(font4);

        Button txt5 = (Button)findViewById(R.id.fart05);
        Typeface font5 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt5.setTypeface(font5);

        Button txt6 = (Button)findViewById(R.id.fart06);
        Typeface font6 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt6.setTypeface(font6);

        Button txt7 = (Button)findViewById(R.id.fart07);
        Typeface font7 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt7.setTypeface(font7);

        Button txt8 = (Button)findViewById(R.id.fart08);
        Typeface font8 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt8.setTypeface(font8);

        Button txt9 = (Button)findViewById(R.id.fart09);
        Typeface font9 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt9.setTypeface(font9);

        Button txt10 = (Button)findViewById(R.id.fart10);
        Typeface font10 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt10.setTypeface(font10);

        Button txt11 = (Button)findViewById(R.id.fart11);
        Typeface font11 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt11.setTypeface(font11);

        Button txt12 = (Button)findViewById(R.id.fart12);
        Typeface font12 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt12.setTypeface(font12);

        Button txt13 = (Button)findViewById(R.id.fart13);
        Typeface font13 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt13.setTypeface(font13);

        Button txt14 = (Button)findViewById(R.id.fart14);
        Typeface font14 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt14.setTypeface(font14);

        Button txt15 = (Button)findViewById(R.id.fart15);
        Typeface font15 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt15.setTypeface(font15);

        Button txt16 = (Button)findViewById(R.id.fart16);
        Typeface font16 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt16.setTypeface(font16);

        Button txt17 = (Button)findViewById(R.id.fart17);
        Typeface font17 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt17.setTypeface(font17);

        Button txt18 = (Button)findViewById(R.id.fart18);
        Typeface font18 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt18.setTypeface(font18);

        Button txt19 = (Button)findViewById(R.id.fart19);
        Typeface font19 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt19.setTypeface(font19);

        Button txt20 = (Button)findViewById(R.id.fart20);
        Typeface font20 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt20.setTypeface(font20);

        Button txt21 = (Button)findViewById(R.id.fart21);
        Typeface font21 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt21.setTypeface(font21);

        Button txt22 = (Button)findViewById(R.id.fart22);
        Typeface font22 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt22.setTypeface(font22);

        Button txt24 = (Button)findViewById(R.id.fart24);
        Typeface font24 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt24.setTypeface(font24);

        Button txt28 = (Button)findViewById(R.id.fart28);
        Typeface font28 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt28.setTypeface(font28);

        Button txt31 = (Button)findViewById(R.id.fart31);
        Typeface font31 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt31.setTypeface(font31);

        Button txt33 = (Button)findViewById(R.id.fart33);
        Typeface font33 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt33.setTypeface(font33);

        Button txt38 = (Button)findViewById(R.id.fart38);
        Typeface font38 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt38.setTypeface(font38);

        Button txt39 = (Button)findViewById(R.id.fart39);
        Typeface font39 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt39.setTypeface(font39);

        Button txt40 = (Button)findViewById(R.id.fart40);
        Typeface font40 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt40.setTypeface(font40);

        Button txt41 = (Button)findViewById(R.id.fart41);
        Typeface font41 = Typeface.createFromAsset(getAssets(), "hobostd.otf");
        txt41.setTypeface(font41);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            AudioAttributes audioAttrib = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setFlags(AudioAttributes.FLAG_AUDIBILITY_ENFORCED)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            pool = new SoundPool.Builder().setAudioAttributes(audioAttrib).setMaxStreams(6).build();
        }
        else {
            pool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        }

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
        soundsMap.put(24, pool.load(this, R.raw.fart24, 1));
        soundsMap.put(28, pool.load(this, R.raw.fart28, 1));
        soundsMap.put(31, pool.load(this, R.raw.fart31, 1));
        soundsMap.put(33, pool.load(this, R.raw.fart33, 1));
        soundsMap.put(38, pool.load(this, R.raw.fart38, 1));
        soundsMap.put(39, pool.load(this, R.raw.fart39, 1));
        soundsMap.put(40, pool.load(this, R.raw.fart40, 1));
        soundsMap.put(41, pool.load(this, R.raw.fart41, 1));
    }


    public void fart01(View v) {
        int fart01 = 1;
        pool.play(soundsMap.get(fart01), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart02(View v) {
        int fart02 = 2;
        pool.play(soundsMap.get(fart02), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart03(View v) {
        int fart03 = 3;
        pool.play(soundsMap.get(fart03), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart04(View v) {
        int fart04 = 4;
        pool.play(soundsMap.get(fart04), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart05(View v) {
        int fart05 = 5;
        pool.play(soundsMap.get(fart05), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart06(View v) {
        int fart06 = 6;
        pool.play(soundsMap.get(fart06), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart07(View v) {
        int fart07 = 7;
        pool.play(soundsMap.get(fart07), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart08(View v) {
        int fart08 = 8;
        pool.play(soundsMap.get(fart08), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart09(View v) {
        int fart09 = 9;
        pool.play(soundsMap.get(fart09), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart10(View v) {
        int fart10 = 10;
        pool.play(soundsMap.get(fart10), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart11(View v) {
        int fart11 = 11;
        pool.play(soundsMap.get(fart11), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart12(View v) {
        int fart12 = 12;
        pool.play(soundsMap.get(fart12), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart13(View v) {
        int fart13 = 13;
        pool.play(soundsMap.get(fart13), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart14(View v) {
        int fart14 = 14;
        pool.play(soundsMap.get(fart14), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart15(View v) {
        int fart15 = 15;
        pool.play(soundsMap.get(fart15), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart16(View v) {
        int fart16 = 16;
        pool.play(soundsMap.get(fart16), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart17(View v) {
        int fart17 = 17;
        pool.play(soundsMap.get(fart17), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart18(View v) {
        int fart18 = 18;
        pool.play(soundsMap.get(fart18), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart19(View v) {
        int fart19 = 19;
        pool.play(soundsMap.get(fart19), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart20(View v) {
        int fart20 = 20;
        pool.play(soundsMap.get(fart20), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart21(View v) {
        int fart21 = 21;
        pool.play(soundsMap.get(fart21), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart22(View v) {
        int fart22 = 22;
        pool.play(soundsMap.get(fart22), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart24(View v) {
        int fart24 = 24;
        pool.play(soundsMap.get(fart24), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart28(View v) {
        int fart28 = 28;
        pool.play(soundsMap.get(fart28), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart31(View v) {
        int fart31 = 31;
        pool.play(soundsMap.get(fart31), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart33(View v) {
        int fart33 = 33;
        pool.play(soundsMap.get(fart33), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart38(View v) {
        int fart38 = 38;
        pool.play(soundsMap.get(fart38), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart39(View v) {
        int fart39 = 39;
        pool.play(soundsMap.get(fart39), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart40(View v) {
        int fart40 = 40;
        pool.play(soundsMap.get(fart40), 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void fart41(View v) {
        int fart41 = 41;
        pool.play(soundsMap.get(fart41), 1.0f, 1.0f, 1, 0, 1.0f);
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
