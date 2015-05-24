package com.timboict.saglikbakanligi.service.api;

import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.model.User;
import com.timboict.saglikbakanligi.service.Retrofit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by mustafaguven on 17.05.2015.
 */
public interface ListAPI<T> {

    @GET(EndPoint.LIST_URL)
    void getAritmaList(@Path("name") String name,
               Callback<List<ISBSAritmaModel>> response);


}
