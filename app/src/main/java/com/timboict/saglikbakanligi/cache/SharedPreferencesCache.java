package com.timboict.saglikbakanligi.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.timboict.saglikbakanligi.SBApplication;

public class SharedPreferencesCache<T> implements Cache<T> {

    final String PATH = "SaglikBakanligi";
    private SharedPreferences mSharedPreferences;

    public SharedPreferencesCache() {
        this.mSharedPreferences = SBApplication.getInstance().getSharedPreferences(PATH, Context.MODE_PRIVATE);
    }

    @Override
    public T get(String key, Class<T> clz) {

        synchronized (lock) {
            String cachedData = this.mSharedPreferences.getString(key, null);
            T obj = null;
            if (!TextUtils.isEmpty(cachedData)) {
                obj = new Gson().fromJson(cachedData, clz);
            }
            return obj;
        }
    }

    @Override
    public void put(String key, T t) {

        synchronized (lock) {

            SharedPreferences.Editor editor = mSharedPreferences.edit();
            if (t != null) {
                editor.putString(key, convertToJson(t));
            } else {
                editor.remove(key);
            }
            editor.apply();
        }
    }

    @Override
    public void remove(String key) {
        put(key, null);
    }

    @Override
    public void clearAll() {
        synchronized (lock) {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.clear().apply();
        }
    }

    @Override
    public Cache<T> getSuccessor() {
        return null;
    }

    public String convertToJson(T t) {
        if (t == null) {
            return null;
        }
        Gson gson = new Gson();
        return gson.toJson(t);
    }
}
