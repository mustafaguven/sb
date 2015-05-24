package com.timboict.saglikbakanligi.cache;

import android.util.LruCache;

public class MemoryCache<T> implements Cache<T> {

    private static LruCache memoryCache = null;

    public MemoryCache() {
        synchronized (lock) {
            if (memoryCache == null) {
                memoryCache = new LruCache<String, T>(MAX_SIZE);
            }
        }
    }

    @Override
    public T get(String key, Class<T> clz) {

        synchronized (lock) {
            T t = (T) memoryCache.get(key);
            if (t == null) {
                t = getSuccessor().get(key, clz);
                if (t != null) {
                    sync(key, t, false);
                }
            }
            return t;
        }
    }

    private void sync(String key, T t, boolean putAlsoIntoSuccessor) {
        synchronized (lock) {
            if (t != null) {
                memoryCache.put(key, t);
                if (putAlsoIntoSuccessor) {
                    getSuccessor().put(key, t);
                }
            } else {
                remove(key);
            }
        }
    }

    @Override
    public void put(String key, T t) {
        sync(key, t, true);
    }

    @Override
    public void remove(String key) {
        synchronized (lock) {
            memoryCache.remove(key);
            getSuccessor().remove(key);
        }
    }

    @Override
    public void clearAll() {
        memoryCache.evictAll();
        getSuccessor().clearAll();
    }

    @Override
    public Cache<T> getSuccessor() {
        return new SharedPreferencesCache<>();
    }


}
