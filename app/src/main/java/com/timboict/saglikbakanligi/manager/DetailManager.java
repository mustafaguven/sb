package com.timboict.saglikbakanligi.manager;

import android.content.Context;

import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.service.api.DetailAPI;
import com.timboict.saglikbakanligi.service.api.ListAPI;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class DetailManager<T> extends BaseManager<DetailAPI>{

    public DetailManager(Context context) {
        super(context);
    }

    public void getAritmaDetail (String name, String id, ResponseListener<ISBSAritmaModel> responseListener){
        getBaseActivity().showProgress();
        getApi(DetailAPI.class).getAritmaDetail(name, id, new Retrofit.RetroCallback<>(responseListener));
    }
}
