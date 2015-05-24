package com.timboict.saglikbakanligi.cache;

import com.timboict.saglikbakanligi.enums.GirisTipi;
import com.timboict.saglikbakanligi.model.User;

public final class SBData {

    private static GirisTipi girisTipi;

    public static User getUser() {
        return new CacheController<User>().get(CacheKey.USER, User.class);
    }

    public static void setUser(User user) {
        new CacheController<User>().put(CacheKey.USER, user);
    }

    public static GirisTipi getGirisTipi() {
        if(getUser()!=null) {
            return getUser().getGirisTipi();
        }
        return girisTipi;
    }

    public static void setGirisTipi(GirisTipi gt){
        girisTipi = gt;
    }
}
