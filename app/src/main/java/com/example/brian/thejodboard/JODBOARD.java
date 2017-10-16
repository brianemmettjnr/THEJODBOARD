package com.example.brian.thejodboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class JODBOARD extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jodboard);
        MobileAds.initialize(this, "ca-app-pub-7782595921638487~7012865021");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final SoundPoolPlayer sound = new SoundPoolPlayer(this);
        Button yuppa = (Button) findViewById(R.id.yuppa);
        yuppa.setSoundEffectsEnabled(false);
        yuppa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.yuppa);
            }
        });
        Button noproblem = (Button) findViewById(R.id.noproblem);
        noproblem.setSoundEffectsEnabled(false);
        noproblem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.noproblem);
            }
        });
        Button yes = (Button) findViewById(R.id.yes);
        yes.setSoundEffectsEnabled(false);
        yes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.yes);
            }
        });
        Button no = (Button) findViewById(R.id.no);
        no.setSoundEffectsEnabled(false);
        no.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.no);
            }
        });
        Button badatgame = (Button) findViewById(R.id.badatgame);
        badatgame.setSoundEffectsEnabled(false);
        badatgame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.badatgame);
            }
        });
        Button easy = (Button) findViewById(R.id.easy);
        easy.setSoundEffectsEnabled(false);
        easy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.easy);
            }
        });
        Button serious = (Button) findViewById(R.id.serious);
        serious.setSoundEffectsEnabled(false);
        serious.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.serious);
            }
        });
        Button fak = (Button) findViewById(R.id.fak);
        fak.setSoundEffectsEnabled(false);
        fak.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.fak);
            }
        });
        Button shutup = (Button) findViewById(R.id.shutup);
        shutup.setSoundEffectsEnabled(false);
        shutup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.shutup);
            }
        });
        Button bellend = (Button) findViewById(R.id.bellend);
        bellend.setSoundEffectsEnabled(false);
        bellend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.bellend);
            }
        });
        Button deaf = (Button) findViewById(R.id.deaf);
        deaf.setSoundEffectsEnabled(false);
        deaf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                sound.playShortResource(R.raw.deaf);
            }
        });

    }
}
