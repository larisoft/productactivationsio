package com.productactivations.geoadsdk;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;


import java.util.List;

public class GeofenceBroadcastReceiver extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Toast.makeText(context,  "Started after boot", Toast.LENGTH_LONG).show();
                EasyLogger.toast(context, "Started after boot");
                Utility.scheduleJob(context);
            }
        }


}
