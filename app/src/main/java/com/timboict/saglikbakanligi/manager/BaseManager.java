package com.timboict.saglikbakanligi.manager;

import android.content.Context;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.cache.SBData;
import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.service.Retrofit;

/**
 * Created by mustafaguven on 20.05.2015.
 */
public class BaseManager<T> {

    private Context mContext;

    public BaseManager(Context context){
        this.mContext = context;
    }

    protected BaseActivity getBaseActivity() {
        return (BaseActivity)mContext;
    }

    protected T getApi(Class clz) {
        return (T)Retrofit.get(mContext).create(clz);
    }
}
