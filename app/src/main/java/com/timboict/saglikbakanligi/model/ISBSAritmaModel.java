package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ugokay on 06/05/15.
 */
public class ISBSAritmaModel extends GeneralDataModel{
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String kodu;
    private String adi;
    private String adresi;
    private String mevkii;
    private String kapasite;
    private BigInteger tipiKodId;
    private String sahibi;
    private String isleticisi;
    private String telefonu;
    private BigInteger cografiKonumOndalikX;
    private BigInteger cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private BigInteger cografiKonumDakikaX;
    private BigInteger cografiKonumDakikaY;
    private BigInteger cografiKonumSaniyeX;
    private BigInteger cografiKonumSaniyeY;
    private String aluminyumSulfat;
    private String demir3Klorur;
    private String kirec;
    private String klor;
    private String polielektrolit;
    private String sulfirikAsit;
    private String adresIlCkysKod;
    private BigInteger adresIlceCkysKod;
    private BigInteger konumAdresId;
    private String diger;
    private String cografiKonumOndalikX1;
    private String cografiKonumOndalikY1;
    private String kloraminasyon;
    private String miStyle;
    private Long miPrinx;
    private String xx;
    private String yy;
    private String eklenmetarihi;
    private String aktifDrm;
    private String terminal;
    private Character klorCihazDurumu;
    private Character klorCihazFaaliyetDurumu;
    private BigInteger klorCihazCinsiKodId;
    private BigInteger klorCihazTipiKodId;
    private BigInteger klorlamaCihazKaynakKodId;
    private String klorCihazTakilmaTarihi;
    //private Date guncellemetarihi;
    private String kullanici;
    private BigInteger adresMahkod;

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

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    public String getMevkii() {
        return mevkii;
    }

    public void setMevkii(String mevkii) {
        this.mevkii = mevkii;
    }

    public String getKapasite() {
        return kapasite;
    }

    public void setKapasite(String kapasite) {
        this.kapasite = kapasite;
    }

    public BigInteger getTipiKodId() {
        return tipiKodId;
    }

    public void setTipiKodId(BigInteger tipiKodId) {
        this.tipiKodId = tipiKodId;
    }

    public String getSahibi() {
        return sahibi;
    }

    public void setSahibi(String sahibi) {
        this.sahibi = sahibi;
    }

    public String getIsleticisi() {
        return isleticisi;
    }

    public void setIsleticisi(String isleticisi) {
        this.isleticisi = isleticisi;
    }

    public String getTelefonu() {
        return telefonu;
    }

    public void setTelefonu(String telefonu) {
        this.telefonu = telefonu;
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

    public String getAluminyumSulfat() {
        return aluminyumSulfat;
    }

    public void setAluminyumSulfat(String aluminyumSulfat) {
        this.aluminyumSulfat = aluminyumSulfat;
    }

    public String getDemir3Klorur() {
        return demir3Klorur;
    }

    public void setDemir3Klorur(String demir3Klorur) {
        this.demir3Klorur = demir3Klorur;
    }

    public String getKirec() {
        return kirec;
    }

    public void setKirec(String kirec) {
        this.kirec = kirec;
    }

    public String getKlor() {
        return klor;
    }

    public void setKlor(String klor) {
        this.klor = klor;
    }

    public String getPolielektrolit() {
        return polielektrolit;
    }

    public void setPolielektrolit(String polielektrolit) {
        this.polielektrolit = polielektrolit;
    }

    public String getSulfirikAsit() {
        return sulfirikAsit;
    }

    public void setSulfirikAsit(String sulfirikAsit) {
        this.sulfirikAsit = sulfirikAsit;
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

    public BigInteger getKonumAdresId() {
        return konumAdresId;
    }

    public void setKonumAdresId(BigInteger konumAdresId) {
        this.konumAdresId = konumAdresId;
    }

    public String getDiger() {
        return diger;
    }

    public void setDiger(String diger) {
        this.diger = diger;
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

    public String getKloraminasyon() {
        return kloraminasyon;
    }

    public void setKloraminasyon(String kloraminasyon) {
        this.kloraminasyon = kloraminasyon;
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

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public String getEklenmetarihi() {
        return eklenmetarihi;
    }

    public void setEklenmetarihi(String eklenmetarihi) {
        this.eklenmetarihi = eklenmetarihi;
    }

    public String getAktifDrm() {
        return aktifDrm;
    }

    public void setAktifDrm(String aktifDrm) {
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

  /*  public Date getGuncellemetarihi() {
        return guncellemetarihi;
    }

    public void setGuncellemetarihi(Date guncellemetarihi) {
        this.guncellemetarihi = guncellemetarihi;
    }*/

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public BigInteger getAdresMahkod() {
        return adresMahkod;
    }

    public void setAdresMahkod(BigInteger adresMahkod) {
        this.adresMahkod = adresMahkod;
    }

    public String getListHeader(){

        return adi;

    }

    public BigInteger getHeaderID(){

        return id;

    }
}
