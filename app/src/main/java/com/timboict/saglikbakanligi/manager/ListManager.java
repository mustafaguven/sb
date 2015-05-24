package com.timboict.saglikbakanligi.manager;

import android.content.Context;
import android.util.Log;

import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.model.User;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.service.api.ListAPI;
import com.timboict.saglikbakanligi.service.api.LoginAPI;

import java.util.List;

import retrofit.Callback;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class ListManager<T> extends BaseManager<ListAPI> {

    public ListManager(Context context) {
        super(context);
    }

    public void getAritmaList (String name, ResponseListener<T> responseListener){
        getBaseActivity().showProgress();
        getApi(ListAPI.class).getAritmaList(name, new Retrofit.RetroCallback<>(responseListener));
    }



}
