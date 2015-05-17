package com.timboict.saglikbakanligi.manager;

import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.service.api.LoginAPI;

/**
 * Created by mustafaguven on 18.05.2015.
 */
public class LoginManager {

    public LoginAPI getApi(){
        return Retrofit.get().create(LoginAPI.class);
    }


}
