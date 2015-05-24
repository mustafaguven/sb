package com.timboict.saglikbakanligi.model;

/**
 * Created by ardadogantemur on 07/05/15.
 */
public class ISBSil extends GeneralDataModel
{
    private String ad;
    private String faalDrm;
    private String kod;
    private String merkezKod;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getFaalDrm() {
        return faalDrm;
    }

    public void setFaalDrm(String faalDrm) {
        this.faalDrm = faalDrm;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getMerkezKod() {
        return merkezKod;
    }

    public void setMerkezKod(String merkezKod) {
        this.merkezKod = merkezKod;
    }
}
