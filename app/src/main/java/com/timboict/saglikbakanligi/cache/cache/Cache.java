package com.timboict.saglikbakanligi.cache.cache;

public interface Cache<T> {

    public final int MAX_SIZE = 20;
    public final Object lock = new Object();

    public T get(String key, Class<T> clz);
    public void put(String key, T t);
    public void remove(String key);
    public void clearAll();
    public Cache<T> getSuccessor();

}
