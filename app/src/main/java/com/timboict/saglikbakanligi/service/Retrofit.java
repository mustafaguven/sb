package com.timboict.saglikbakanligi.service;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.cache.SBData;
import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.model.GeneralDataModel;
import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.service.api.EndPoint;

import java.lang.reflect.Type;
import java.util.List;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class Retrofit {

    private static Context mContext;
    private static RestAdapter mAdapter = null;
    private static final Object lock = new Object();

    private Retrofit() {
    }

    public static RestAdapter get(Context context) {
        synchronized (lock) {
            mContext = context;

            if (mAdapter == null) {
                RestAdapter.Builder builder = new RestAdapter.Builder()
                        .setEndpoint(String.format(EndPoint.BASE_URL, SBData.getGirisTipi() == GirisTipi.ICME_SUYU_ISLEMLERI ? "isbs" : "asbs"))

                        .setRequestInterceptor(new RequestInterceptor() {
                            @Override
                            public void intercept(RequestFacade request) {
                                //request.addHeader("Accept", "application/json;versions=1");
                                if (SBData.getUser() != null) {
                                    request.addHeader("auth_token", SBData.getUser().getAuthToken());
                                }
                            }
                        });
                mAdapter = builder.build();
            }

            return mAdapter;

        }
    }

    public static void clear() {
        synchronized (lock) {
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
            ((BaseActivity) mContext).hideProgress();
            if (listener != null) {
                listener.onSuccess(t);
            }
        }

        @Override
        public void failure(RetrofitError error) {
            ((BaseActivity) mContext).showSnackBar(error.getMessage());
            ((BaseActivity) mContext).hideProgress();
            if (listener != null) {
                listener.onFailure(error);
            }
        }
    }


}
