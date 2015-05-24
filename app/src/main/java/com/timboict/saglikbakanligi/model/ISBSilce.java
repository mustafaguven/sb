package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ardadogantemur on 07/05/15.
 */
public class ISBSilce extends GeneralDataModel
{
    private String ad;
    private BigInteger kod;
    private String kodIl;
    //private BigInteger ncIlceKod;
    //private String tip;
    //private BigInteger tipkod;
    //private BigInteger tuikIlKod;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public BigInteger getKod() {
        return kod;
    }

    public void setKod(BigInteger kod) {
        this.kod = kod;
    }

    public String getKodil() {
        return kodIl;
    }

    public void setKodil(String kodid) {
        this.kodIl = kodid;
    }

    /*public BigInteger getNcIlceKod() {
        return ncIlceKod;
    }

    public void setNcIlceKod(BigInteger ncIlceKod) {
        this.ncIlceKod = ncIlceKod;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public BigInteger getTipkod() {
        return tipkod;
    }

    public void setTipkod(BigInteger tipkod) {
        this.tipkod = tipkod;
    }

    public BigInteger getTuikIlKod() {
        return tuikIlKod;
    }

    public void setTuikIlKod(BigInteger tuikIlKod) {
        this.tuikIlKod = tuikIlKod;
    }*/
}
