package com.timboict.saglikbakanligi.cache.cache;

import java.util.HashMap;

public class CacheStatusHolder {

    static HashMap<String, CacheStatus> cacheStatusMap = new HashMap<>();

    public CacheStatusHolder(){
        HashMap<String, CacheStatus> cacheStatusMapTemp = new CacheController<HashMap>().get("cacheStatus", HashMap.class);
        if(cacheStatusMapTemp!=null) {
            cacheStatusMap = cacheStatusMapTemp;
        }
    }

    public CacheStatus get(String key){
        CacheStatus statu = CacheStatus.NEEDS_UPDATE;
        if(cacheStatusMap.get(key)!=null) {
            statu = cacheStatusMap.get(key);
        } else {
            update(key, statu);
        }
        return statu;
    }

    public void update(String key, CacheStatus statu){
        if(cacheStatusMap.get(key)!=null)
            cacheStatusMap.remove(key);

        cacheStatusMap.put(key, statu);

    }

    public void remove(String key){
        if(cacheStatusMap.get(key)!=null)
            cacheStatusMap.remove(key);
    }



}
