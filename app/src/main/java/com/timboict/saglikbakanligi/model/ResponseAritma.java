package com.timboict.saglikbakanligi.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class ResponseAritma {

    @Expose
    private String adi;
    @Expose
    private Integer id;
    @Expose
    private Integer miPrinx;
    @Expose
    private Integer xx;
    @Expose
    private Integer yy;

    /**
     *
     * @return
     * The adi
     */
    public String getAdi() {
        return adi;
    }

    /**
     *
     * @param adi
     * The adi
     */
    public void setAdi(String adi) {
        this.adi = adi;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The miPrinx
     */
    public Integer getMiPrinx() {
        return miPrinx;
    }

    /**
     *
     * @param miPrinx
     * The miPrinx
     */
    public void setMiPrinx(Integer miPrinx) {
        this.miPrinx = miPrinx;
    }

    /**
     *
     * @return
     * The xx
     */
    public Integer getXx() {
        return xx;
    }

    /**
     *
     * @param xx
     * The xx
     */
    public void setXx(Integer xx) {
        this.xx = xx;
    }

    /**
     *
     * @return
     * The yy
     */
    public Integer getYy() {
        return yy;
    }

    /**
     *
     * @param yy
     * The yy
     */
    public void setYy(Integer yy) {
        this.yy = yy;
    }

}

