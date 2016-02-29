package com.marisayeung.homework4;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Created by marisayeung on 2/29/16.
 */
public class UnlockBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Log.d("BROADCAST RECEIVED", "it happened " + intent.getType());

        showNotification(context);

    }

    private void showNotification(Context context) {
        int id = 12345;
        PendingIntent intent = PendingIntent.getActivity(context, 0, new Intent(context, Paint.class), 0);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_brush_24dp)
                .setContentTitle("Take a moment")
                .setContentText("Draw something!");
        mBuilder.setContentIntent(intent);
        mBuilder.setDefaults(Notification.DEFAULT_SOUND);
        mBuilder.setAutoCancel(true);
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(1, mBuilder.build());

    }
}
