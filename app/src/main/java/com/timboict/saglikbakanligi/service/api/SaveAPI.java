package com.timboict.saglikbakanligi.service.api;

import com.timboict.saglikbakanligi.model.ISBSAritmaModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public interface SaveAPI<T> {

    @POST(EndPoint.SAVE)
    void saveAritma(@Path("name") String name,
                    ISBSAritmaModel model, Callback<ISBSAritmaModel> response);
}