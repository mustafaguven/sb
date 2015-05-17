package com.timboict.saglikbakanligi.service;

import com.timboict.saglikbakanligi.service.api.EndPoint;

import retrofit.RestAdapter;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class Retrofit {

    private static RestAdapter mAdapter = null;
    private static final Object lock = new Object();

    private Retrofit() {
    }

    public static RestAdapter get() {
        synchronized (lock) {
            if (mAdapter == null) {
                mAdapter = new RestAdapter.Builder()
                        .setEndpoint( EndPoint.BASE_URL)
                        .build();
            }
            return mAdapter;
        }
    }
}
