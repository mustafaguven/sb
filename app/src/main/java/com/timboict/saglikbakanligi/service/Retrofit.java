package com.timboict.saglikbakanligi.service;

import com.timboict.saglikbakanligi.enums.GirisTipi;
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

    public static RestAdapter get(GirisTipi girisTipi) {
        synchronized (lock) {
            if (mAdapter == null) {
                mAdapter = new RestAdapter.Builder()
                        .setEndpoint(String.format(EndPoint.BASE_URL, girisTipi==GirisTipi.ICME_SUYU_ISLEMLERI ? "isbs" : "asbs"))
                                .build();
            }
            return mAdapter;
        }
    }

    public static void clear(){
        synchronized (lock){
            mAdapter = null;
        }
    }
}
