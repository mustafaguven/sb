package com.timboict.saglikbakanligi.manager;

import android.content.Context;

import com.timboict.saglikbakanligi.ResponseListener;
import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.model.User;
import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.service.api.LoginAPI;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class LoginManager extends BaseManager<LoginAPI> {

    public LoginManager(Context context) {
        super(context);
    }

    public void login (GirisTipi girisTipi, String username, String password, ResponseListener<User> responseListener){
        getBaseActivity().showProgress();
        setGirisTipi(girisTipi);
        Retrofit.clear(); //sadece login ve logout aninda cagirilir...
        getApi(LoginAPI.class).login(username, password, new Retrofit.RetroCallback<>(responseListener));
    }


}
