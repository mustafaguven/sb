package com.timboict.saglikbakanligi.model;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ugokay on 08/05/15.
 */
public class ISBSNumuneModel extends GeneralDataModel{

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private BigDecimal id;
    private String adi;
    private String kodu;
    private BigInteger izlemeNoktasiId;
    private BigInteger numuneAlanBirimId;
    private String numuneAlanKisiAdi;
    private String numuneAlanKisiSoyadi;
    private String numuneAlanKisiGorevi;
    private String numuneAlanKisiTelefonu;
    private String numuneAlanKisiFaks;
    private String numuneAlanKisiEmail;
    private BigInteger mevzuatKodId;
    private BigInteger numuneAlmaAmaciKodId;
    // private Date numuneAlmaTarihi;
    // private Date numuneGondermeTarihi;
    private BigInteger numuneAlmaHavaDurumuKodId;
    private BigInteger numuneninSicakligi;
    private BigInteger kabulEdenBirimId;
    private String numuneKabulKisiAdi;
    private String numuneKabulKisiSoyadi;
    private String numuneKabulKisiGorevi;
    private String numuneKabulKisiTelefonu;
    private String numuneKabulKisiFaks;
    private String numuneKabulKisiEmail;
    // private Date numuneKabulTarihi;
    // private Date numuneKayitTarihi;
    private Character numuneKabulEdildimi;
    private BigInteger numuneninRedNedeniKodId;
    // private Date analizIlkKayitTarihi;
    // private Date raporTarihi;
    private BigInteger bakiyeKlorOlcumDegeri;
    private String takipDurumu;
    private String numuneKabiHacmi;
    private BigInteger numuneKabulNo;
    private String numuneAlmaAmaciAciklama;
    private BigInteger tkDepoId;
    private BigInteger tkKaynakId;
    private String tkDiger;
    private Character yuzeyselSuEtkilenme;
    private Character islemGormeDurumu;
    private String numuneAnalizNo;
    private BigInteger gonderilenLab;
    private BigInteger numuneKimAnalizNo;
    // private Date kimRaporTarihi;
    private BigInteger gonderilenLab2;
    private BigInteger kimKabulEdenBirimId;
    private String kimNumuneKabulKisiAdi;
    private String kimNumuneKabulKisiGorevi;
    private String kimNumuneKabulKisiTelefonu;
    private String kimNumuneKabulKisiFaks;
    private String kimNumuneKabulKisiEmail;
    // private Date kimNumuneKabulTarihi;
    private Character kimNumuneKabulEdildimi;
    private BigInteger kimNumuneninRedNedeniId;
    private BigInteger kimNumuneKabulNo;
    private String numuneAnalizKisiAdSoyadi1;
    private String numuneAnalizKisiGorevi1;
    private String numuneAnalizKisiAdSoyadi2;
    private String numuneAnalizKisiGorevi2;
    private String numuneAnalizKisiAdSoyadi3;
    private String numuneAnalizKisiGorevi3;
    private String numuneAnalizKisiAdSoyadi4;
    private String numuneAnalizKisiGorevi4;
    private String numuneAnalizKisiAdSoyadi5;
    private String numuneAnalizKisiGorevi5;
    private Character numuneGonDurumu;
    private String numuneKabulNo1;
    private String numuneKimAnalizNo1;
    private String kimNumuneKabulNo1;
    private String numuneAnalizKisiAdSoyadi6;
    private String numuneAnalizKisiGorevi6;
    private String numuneAnalizKisiAdSoyadi7;
    private String numuneAnalizKisiGorevi7;
    private String numuneAnalizKisiAdSoyadi8;
    private String numuneAnalizKisiGorevi8;
    private String numuneAnalizKisiAdSoyadi9;
    private String numuneAnalizKisiGorevi9;
    private String numuneAnalizKisiAdSoyad10;
    private String numuneAnalizKisiGorevi10;
    private String numuneSahibi;
    // private Date analizBaslamaTarihi;
    private BigInteger numuneAlmaAmaciKodId2;
    private Short analizTamamlandi;
    private Short uygunmu;
    private BigInteger takipNumuneId;
    // private Date bitisTarihi;
    // private Date analizIlkKayitTarihi2;
    private String kimNumuneKabulKisiSoyadi;
    private String numuneAnalizTamamlandi;
    private String kimNumuneAnalizTamamlandi;
    private String cografiKonumOndalikX;
    private String cografiKonumOndalikY;
    private BigInteger cografiKonumDereceX;
    private BigInteger cografiKonumDereceY;
    private String terminal;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getId() {
        return id;
    }
    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi;
    }


    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    public BigInteger getIzlemeNoktasiId() {
        return izlemeNoktasiId;
    }

    public void setIzlemeNoktasiId(BigInteger izlemeNoktasiId) {
        this.izlemeNoktasiId = izlemeNoktasiId;
    }

    public BigInteger getNumuneAlanBirimId() {
        return numuneAlanBirimId;
    }

    public void setNumuneAlanBirimId(BigInteger numuneAlanBirimId) {
        this.numuneAlanBirimId = numuneAlanBirimId;
    }

    public String getNumuneAlanKisiAdi() {
        return numuneAlanKisiAdi;
    }

    public void setNumuneAlanKisiAdi(String numuneAlanKisiAdi) {
        this.numuneAlanKisiAdi = numuneAlanKisiAdi;
    }

    public String getNumuneAlanKisiSoyadi() {
        return numuneAlanKisiSoyadi;
    }

    public void setNumuneAlanKisiSoyadi(String numuneAlanKisiSoyadi) {
        this.numuneAlanKisiSoyadi = numuneAlanKisiSoyadi;
    }

    public String getNumuneAlanKisiGorevi() {
        return numuneAlanKisiGorevi;
    }

    public void setNumuneAlanKisiGorevi(String numuneAlanKisiGorevi) {
        this.numuneAlanKisiGorevi = numuneAlanKisiGorevi;
    }

    public String getNumuneAlanKisiTelefonu() {
        return numuneAlanKisiTelefonu;
    }

    public void setNumuneAlanKisiTelefonu(String numuneAlanKisiTelefonu) {
        this.numuneAlanKisiTelefonu = numuneAlanKisiTelefonu;
    }

    public String getNumuneAlanKisiFaks() {
        return numuneAlanKisiFaks;
    }

    public void setNumuneAlanKisiFaks(String numuneAlanKisiFaks) {
        this.numuneAlanKisiFaks = numuneAlanKisiFaks;
    }

    public String getNumuneAlanKisiEmail() {
        return numuneAlanKisiEmail;
    }

    public void setNumuneAlanKisiEmail(String numuneAlanKisiEmail) {
        this.numuneAlanKisiEmail = numuneAlanKisiEmail;
    }

    public BigInteger getMevzuatKodId() {
        return mevzuatKodId;
    }

    public void setMevzuatKodId(BigInteger mevzuatKodId) {
        this.mevzuatKodId = mevzuatKodId;
    }

    public BigInteger getNumuneAlmaAmaciKodId() {
        return numuneAlmaAmaciKodId;
    }

    public void setNumuneAlmaAmaciKodId(BigInteger numuneAlmaAmaciKodId) {
        this.numuneAlmaAmaciKodId = numuneAlmaAmaciKodId;
    }

    public BigInteger getNumuneAlmaHavaDurumuKodId() {
        return numuneAlmaHavaDurumuKodId;
    }

    public void setNumuneAlmaHavaDurumuKodId(BigInteger numuneAlmaHavaDurumuKodId) {
        this.numuneAlmaHavaDurumuKodId = numuneAlmaHavaDurumuKodId;
    }

    public BigInteger getNumuneninSicakligi() {
        return numuneninSicakligi;
    }

    public void setNumuneninSicakligi(BigInteger numuneninSicakligi) {
        this.numuneninSicakligi = numuneninSicakligi;
    }

    public BigInteger getKabulEdenBirimId() {
        return kabulEdenBirimId;
    }

    public void setKabulEdenBirimId(BigInteger kabulEdenBirimId) {
        this.kabulEdenBirimId = kabulEdenBirimId;
    }

    public String getNumuneKabulKisiAdi() {
        return numuneKabulKisiAdi;
    }

    public void setNumuneKabulKisiAdi(String numuneKabulKisiAdi) {
        this.numuneKabulKisiAdi = numuneKabulKisiAdi;
    }

    public String getNumuneKabulKisiSoyadi() {
        return numuneKabulKisiSoyadi;
    }

    public void setNumuneKabulKisiSoyadi(String numuneKabulKisiSoyadi) {
        this.numuneKabulKisiSoyadi = numuneKabulKisiSoyadi;
    }

    public String getNumuneKabulKisiGorevi() {
        return numuneKabulKisiGorevi;
    }

    public void setNumuneKabulKisiGorevi(String numuneKabulKisiGorevi) {
        this.numuneKabulKisiGorevi = numuneKabulKisiGorevi;
    }

    public String getNumuneKabulKisiTelefonu() {
        return numuneKabulKisiTelefonu;
    }

    public void setNumuneKabulKisiTelefonu(String numuneKabulKisiTelefonu) {
        this.numuneKabulKisiTelefonu = numuneKabulKisiTelefonu;
    }

    public String getNumuneKabulKisiFaks() {
        return numuneKabulKisiFaks;
    }

    public void setNumuneKabulKisiFaks(String numuneKabulKisiFaks) {
        this.numuneKabulKisiFaks = numuneKabulKisiFaks;
    }

    public String getNumuneKabulKisiEmail() {
        return numuneKabulKisiEmail;
    }

    public void setNumuneKabulKisiEmail(String numuneKabulKisiEmail) {
        this.numuneKabulKisiEmail = numuneKabulKisiEmail;
    }

    public Character getNumuneKabulEdildimi() {
        return numuneKabulEdildimi;
    }

    public void setNumuneKabulEdildimi(Character numuneKabulEdildimi) {
        this.numuneKabulEdildimi = numuneKabulEdildimi;
    }

    public BigInteger getNumuneninRedNedeniKodId() {
        return numuneninRedNedeniKodId;
    }

    public void setNumuneninRedNedeniKodId(BigInteger numuneninRedNedeniKodId) {
        this.numuneninRedNedeniKodId = numuneninRedNedeniKodId;
    }

    public BigInteger getBakiyeKlorOlcumDegeri() {
        return bakiyeKlorOlcumDegeri;
    }

    public void setBakiyeKlorOlcumDegeri(BigInteger bakiyeKlorOlcumDegeri) {
        this.bakiyeKlorOlcumDegeri = bakiyeKlorOlcumDegeri;
    }

    public String getTakipDurumu() {
        return takipDurumu;
    }

    public void setTakipDurumu(String takipDurumu) {
        this.takipDurumu = takipDurumu;
    }

    public String getNumuneKabiHacmi() {
        return numuneKabiHacmi;
    }

    public void setNumuneKabiHacmi(String numuneKabiHacmi) {
        this.numuneKabiHacmi = numuneKabiHacmi;
    }

    public BigInteger getNumuneKabulNo() {
        return numuneKabulNo;
    }

    public void setNumuneKabulNo(BigInteger numuneKabulNo) {
        this.numuneKabulNo = numuneKabulNo;
    }

    public String getNumuneAlmaAmaciAciklama() {
        return numuneAlmaAmaciAciklama;
    }

    public void setNumuneAlmaAmaciAciklama(String numuneAlmaAmaciAciklama) {
        this.numuneAlmaAmaciAciklama = numuneAlmaAmaciAciklama;
    }

    public BigInteger getTkDepoId() {
        return tkDepoId;
    }

    public void setTkDepoId(BigInteger tkDepoId) {
        this.tkDepoId = tkDepoId;
    }

    public BigInteger getTkKaynakId() {
        return tkKaynakId;
    }

    public void setTkKaynakId(BigInteger tkKaynakId) {
        this.tkKaynakId = tkKaynakId;
    }

    public String getTkDiger() {
        return tkDiger;
    }

    public void setTkDiger(String tkDiger) {
        this.tkDiger = tkDiger;
    }

    public Character getYuzeyselSuEtkilenme() {
        return yuzeyselSuEtkilenme;
    }

    public void setYuzeyselSuEtkilenme(Character yuzeyselSuEtkilenme) {
        this.yuzeyselSuEtkilenme = yuzeyselSuEtkilenme;
    }

    public Character getIslemGormeDurumu() {
        return islemGormeDurumu;
    }

    public void setIslemGormeDurumu(Character islemGormeDurumu) {
        this.islemGormeDurumu = islemGormeDurumu;
    }

    public String getNumuneAnalizNo() {
        return numuneAnalizNo;
    }

    public void setNumuneAnalizNo(String numuneAnalizNo) {
        this.numuneAnalizNo = numuneAnalizNo;
    }

    public BigInteger getGonderilenLab() {
        return gonderilenLab;
    }

    public void setGonderilenLab(BigInteger gonderilenLab) {
        this.gonderilenLab = gonderilenLab;
    }

    public BigInteger getNumuneKimAnalizNo() {
        return numuneKimAnalizNo;
    }

    public void setNumuneKimAnalizNo(BigInteger numuneKimAnalizNo) {
        this.numuneKimAnalizNo = numuneKimAnalizNo;
    }

    public BigInteger getGonderilenLab2() {
        return gonderilenLab2;
    }

    public void setGonderilenLab2(BigInteger gonderilenLab2) {
        this.gonderilenLab2 = gonderilenLab2;
    }

    public BigInteger getKimKabulEdenBirimId() {
        return kimKabulEdenBirimId;
    }

    public void setKimKabulEdenBirimId(BigInteger kimKabulEdenBirimId) {
        this.kimKabulEdenBirimId = kimKabulEdenBirimId;
    }

    public String getKimNumuneKabulKisiAdi() {
        return kimNumuneKabulKisiAdi;
    }

    public void setKimNumuneKabulKisiAdi(String kimNumuneKabulKisiAdi) {
        this.kimNumuneKabulKisiAdi = kimNumuneKabulKisiAdi;
    }

    public String getKimNumuneKabulKisiGorevi() {
        return kimNumuneKabulKisiGorevi;
    }

    public void setKimNumuneKabulKisiGorevi(String kimNumuneKabulKisiGorevi) {
        this.kimNumuneKabulKisiGorevi = kimNumuneKabulKisiGorevi;
    }

    public String getKimNumuneKabulKisiTelefonu() {
        return kimNumuneKabulKisiTelefonu;
    }

    public void setKimNumuneKabulKisiTelefonu(String kimNumuneKabulKisiTelefonu) {
        this.kimNumuneKabulKisiTelefonu = kimNumuneKabulKisiTelefonu;
    }

    public String getKimNumuneKabulKisiFaks() {
        return kimNumuneKabulKisiFaks;
    }

    public void setKimNumuneKabulKisiFaks(String kimNumuneKabulKisiFaks) {
        this.kimNumuneKabulKisiFaks = kimNumuneKabulKisiFaks;
    }

    public String getKimNumuneKabulKisiEmail() {
        return kimNumuneKabulKisiEmail;
    }

    public void setKimNumuneKabulKisiEmail(String kimNumuneKabulKisiEmail) {
        this.kimNumuneKabulKisiEmail = kimNumuneKabulKisiEmail;
    }

    public Character getKimNumuneKabulEdildimi() {
        return kimNumuneKabulEdildimi;
    }

    public void setKimNumuneKabulEdildimi(Character kimNumuneKabulEdildimi) {
        this.kimNumuneKabulEdildimi = kimNumuneKabulEdildimi;
    }

    public BigInteger getKimNumuneninRedNedeniId() {
        return kimNumuneninRedNedeniId;
    }

    public void setKimNumuneninRedNedeniId(BigInteger kimNumuneninRedNedeniId) {
        this.kimNumuneninRedNedeniId = kimNumuneninRedNedeniId;
    }

    public BigInteger getKimNumuneKabulNo() {
        return kimNumuneKabulNo;
    }

    public void setKimNumuneKabulNo(BigInteger kimNumuneKabulNo) {
        this.kimNumuneKabulNo = kimNumuneKabulNo;
    }

    public String getNumuneAnalizKisiAdSoyadi1() {
        return numuneAnalizKisiAdSoyadi1;
    }

    public void setNumuneAnalizKisiAdSoyadi1(String numuneAnalizKisiAdSoyadi1) {
        this.numuneAnalizKisiAdSoyadi1 = numuneAnalizKisiAdSoyadi1;
    }

    public String getNumuneAnalizKisiGorevi1() {
        return numuneAnalizKisiGorevi1;
    }

    public void setNumuneAnalizKisiGorevi1(String numuneAnalizKisiGorevi1) {
        this.numuneAnalizKisiGorevi1 = numuneAnalizKisiGorevi1;
    }

    public String getNumuneAnalizKisiAdSoyadi2() {
        return numuneAnalizKisiAdSoyadi2;
    }

    public void setNumuneAnalizKisiAdSoyadi2(String numuneAnalizKisiAdSoyadi2) {
        this.numuneAnalizKisiAdSoyadi2 = numuneAnalizKisiAdSoyadi2;
    }

    public String getNumuneAnalizKisiGorevi2() {
        return numuneAnalizKisiGorevi2;
    }

    public void setNumuneAnalizKisiGorevi2(String numuneAnalizKisiGorevi2) {
        this.numuneAnalizKisiGorevi2 = numuneAnalizKisiGorevi2;
    }

    public String getNumuneAnalizKisiAdSoyadi3() {
        return numuneAnalizKisiAdSoyadi3;
    }

    public void setNumuneAnalizKisiAdSoyadi3(String numuneAnalizKisiAdSoyadi3) {
        this.numuneAnalizKisiAdSoyadi3 = numuneAnalizKisiAdSoyadi3;
    }

    public String getNumuneAnalizKisiGorevi3() {
        return numuneAnalizKisiGorevi3;
    }

    public void setNumuneAnalizKisiGorevi3(String numuneAnalizKisiGorevi3) {
        this.numuneAnalizKisiGorevi3 = numuneAnalizKisiGorevi3;
    }

    public String getNumuneAnalizKisiAdSoyadi4() {
        return numuneAnalizKisiAdSoyadi4;
    }

    public void setNumuneAnalizKisiAdSoyadi4(String numuneAnalizKisiAdSoyadi4) {
        this.numuneAnalizKisiAdSoyadi4 = numuneAnalizKisiAdSoyadi4;
    }

    public String getNumuneAnalizKisiGorevi4() {
        return numuneAnalizKisiGorevi4;
    }

    public void setNumuneAnalizKisiGorevi4(String numuneAnalizKisiGorevi4) {
        this.numuneAnalizKisiGorevi4 = numuneAnalizKisiGorevi4;
    }

    public String getNumuneAnalizKisiAdSoyadi5() {
        return numuneAnalizKisiAdSoyadi5;
    }

    public void setNumuneAnalizKisiAdSoyadi5(String numuneAnalizKisiAdSoyadi5) {
        this.numuneAnalizKisiAdSoyadi5 = numuneAnalizKisiAdSoyadi5;
    }

    public String getNumuneAnalizKisiGorevi5() {
        return numuneAnalizKisiGorevi5;
    }

    public void setNumuneAnalizKisiGorevi5(String numuneAnalizKisiGorevi5) {
        this.numuneAnalizKisiGorevi5 = numuneAnalizKisiGorevi5;
    }

    public Character getNumuneGonDurumu() {
        return numuneGonDurumu;
    }

    public void setNumuneGonDurumu(Character numuneGonDurumu) {
        this.numuneGonDurumu = numuneGonDurumu;
    }

    public String getNumuneKabulNo1() {
        return numuneKabulNo1;
    }

    public void setNumuneKabulNo1(String numuneKabulNo1) {
        this.numuneKabulNo1 = numuneKabulNo1;
    }

    public String getNumuneKimAnalizNo1() {
        return numuneKimAnalizNo1;
    }

    public void setNumuneKimAnalizNo1(String numuneKimAnalizNo1) {
        this.numuneKimAnalizNo1 = numuneKimAnalizNo1;
    }

    public String getKimNumuneKabulNo1() {
        return kimNumuneKabulNo1;
    }

    public void setKimNumuneKabulNo1(String kimNumuneKabulNo1) {
        this.kimNumuneKabulNo1 = kimNumuneKabulNo1;
    }

    public String getNumuneAnalizKisiAdSoyadi6() {
        return numuneAnalizKisiAdSoyadi6;
    }

    public void setNumuneAnalizKisiAdSoyadi6(String numuneAnalizKisiAdSoyadi6) {
        this.numuneAnalizKisiAdSoyadi6 = numuneAnalizKisiAdSoyadi6;
    }

    public String getNumuneAnalizKisiGorevi6() {
        return numuneAnalizKisiGorevi6;
    }

    public void setNumuneAnalizKisiGorevi6(String numuneAnalizKisiGorevi6) {
        this.numuneAnalizKisiGorevi6 = numuneAnalizKisiGorevi6;
    }

    public String getNumuneAnalizKisiAdSoyadi7() {
        return numuneAnalizKisiAdSoyadi7;
    }

    public void setNumuneAnalizKisiAdSoyadi7(String numuneAnalizKisiAdSoyadi7) {
        this.numuneAnalizKisiAdSoyadi7 = numuneAnalizKisiAdSoyadi7;
    }

    public String getNumuneAnalizKisiGorevi7() {
        return numuneAnalizKisiGorevi7;
    }

    public void setNumuneAnalizKisiGorevi7(String numuneAnalizKisiGorevi7) {
        this.numuneAnalizKisiGorevi7 = numuneAnalizKisiGorevi7;
    }

    public String getNumuneAnalizKisiAdSoyadi8() {
        return numuneAnalizKisiAdSoyadi8;
    }

    public void setNumuneAnalizKisiAdSoyadi8(String numuneAnalizKisiAdSoyadi8) {
        this.numuneAnalizKisiAdSoyadi8 = numuneAnalizKisiAdSoyadi8;
    }

    public String getNumuneAnalizKisiGorevi8() {
        return numuneAnalizKisiGorevi8;
    }

    public void setNumuneAnalizKisiGorevi8(String numuneAnalizKisiGorevi8) {
        this.numuneAnalizKisiGorevi8 = numuneAnalizKisiGorevi8;
    }

    public String getNumuneAnalizKisiAdSoyadi9() {
        return numuneAnalizKisiAdSoyadi9;
    }

    public void setNumuneAnalizKisiAdSoyadi9(String numuneAnalizKisiAdSoyadi9) {
        this.numuneAnalizKisiAdSoyadi9 = numuneAnalizKisiAdSoyadi9;
    }

    public String getNumuneAnalizKisiGorevi9() {
        return numuneAnalizKisiGorevi9;
    }

    public void setNumuneAnalizKisiGorevi9(String numuneAnalizKisiGorevi9) {
        this.numuneAnalizKisiGorevi9 = numuneAnalizKisiGorevi9;
    }

    public String getNumuneAnalizKisiAdSoyad10() {
        return numuneAnalizKisiAdSoyad10;
    }

    public void setNumuneAnalizKisiAdSoyad10(String numuneAnalizKisiAdSoyad10) {
        this.numuneAnalizKisiAdSoyad10 = numuneAnalizKisiAdSoyad10;
    }

    public String getNumuneAnalizKisiGorevi10() {
        return numuneAnalizKisiGorevi10;
    }

    public void setNumuneAnalizKisiGorevi10(String numuneAnalizKisiGorevi10) {
        this.numuneAnalizKisiGorevi10 = numuneAnalizKisiGorevi10;
    }

    public String getNumuneSahibi() {
        return numuneSahibi;
    }

    public void setNumuneSahibi(String numuneSahibi) {
        this.numuneSahibi = numuneSahibi;
    }

    public BigInteger getNumuneAlmaAmaciKodId2() {
        return numuneAlmaAmaciKodId2;
    }

    public void setNumuneAlmaAmaciKodId2(BigInteger numuneAlmaAmaciKodId2) {
        this.numuneAlmaAmaciKodId2 = numuneAlmaAmaciKodId2;
    }

    public Short getAnalizTamamlandi() {
        return analizTamamlandi;
    }

    public void setAnalizTamamlandi(Short analizTamamlandi) {
        this.analizTamamlandi = analizTamamlandi;
    }

    public Short getUygunmu() {
        return uygunmu;
    }

    public void setUygunmu(Short uygunmu) {
        this.uygunmu = uygunmu;
    }

    public BigInteger getTakipNumuneId() {
        return takipNumuneId;
    }

    public void setTakipNumuneId(BigInteger takipNumuneId) {
        this.takipNumuneId = takipNumuneId;
    }

    public String getKimNumuneKabulKisiSoyadi() {
        return kimNumuneKabulKisiSoyadi;
    }

    public void setKimNumuneKabulKisiSoyadi(String kimNumuneKabulKisiSoyadi) {
        this.kimNumuneKabulKisiSoyadi = kimNumuneKabulKisiSoyadi;
    }

    public String getNumuneAnalizTamamlandi() {
        return numuneAnalizTamamlandi;
    }

    public void setNumuneAnalizTamamlandi(String numuneAnalizTamamlandi) {
        this.numuneAnalizTamamlandi = numuneAnalizTamamlandi;
    }

    public String getKimNumuneAnalizTamamlandi() {
        return kimNumuneAnalizTamamlandi;
    }

    public void setKimNumuneAnalizTamamlandi(String kimNumuneAnalizTamamlandi) {
        this.kimNumuneAnalizTamamlandi = kimNumuneAnalizTamamlandi;
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
    // private Date logTarih;

    public String getListHeader(){

        return getAdi();

    }

    public BigInteger getHeaderID(){

        return id.toBigInteger();

    }
}
