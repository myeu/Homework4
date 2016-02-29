package com.marisayeung.homework4;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.media.MediaPlayer;

public class EraserIntentService extends IntentService {
    MediaPlayer mp;

	public EraserIntentService() {
		super("EraserIntentService");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		mp = MediaPlayer.create(this, R.raw.eraser);
        mp.start();
	}
}

