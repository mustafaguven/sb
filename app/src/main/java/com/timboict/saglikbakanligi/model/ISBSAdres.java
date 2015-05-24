package com.timboict.saglikbakanligi.model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ardadogantemur on 10/05/15.
 */
public class ISBSAdres extends GeneralDataModel
{
    private BigDecimal id;
    private String kod;
    private String ad;
    private String ilkod;
    private BigInteger ilcekod;
    private BigInteger nufusu;
    private BigInteger haneSayisi;
    private BigInteger koykod;
    private BigInteger ustbelediyekod;
    private BigInteger ilceTuikKod;
    private BigInteger tip;
    private BigInteger tipkod;
    private String tipadi;
    private BigInteger prmbelediyeturkod;
    private String belediyeTeskilati;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getIlkod() {
        return ilkod;
    }

    public void setIlkod(String ilkod) {
        this.ilkod = ilkod;
    }

    public BigInteger getIlcekod() {
        return ilcekod;
    }

    public void setIlcekod(BigInteger ilcekod) {
        this.ilcekod = ilcekod;
    }

    public BigInteger getNufusu() {
        return nufusu;
    }

    public void setNufusu(BigInteger nufusu) {
        this.nufusu = nufusu;
    }

    public BigInteger getHaneSayisi() {
        return haneSayisi;
    }

    public void setHaneSayisi(BigInteger haneSayisi) {
        this.haneSayisi = haneSayisi;
    }

    public BigInteger getKoykod() {
        return koykod;
    }

    public void setKoykod(BigInteger koykod) {
        this.koykod = koykod;
    }

    public BigInteger getUstbelediyekod() {
        return ustbelediyekod;
    }

    public void setUstbelediyekod(BigInteger ustbelediyekod) {
        this.ustbelediyekod = ustbelediyekod;
    }

    public BigInteger getIlceTuikKod() {
        return ilceTuikKod;
    }

    public void setIlceTuikKod(BigInteger ilceTuikKod) {
        this.ilceTuikKod = ilceTuikKod;
    }

    public BigInteger getTip() {
        return tip;
    }

    public void setTip(BigInteger tip) {
        this.tip = tip;
    }

    public BigInteger getTipkod() {
        return tipkod;
    }

    public void setTipkod(BigInteger tipkod) {
        this.tipkod = tipkod;
    }


    /*private String ad;
    private BigInteger id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }*/
}


