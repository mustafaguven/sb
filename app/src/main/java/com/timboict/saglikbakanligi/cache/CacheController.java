package com.timboict.saglikbakanligi.cache;

public final class CacheController<T> {

    Cache<T> mCache = new MemoryCache<>();

    public T get(String key, Class<T> clz) {
        return mCache.get(key, clz);
    }

    public void put(String key, T t) {
        mCache.put(key, t);
    }

    public void remove(String key) {
        mCache.remove(key);
    }

    public void clearAll() {
        mCache.clearAll();
    }
}
