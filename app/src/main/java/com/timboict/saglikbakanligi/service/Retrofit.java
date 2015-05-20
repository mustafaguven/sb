package com.timboict.saglikbakanligi.service;

import android.content.Context;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.ResponseListener;
import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.manager.BaseManager;
import com.timboict.saglikbakanligi.model.User;
import com.timboict.saglikbakanligi.service.api.EndPoint;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class Retrofit {

    private static Context mContext;
    private static RestAdapter mAdapter = null;
    private static final Object lock = new Object();

    private Retrofit() {
    }

    public static RestAdapter get(Context context, GirisTipi girisTipi) {
        synchronized (lock) {
            mContext = context;
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

    public static class RetroCallback<T> implements Callback<T> {
        ResponseListener<T> listener;
        public RetroCallback(ResponseListener<T> responseListener) {
            this.listener = responseListener;
        }

        @Override
        public void success(T t, Response response) {
            ((BaseActivity)mContext).hideProgress();
            if(listener!=null){
                listener.onSuccess(t);
            }
        }
        @Override
        public void failure(RetrofitError error) {
            ((BaseActivity)mContext).showSnackBar(error.getMessage());
            ((BaseActivity)mContext).hideProgress();
            if(listener!=null){
                listener.onFailure(error);
            }
        }
    }
}
