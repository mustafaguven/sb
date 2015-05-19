package com.timboict.saglikbakanligi.cache.cache;

import com.timboict.saglikbakanligi.model.User;

public final class SBData {

    public static User getUser() {
        return new CacheController<User>().get(CacheKey.USER, User.class);
    }

    public static void setUser(User user) {
        new CacheController<User>().put(CacheKey.USER, user);
    }

}
