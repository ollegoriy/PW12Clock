package com.example.alarmclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Ержан вставай!", Toast.LENGTH_SHORT).show();

        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.alarm_sound);
        mediaPlayer.start();
    }
}
