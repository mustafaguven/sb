package com.timboict.saglikbakanligi.model;

import java.math.BigInteger;

/**
 * Created by ugokay on 06/05/15.
 */
public class ISBSSebekeModel extends GeneralDataModel {

    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String kodu;
    private String adi;
    private BigInteger kaynakId;
    private BigInteger depoId;
    //private Date insaatBaslangicTarihi;
    //private Date insaatBitisTarihi;
    //private Date sonYenilemeTarihi;
    private BigInteger gunlukUretimMiktari;
    private BigInteger kullaniciNufusu;
    private BigInteger kontrolNumuneAlmaSayisi;
    private BigInteger denetimNumuneAlmaSayisi;
    private BigInteger uzunlugu;
    private Character pvcKullanimDurumu;
    private Character asbestKullanimDurumu;
    private Character celikKullanimDurumu;
    private Character duktilKullanimDurumu;
    private Character plastikKullanimDurumu;
    private Character ctpKullanimDurumu;
    private String adresIlCkysKod;
    private BigInteger adresIlceCkysKod;
    private String sebekeKlorlamaYeri;
    private String merkezKod;
    private Character faalDrm;
    private Character klorCihazDurumu;
    private Character klorCihazFaaliyetDurumu;
    private BigInteger klorCihazCinsiKodId;
    private BigInteger klorCihazTipiKodId;
    private BigInteger klorlamaCihazKaynakKodId;
   // private Date klorCihazTakilmaTarihi;
    private String klorAciklama;
   // private Date guncellemetarihi;
   // private Date eklemetarihi;
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

    public BigInteger getKaynakId() {
        return kaynakId;
    }

    public void setKaynakId(BigInteger kaynakId) {
        this.kaynakId = kaynakId;
    }

    public BigInteger getDepoId() {
        return depoId;
    }

    public void setDepoId(BigInteger depoId) {
        this.depoId = depoId;
    }

  /*  public Date getInsaatBaslangicTarihi() {
        return insaatBaslangicTarihi;
    }

    public void setInsaatBaslangicTarihi(Date insaatBaslangicTarihi) {
        this.insaatBaslangicTarihi = insaatBaslangicTarihi;
    }

    public Date getInsaatBitisTarihi() {
        return insaatBitisTarihi;
    }

    public void setInsaatBitisTarihi(Date insaatBitisTarihi) {
        this.insaatBitisTarihi = insaatBitisTarihi;
    }

    public Date getSonYenilemeTarihi() {
        return sonYenilemeTarihi;
    }

    public void setSonYenilemeTarihi(Date sonYenilemeTarihi) {
        this.sonYenilemeTarihi = sonYenilemeTarihi;
    }
*/
    public BigInteger getGunlukUretimMiktari() {
        return gunlukUretimMiktari;
    }

    public void setGunlukUretimMiktari(BigInteger gunlukUretimMiktari) {
        this.gunlukUretimMiktari = gunlukUretimMiktari;
    }

    public BigInteger getKullaniciNufusu() {
        return kullaniciNufusu;
    }

    public void setKullaniciNufusu(BigInteger kullaniciNufusu) {
        this.kullaniciNufusu = kullaniciNufusu;
    }

    public BigInteger getKontrolNumuneAlmaSayisi() {
        return kontrolNumuneAlmaSayisi;
    }

    public void setKontrolNumuneAlmaSayisi(BigInteger kontrolNumuneAlmaSayisi) {
        this.kontrolNumuneAlmaSayisi = kontrolNumuneAlmaSayisi;
    }

    public BigInteger getDenetimNumuneAlmaSayisi() {
        return denetimNumuneAlmaSayisi;
    }

    public void setDenetimNumuneAlmaSayisi(BigInteger denetimNumuneAlmaSayisi) {
        this.denetimNumuneAlmaSayisi = denetimNumuneAlmaSayisi;
    }

    public BigInteger getUzunlugu() {
        return uzunlugu;
    }

    public void setUzunlugu(BigInteger uzunlugu) {
        this.uzunlugu = uzunlugu;
    }

    public Character getPvcKullanimDurumu() {
        return pvcKullanimDurumu;
    }

    public void setPvcKullanimDurumu(Character pvcKullanimDurumu) {
        this.pvcKullanimDurumu = pvcKullanimDurumu;
    }

    public Character getAsbestKullanimDurumu() {
        return asbestKullanimDurumu;
    }

    public void setAsbestKullanimDurumu(Character asbestKullanimDurumu) {
        this.asbestKullanimDurumu = asbestKullanimDurumu;
    }

    public Character getCelikKullanimDurumu() {
        return celikKullanimDurumu;
    }

    public void setCelikKullanimDurumu(Character celikKullanimDurumu) {
        this.celikKullanimDurumu = celikKullanimDurumu;
    }

    public Character getDuktilKullanimDurumu() {
        return duktilKullanimDurumu;
    }

    public void setDuktilKullanimDurumu(Character duktilKullanimDurumu) {
        this.duktilKullanimDurumu = duktilKullanimDurumu;
    }

    public Character getPlastikKullanimDurumu() {
        return plastikKullanimDurumu;
    }

    public void setPlastikKullanimDurumu(Character plastikKullanimDurumu) {
        this.plastikKullanimDurumu = plastikKullanimDurumu;
    }

    public Character getCtpKullanimDurumu() {
        return ctpKullanimDurumu;
    }

    public void setCtpKullanimDurumu(Character ctpKullanimDurumu) {
        this.ctpKullanimDurumu = ctpKullanimDurumu;
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

    public String getSebekeKlorlamaYeri() {
        return sebekeKlorlamaYeri;
    }

    public void setSebekeKlorlamaYeri(String sebekeKlorlamaYeri) {
        this.sebekeKlorlamaYeri = sebekeKlorlamaYeri;
    }

    public String getMerkezKod() {
        return merkezKod;
    }

    public void setMerkezKod(String merkezKod) {
        this.merkezKod = merkezKod;
    }

    public Character getFaalDrm() {
        return faalDrm;
    }

    public void setFaalDrm(Character faalDrm) {
        this.faalDrm = faalDrm;
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

   /* public Date getKlorCihazTakilmaTarihi() {
        return klorCihazTakilmaTarihi;
    }

    public void setKlorCihazTakilmaTarihi(Date klorCihazTakilmaTarihi) {
        this.klorCihazTakilmaTarihi = klorCihazTakilmaTarihi;
    }
*/
    public String getKlorAciklama() {
        return klorAciklama;
    }

    public void setKlorAciklama(String klorAciklama) {
        this.klorAciklama = klorAciklama;
    }

   /* public Date getGuncellemetarihi() {
        return guncellemetarihi;
    }

    public void setGuncellemetarihi(Date guncellemetarihi) {
        this.guncellemetarihi = guncellemetarihi;
    }

    public Date getEklemetarihi() {
        return eklemetarihi;
    }

    public void setEklemetarihi(Date eklemetarihi) {
        this.eklemetarihi = eklemetarihi;
    }*/

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
