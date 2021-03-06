package com.transistorsoft.flutterbackgroundgeolocationexample;

import android.os.StrictMode;

import com.transistorsoft.locationmanager.adapter.TSConfig;

import io.flutter.app.FlutterApplication;

public class Application  extends FlutterApplication {
    @Override
    public void onCreate() {
        ////
        // Strict mode.  Should be disabled on RELEASE.
        // NOTE:  This is NOT required for background_geolocation
        //
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectAll()
                .penaltyLog()
                .build());

        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectLeakedSqlLiteObjects()
                .detectLeakedClosableObjects()
                .penaltyLog()
                .penaltyDeath()
                .build());


        super.onCreate();
    }
}
