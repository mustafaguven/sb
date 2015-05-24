package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ugokay on 06/05/15.
 */
public class ISBSIzlemeNoktalariModel extends GeneralDataModel {

    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String kodu;
    private String adi;
    private String adresi;
    private String adresIlCkysKod;
    private BigInteger adresIlceCkysKod;
    private BigInteger konumAdresId;
    private BigInteger birimId;
    private BigInteger sebekeId;
    private BigInteger mevzuatKodId;
    private BigInteger cografiKonumOndalikX;
    private BigInteger cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private BigInteger cografiKonumDakikaX;
    private BigInteger cografiKonumDakikaY;
    private BigInteger cografiKonumSaniyeX;
    private BigInteger cografiKonumSaniyeY;
    private String koyAdi;
    private String mahalleAdi;
    private String cografiKonumOndalikX1;
    private String cografiKonumOndalikY1;
    private Character aktifDrm;
    private String miStyle;
    private Long miPrinx;
    private float xx;
    private float yy;
   // private Date eklenmetarihi;
    private BigInteger olusturmaNedeni;
    private String terminal;
   // private Date guncellemetarihi;
    private String kullanici;
    private String numuneSahibi;
    private BigInteger adresMahkod;
    private BigInteger islenmedi;

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

    public BigInteger getBirimId() {
        return birimId;
    }

    public void setBirimId(BigInteger birimId) {
        this.birimId = birimId;
    }

    public BigInteger getSebekeId() {
        return sebekeId;
    }

    public void setSebekeId(BigInteger sebekeId) {
        this.sebekeId = sebekeId;
    }

    public BigInteger getMevzuatKodId() {
        return mevzuatKodId;
    }

    public void setMevzuatKodId(BigInteger mevzuatKodId) {
        this.mevzuatKodId = mevzuatKodId;
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

    public String getKoyAdi() {
        return koyAdi;
    }

    public void setKoyAdi(String koyAdi) {
        this.koyAdi = koyAdi;
    }

    public String getMahalleAdi() {
        return mahalleAdi;
    }

    public void setMahalleAdi(String mahalleAdi) {
        this.mahalleAdi = mahalleAdi;
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

    public Character getAktifDrm() {
        return aktifDrm;
    }

    public void setAktifDrm(Character aktifDrm) {
        this.aktifDrm = aktifDrm;
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

   /* public Date getEklenmetarihi() {
        return eklenmetarihi;
    }

    public void setEklenmetarihi(Date eklenmetarihi) {
        this.eklenmetarihi = eklenmetarihi;
    }
*/
    public BigInteger getOlusturmaNedeni() {
        return olusturmaNedeni;
    }

    public void setOlusturmaNedeni(BigInteger olusturmaNedeni) {
        this.olusturmaNedeni = olusturmaNedeni;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
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

    public String getNumuneSahibi() {
        return numuneSahibi;
    }

    public void setNumuneSahibi(String numuneSahibi) {
        this.numuneSahibi = numuneSahibi;
    }

    public BigInteger getAdresMahkod() {
        return adresMahkod;
    }

    public void setAdresMahkod(BigInteger adresMahkod) {
        this.adresMahkod = adresMahkod;
    }

    public BigInteger getIslenmedi() {
        return islenmedi;
    }

    public void setIslenmedi(BigInteger islenmedi) {
        this.islenmedi = islenmedi;
    }


    public String getListHeader(){

        return adi;

    }

    public BigInteger getHeaderID(){

        return id;

    }
}
