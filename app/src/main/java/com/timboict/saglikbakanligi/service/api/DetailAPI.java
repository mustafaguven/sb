package com.timboict.saglikbakanligi.service.api;

import com.timboict.saglikbakanligi.model.GeneralDataModel;
import com.timboict.saglikbakanligi.model.ISBSAritmaModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public interface DetailAPI<T> {

    @GET(EndPoint.LIST_DETAIL)
    void getAritmaDetail(@Path("name") String name, @Path("id") String id,
                   Callback<ISBSAritmaModel> response);
}
