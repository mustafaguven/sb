package com.timboict.saglikbakanligi.service.api;

import com.timboict.saglikbakanligi.model.User;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by mustafaguven on 17.05.2015.
 */
public interface LoginAPI {

    @FormUrlEncoded()
    @POST(EndPoint.LOGIN_URL)
    void login(@Field("username") String username,
               @Field("password") String password,
               Callback<User> response);
}
