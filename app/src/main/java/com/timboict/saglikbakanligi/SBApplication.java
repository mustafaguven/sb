package com.timboict.saglikbakanligi;

import android.app.Application;

/**
 * Created by mustafaguven on 19.05.2015.
 */
public class SBApplication extends Application {

    private static SBApplication mInstance;

    public static Application getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
