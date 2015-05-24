package com.timboict.saglikbakanligi.model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ugokay on 12/05/15.
 */
public class ISBSBakiyeKlorModel extends GeneralDataModel  {
    private static final long serialVersionUID = 1L;
    private BigDecimal id;
    private String adi;
    private BigInteger izlemeNoktasiId;
    private BigInteger bakiyeKlorAlanBirimId;
    //private Date bakiyeKlorOlcumTarihi;
    private Float degeri;
    private BigInteger idPk;
    private String cografiKonumOndalikX;
    private String cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private String terminal;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIzlemeNoktasiId() {
        return izlemeNoktasiId;
    }

    public void setIzlemeNoktasiId(BigInteger izlemeNoktasiId) {
        this.izlemeNoktasiId = izlemeNoktasiId;
    }

    public BigInteger getBakiyeKlorAlanBirimId() {
        return bakiyeKlorAlanBirimId;
    }

    public void setBakiyeKlorAlanBirimId(BigInteger bakiyeKlorAlanBirimId) {
        this.bakiyeKlorAlanBirimId = bakiyeKlorAlanBirimId;
    }

    public Float getDegeri() {
        return degeri;
    }

    public void setDegeri(Float degeri) {
        this.degeri = degeri;
    }

    public BigInteger getIdPk() {
        return idPk;
    }

    public void setIdPk(BigInteger idPk) {
        this.idPk = idPk;
    }

    public String getCografiKonumOndalikX() {
        return cografiKonumOndalikX;
    }

    public void setCografiKonumOndalikX(String cografiKonumOndalikX) {
        this.cografiKonumOndalikX = cografiKonumOndalikX;
    }

    public String getCografiKonumOndalikY() {
        return cografiKonumOndalikY;
    }

    public void setCografiKonumOndalikY(String cografiKonumOndalikY) {
        this.cografiKonumOndalikY = cografiKonumOndalikY;
    }

    public BigInteger getCografiKonumDereceX() {
        return cografiKonumDereceX;
    }

    public void setCografiKonumDereceX(BigInteger cografiKonumDereceX) {
        this.cografiKonumDereceX = cografiKonumDereceX;
    }

    public BigInteger getCografiKonumDereceY() {
        return cografiKonumDereceY;
    }

    public void setCografiKonumDereceY(BigInteger cografiKonumDereceY) {
        this.cografiKonumDereceY = cografiKonumDereceY;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

        public String getListHeader(){

            return adi;

        }

        public BigInteger getHeaderID(){

            BigInteger bi =id.toBigInteger();
            return bi;
        }
}
