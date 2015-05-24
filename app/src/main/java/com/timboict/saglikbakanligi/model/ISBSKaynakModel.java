package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ugokay on 06/05/15.
 */
public class ISBSKaynakModel extends GeneralDataModel {
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String kodu;
    private String adi;
    private BigInteger aritmaTesisiId;
    private String kaynakTuru;
    private BigInteger cografiKonumOndalikX;
    private BigInteger cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private BigInteger cografiKonumDakikaX;
    private BigInteger cografiKonumDakikaY;
    private BigInteger cografiKonumSaniyeX;
    private BigInteger cografiKonumSaniyeY;
    private BigInteger yuzeyselSuTuruKodId;
    private BigInteger yuzeyselSuKaTipiKodId;
    private BigInteger yuzeyselSuKaMesafesi;
    private BigInteger yeraltiSuTuruKodId;
    private BigInteger yeraltiSuKaMesafesi;
    private BigInteger yeraltiSuDerinligi;
    private BigInteger yeraltiSuDebisi;
    private BigInteger yuzeyselSuMutlakKa;
    private BigInteger yuzeyselSuKisaKa;
    private BigInteger yuzeyselSuOrtaKa;
    private BigInteger yuzeyselSuUzunKa;
    private Character kullanimDurumu;
    private String kullanilmamaNedeni;
    private String kapatilmaTarihi;
    private String acilisTarihi;
    private String merkezKod;
    private String cografiKonumOndalikX1;
    private String cografiKonumOndalikY1;
    private String adresIlCkysKod;
    private BigInteger adresIlceCkysKod;
    private String miStyle;
    private Long miPrinx;
    private float xx;
    private float yy;
    private String eklenmetarihi;
    private Character aktifDrm;
    private String terminal;
    private Character klorCihazDurumu;
    private Character klorCihazFaaliyetDurumu;
    private BigInteger klorCihazCinsiKodId;
    private BigInteger klorCihazTipiKodId;
    private BigInteger klorlamaCihazKaynakKodId;
    private String klorCihazTakilmaTarihi;
    private String guncellemetarihi;
    private String kullanici;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BigInteger getAritmaTesisiId() {
        return aritmaTesisiId;
    }

    public void setAritmaTesisiId(BigInteger aritmaTesisiId) {
        this.aritmaTesisiId = aritmaTesisiId;
    }

    public String getKaynakTuru() {
        return kaynakTuru;
    }

    public void setKaynakTuru(String kaynakTuru) {
        this.kaynakTuru = kaynakTuru;
    }

    public BigInteger getCografiKonumOndalikX() {
        return cografiKonumOndalikX;
    }

    public void setCografiKonumOndalikX(BigInteger cografiKonumOndalikX) {
        this.cografiKonumOndalikX = cografiKonumOndalikX;
    }

    public BigInteger getCografiKonumOndalikY() {
        return cografiKonumOndalikY;
    }

    public void setCografiKonumOndalikY(BigInteger cografiKonumOndalikY) {
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

    public BigInteger getCografiKonumDakikaX() {
        return cografiKonumDakikaX;
    }

    public void setCografiKonumDakikaX(BigInteger cografiKonumDakikaX) {
        this.cografiKonumDakikaX = cografiKonumDakikaX;
    }

    public BigInteger getCografiKonumDakikaY() {
        return cografiKonumDakikaY;
    }

    public void setCografiKonumDakikaY(BigInteger cografiKonumDakikaY) {
        this.cografiKonumDakikaY = cografiKonumDakikaY;
    }

    public BigInteger getCografiKonumSaniyeX() {
        return cografiKonumSaniyeX;
    }

    public void setCografiKonumSaniyeX(BigInteger cografiKonumSaniyeX) {
        this.cografiKonumSaniyeX = cografiKonumSaniyeX;
    }

    public BigInteger getCografiKonumSaniyeY() {
        return cografiKonumSaniyeY;
    }

    public void setCografiKonumSaniyeY(BigInteger cografiKonumSaniyeY) {
        this.cografiKonumSaniyeY = cografiKonumSaniyeY;
    }

    public BigInteger getYuzeyselSuTuruKodId() {
        return yuzeyselSuTuruKodId;
    }

    public void setYuzeyselSuTuruKodId(BigInteger yuzeyselSuTuruKodId) {
        this.yuzeyselSuTuruKodId = yuzeyselSuTuruKodId;
    }

    public BigInteger getYuzeyselSuKaTipiKodId() {
        return yuzeyselSuKaTipiKodId;
    }

    public void setYuzeyselSuKaTipiKodId(BigInteger yuzeyselSuKaTipiKodId) {
        this.yuzeyselSuKaTipiKodId = yuzeyselSuKaTipiKodId;
    }

    public BigInteger getYuzeyselSuKaMesafesi() {
        return yuzeyselSuKaMesafesi;
    }

    public void setYuzeyselSuKaMesafesi(BigInteger yuzeyselSuKaMesafesi) {
        this.yuzeyselSuKaMesafesi = yuzeyselSuKaMesafesi;
    }

    public BigInteger getYeraltiSuTuruKodId() {
        return yeraltiSuTuruKodId;
    }

    public void setYeraltiSuTuruKodId(BigInteger yeraltiSuTuruKodId) {
        this.yeraltiSuTuruKodId = yeraltiSuTuruKodId;
    }

    public BigInteger getYeraltiSuKaMesafesi() {
        return yeraltiSuKaMesafesi;
    }

    public void setYeraltiSuKaMesafesi(BigInteger yeraltiSuKaMesafesi) {
        this.yeraltiSuKaMesafesi = yeraltiSuKaMesafesi;
    }

    public BigInteger getYeraltiSuDerinligi() {
        return yeraltiSuDerinligi;
    }

    public void setYeraltiSuDerinligi(BigInteger yeraltiSuDerinligi) {
        this.yeraltiSuDerinligi = yeraltiSuDerinligi;
    }

    public BigInteger getYeraltiSuDebisi() {
        return yeraltiSuDebisi;
    }

    public void setYeraltiSuDebisi(BigInteger yeraltiSuDebisi) {
        this.yeraltiSuDebisi = yeraltiSuDebisi;
    }

    public BigInteger getYuzeyselSuMutlakKa() {
        return yuzeyselSuMutlakKa;
    }

    public void setYuzeyselSuMutlakKa(BigInteger yuzeyselSuMutlakKa) {
        this.yuzeyselSuMutlakKa = yuzeyselSuMutlakKa;
    }

    public BigInteger getYuzeyselSuKisaKa() {
        return yuzeyselSuKisaKa;
    }

    public void setYuzeyselSuKisaKa(BigInteger yuzeyselSuKisaKa) {
        this.yuzeyselSuKisaKa = yuzeyselSuKisaKa;
    }

    public BigInteger getYuzeyselSuOrtaKa() {
        return yuzeyselSuOrtaKa;
    }

    public void setYuzeyselSuOrtaKa(BigInteger yuzeyselSuOrtaKa) {
        this.yuzeyselSuOrtaKa = yuzeyselSuOrtaKa;
    }

    public BigInteger getYuzeyselSuUzunKa() {
        return yuzeyselSuUzunKa;
    }

    public void setYuzeyselSuUzunKa(BigInteger yuzeyselSuUzunKa) {
        this.yuzeyselSuUzunKa = yuzeyselSuUzunKa;
    }

    public Character getKullanimDurumu() {
        return kullanimDurumu;
    }

    public void setKullanimDurumu(Character kullanimDurumu) {
        this.kullanimDurumu = kullanimDurumu;
    }

    public String getKullanilmamaNedeni() {
        return kullanilmamaNedeni;
    }

    public void setKullanilmamaNedeni(String kullanilmamaNedeni) {
        this.kullanilmamaNedeni = kullanilmamaNedeni;
    }

    public String getKapatilmaTarihi() {
        return kapatilmaTarihi;
    }

    public void setKapatilmaTarihi(String kapatilmaTarihi) {
        this.kapatilmaTarihi = kapatilmaTarihi;
    }

    public String getAcilisTarihi() {
        return acilisTarihi;
    }

    public void setAcilisTarihi(String acilisTarihi) {
        this.acilisTarihi = acilisTarihi;
    }

    public String getMerkezKod() {
        return merkezKod;
    }

    public void setMerkezKod(String merkezKod) {
        this.merkezKod = merkezKod;
    }

    public String getCografiKonumOndalikX1() {
        return cografiKonumOndalikX1;
    }

    public void setCografiKonumOndalikX1(String cografiKonumOndalikX1) {
        this.cografiKonumOndalikX1 = cografiKonumOndalikX1;
    }

    public String getCografiKonumOndalikY1() {
        return cografiKonumOndalikY1;
    }

    public void setCografiKonumOndalikY1(String cografiKonumOndalikY1) {
        this.cografiKonumOndalikY1 = cografiKonumOndalikY1;
    }

    public String getAdresIlCkysKod() {
        return adresIlCkysKod;
    }

    public void setAdresIlCkysKod(String adresIlCkysKod) {
        this.adresIlCkysKod = adresIlCkysKod;
    }

    public BigInteger getAdresIlceCkysKod() {
        return adresIlceCkysKod;
    }

    public void setAdresIlceCkysKod(BigInteger adresIlceCkysKod) {
        this.adresIlceCkysKod = adresIlceCkysKod;
    }

    public String getMiStyle() {
        return miStyle;
    }

    public void setMiStyle(String miStyle) {
        this.miStyle = miStyle;
    }

    public Long getMiPrinx() {
        return miPrinx;
    }

    public void setMiPrinx(Long miPrinx) {
        this.miPrinx = miPrinx;
    }

    public float getXx() {
        return xx;
    }

    public void setXx(float xx) {
        this.xx = xx;
    }

    public float getYy() {
        return yy;
    }

    public void setYy(float yy) {
        this.yy = yy;
    }

    public String getEklenmetarihi() {
        return eklenmetarihi;
    }

    public void setEklenmetarihi(String eklenmetarihi) {
        this.eklenmetarihi = eklenmetarihi;
    }

    public Character getAktifDrm() {
        return aktifDrm;
    }

    public void setAktifDrm(Character aktifDrm) {
        this.aktifDrm = aktifDrm;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Character getKlorCihazDurumu() {
        return klorCihazDurumu;
    }

    public void setKlorCihazDurumu(Character klorCihazDurumu) {
        this.klorCihazDurumu = klorCihazDurumu;
    }

    public Character getKlorCihazFaaliyetDurumu() {
        return klorCihazFaaliyetDurumu;
    }

    public void setKlorCihazFaaliyetDurumu(Character klorCihazFaaliyetDurumu) {
        this.klorCihazFaaliyetDurumu = klorCihazFaaliyetDurumu;
    }

    public BigInteger getKlorCihazCinsiKodId() {
        return klorCihazCinsiKodId;
    }

    public void setKlorCihazCinsiKodId(BigInteger klorCihazCinsiKodId) {
        this.klorCihazCinsiKodId = klorCihazCinsiKodId;
    }

    public BigInteger getKlorCihazTipiKodId() {
        return klorCihazTipiKodId;
    }

    public void setKlorCihazTipiKodId(BigInteger klorCihazTipiKodId) {
        this.klorCihazTipiKodId = klorCihazTipiKodId;
    }

    public BigInteger getKlorlamaCihazKaynakKodId() {
        return klorlamaCihazKaynakKodId;
    }

    public void setKlorlamaCihazKaynakKodId(BigInteger klorlamaCihazKaynakKodId) {
        this.klorlamaCihazKaynakKodId = klorlamaCihazKaynakKodId;
    }

    public String getKlorCihazTakilmaTarihi() {
        return klorCihazTakilmaTarihi;
    }

    public void setKlorCihazTakilmaTarihi(String klorCihazTakilmaTarihi) {
        this.klorCihazTakilmaTarihi = klorCihazTakilmaTarihi;
    }

    public String getGuncellemetarihi() {
        return guncellemetarihi;
    }

    public void setGuncellemetarihi(String guncellemetarihi) {
        this.guncellemetarihi = guncellemetarihi;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }
    public String getListHeader(){

        return adi;

    }

    public BigInteger getHeaderID(){

        return id;

    }
}
