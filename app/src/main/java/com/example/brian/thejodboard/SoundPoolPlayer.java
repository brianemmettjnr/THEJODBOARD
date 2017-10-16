package com.example.brian.thejodboard;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;

/**
 * Created by Brian on 14/06/2017.
 */

public class SoundPoolPlayer {
    private SoundPool mShortPlayer= null;
    private HashMap mSounds = new HashMap();

    public SoundPoolPlayer(Context pContext)
    {
        // setup Soundpool
        this.mShortPlayer = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);


        mSounds.put(R.raw.yuppa, this.mShortPlayer.load(pContext, R.raw.yuppa, 1));
        mSounds.put(R.raw.noproblem, this.mShortPlayer.load(pContext, R.raw.noproblem, 1));
        mSounds.put(R.raw.yes, this.mShortPlayer.load(pContext, R.raw.yes, 1));
        mSounds.put(R.raw.no, this.mShortPlayer.load(pContext, R.raw.no, 1));
        mSounds.put(R.raw.badatgame, this.mShortPlayer.load(pContext, R.raw.badatgame, 1));
        mSounds.put(R.raw.easy, this.mShortPlayer.load(pContext, R.raw.easy, 1));
        mSounds.put(R.raw.serious, this.mShortPlayer.load(pContext, R.raw.serious, 1));
        mSounds.put(R.raw.fak, this.mShortPlayer.load(pContext, R.raw.fak, 1));
        mSounds.put(R.raw.shutup, this.mShortPlayer.load(pContext, R.raw.shutup, 1));
        mSounds.put(R.raw.bellend, this.mShortPlayer.load(pContext, R.raw.bellend, 1));
        mSounds.put(R.raw.deaf, this.mShortPlayer.load(pContext, R.raw.deaf, 1));


    }

    public void playShortResource(int piResource) {
        int iSoundId = (Integer) mSounds.get(piResource);
        this.mShortPlayer.play(iSoundId, 0.99f, 0.99f, 0, 0, 1);
    }

    // Cleanup
    public void release() {
        // Cleanup
        this.mShortPlayer.release();
        this.mShortPlayer = null;
    }
}