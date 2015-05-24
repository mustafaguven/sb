package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ardadogantemur on 05/05/15.
 */
public class ISBSDepoModel extends GeneralDataModel
{
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String kodu;
    private String adi;
    private String adresMevkii;
    private BigInteger hacmi;
    private BigInteger cografiKonumOndalikX;
    private BigInteger cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private BigInteger cografiKonumDakikaX;
    private BigInteger cografiKonumDakikaY;
    private BigInteger cografiKonumSaniyeX;
    private BigInteger cografiKonumSaniyeY;
    private Character klorCihazDurumu;
    private Character klorCihazFaaliyetDurumu;
    private BigInteger klorCihazCinsiKodId;
    private BigInteger klorCihazTipiKodId;
    private BigInteger klorlamaCihazKaynakKodId;
    private Character numuneAlmaMuslukDurumu;
    private Character korumaAlaniDurumu;
    private Character havalandirmaDurumu;
    private Character sabitMerdivenDurumu;
    private Character suylaTemasEdenYuzeyDurumu;
    private BigInteger depoBirlesenId;
    private String adresIlCkysKod;
    private BigInteger adresIlceCkysKod;
    private BigInteger konumAdresId;
    private BigInteger depoBirlesenId2;
    private BigInteger depoBirlesenId3;
    private BigInteger depoBirlesenId4;
    private Character depoGuvenlikDurumu;
    private String merkezKod;
    private String cografiKonumOndalikX1;
    private String cografiKonumOndalikY1;
    private BigInteger kacGozlu;
    private Character manevraOdasi;
    private Character aktifDrm;
    private String miStyle;
    private Long miPrinx;
    private float xx;
    private float yy;
    private String terminal;
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

    public String getAdresMevkii() {
        return adresMevkii;
    }

    public void setAdresMevkii(String adresMevkii) {
        this.adresMevkii = adresMevkii;
    }

    public BigInteger getHacmi() {
        return hacmi;
    }

    public void setHacmi(BigInteger hacmi) {
        this.hacmi = hacmi;
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
        System.out.println(klorlamaCihazKaynakKodId);
        if(klorlamaCihazKaynakKodId.intValue() == 7 ){
            klorlamaCihazKaynakKodId = new BigInteger("2");
            System.out.println(klorlamaCihazKaynakKodId);

            return klorlamaCihazKaynakKodId;
        }
        else{
            return klorlamaCihazKaynakKodId;
        }


    }

    public void setKlorlamaCihazKaynakKodId(BigInteger klorlamaCihazKaynakKodId) {
        this.klorlamaCihazKaynakKodId = klorlamaCihazKaynakKodId;
    }

    public Character getNumuneAlmaMuslukDurumu() {
        return numuneAlmaMuslukDurumu;
    }

    public void setNumuneAlmaMuslukDurumu(Character numuneAlmaMuslukDurumu) {
        this.numuneAlmaMuslukDurumu = numuneAlmaMuslukDurumu;
    }

    public Character getKorumaAlaniDurumu() {
        return korumaAlaniDurumu;
    }

    public void setKorumaAlaniDurumu(Character korumaAlaniDurumu) {
        this.korumaAlaniDurumu = korumaAlaniDurumu;
    }

    public Character getHavalandirmaDurumu() {
        return havalandirmaDurumu;
    }

    public void setHavalandirmaDurumu(Character havalandirmaDurumu) {
        this.havalandirmaDurumu = havalandirmaDurumu;
    }

    public Character getSabitMerdivenDurumu() {
        return sabitMerdivenDurumu;
    }

    public void setSabitMerdivenDurumu(Character sabitMerdivenDurumu) {
        this.sabitMerdivenDurumu = sabitMerdivenDurumu;
    }

    public Character getSuylaTemasEdenYuzeyDurumu() {
        return suylaTemasEdenYuzeyDurumu;
    }

    public void setSuylaTemasEdenYuzeyDurumu(Character suylaTemasEdenYuzeyDurumu) {
        this.suylaTemasEdenYuzeyDurumu = suylaTemasEdenYuzeyDurumu;
    }

    public BigInteger getDepoBirlesenId() {
        return depoBirlesenId;
    }

    public void setDepoBirlesenId(BigInteger depoBirlesenId) {
        this.depoBirlesenId = depoBirlesenId;
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

    public BigInteger getDepoBirlesenId2() {
        return depoBirlesenId2;
    }

    public void setDepoBirlesenId2(BigInteger depoBirlesenId2) {
        this.depoBirlesenId2 = depoBirlesenId2;
    }

    public BigInteger getDepoBirlesenId3() {
        return depoBirlesenId3;
    }

    public void setDepoBirlesenId3(BigInteger depoBirlesenId3) {
        this.depoBirlesenId3 = depoBirlesenId3;
    }

    public BigInteger getDepoBirlesenId4() {
        return depoBirlesenId4;
    }

    public void setDepoBirlesenId4(BigInteger depoBirlesenId4) {
        this.depoBirlesenId4 = depoBirlesenId4;
    }

    public Character getDepoGuvenlikDurumu() {
        return depoGuvenlikDurumu;
    }

    public void setDepoGuvenlikDurumu(Character depoGuvenlikDurumu) {
        this.depoGuvenlikDurumu = depoGuvenlikDurumu;
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

    public BigInteger getKacGozlu() {
        return kacGozlu;
    }

    public void setKacGozlu(BigInteger kacGozlu) {
        this.kacGozlu = kacGozlu;
    }

    public Character getManevraOdasi() {
        return manevraOdasi;
    }

    public void setManevraOdasi(Character manevraOdasi) {
        this.manevraOdasi = manevraOdasi;
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



    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }


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
