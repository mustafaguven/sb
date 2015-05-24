package com.timboict.saglikbakanligi.manager;

import android.content.Context;

import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.service.api.DetailAPI;
import com.timboict.saglikbakanligi.service.api.SaveAPI;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class SaveManager<T> extends BaseManager<SaveAPI>{

    public SaveManager(Context context) {
        super(context);
    }

    public void saveAritma (String name, ISBSAritmaModel model, ResponseListener<ISBSAritmaModel> responseListener){
        getBaseActivity().showProgress();
        getApi(SaveAPI.class).saveAritma(name, model, new Retrofit.RetroCallback<>(responseListener));
    }
}
