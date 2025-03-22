/*
 * Copyright (C) 2020-2025 Example Inc.
 */

package com.example.sample;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * @author RePlugin Team
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.i(TAG, "attachBaseContext base=" + base);
    }

}
