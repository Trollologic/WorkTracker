package com.trollologic.worktracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by miroslav on 15.02.17..
 */

public class SomeAppActionReceiver extends BroadcastReceiver {

    public static final String TAG = SomeAppActionReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.i(TAG, "action: " + intent.getAction());
        Log.i(TAG, "package: " + intent.getDataString());
        Toast.makeText(context, "App Installed!!!!.", Toast.LENGTH_LONG).show();
    }
}
//mAction = android.intent.action.PACKAGE_RESTARTED
//mData = package:com.trollologic.mydagger2