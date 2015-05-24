package com.timboict.saglikbakanligi.service;

/**
 * Created by mustafaguven on 20.05.2015.
 */
public interface ResponseListener<T> {
    void onSuccess(T t);
    void onFailure(Exception e);
}
