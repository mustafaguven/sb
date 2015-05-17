package com.timboict.saglikbakanligi.model;

/**
 * Created by mustafaguven on 17.05.2015.
 */

/*
{
        "auth_token": "71ee1c03-a9ba-4fad-833a-9ae0533f0181",
        "username": "cem.akkoc",
        "il": "99",
        "ilce": "0",
        "rol": "ICME_SUYU_MERKEZ"
        }

*/

public class User {
    public String getAuthToken() {
        return auth_token;
    }

    public void setAuthToken(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIl() {
        return il;
    }

    public void setIl(int il) {
        this.il = il;
    }

    public int getIlce() {
        return ilce;
    }

    public void setIlce(int ilce) {
        this.ilce = ilce;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private String auth_token;
    private String username;
    private int il;
    private int ilce;
    private String rol;
}
