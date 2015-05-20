package com.timboict.saglikbakanligi;

/**
 * Created by mustafaguven on 20.05.2015.
 */
public interface ResponseListener<T> {
    void onSuccess(T t);
    void onFailure(Exception e);
}
