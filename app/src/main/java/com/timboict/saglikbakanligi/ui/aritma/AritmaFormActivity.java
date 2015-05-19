package com.timboict.saglikbakanligi.ui.aritma;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.component.FormEditText;
import com.timboict.saglikbakanligi.component.FormSpinner;
import com.timboict.saglikbakanligi.enums.Extras;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mustafaguven on 19.05.2015.
 */
public class AritmaFormActivity extends BaseActivity {

    @InjectView(R.id.lnMainView)
    LinearLayout lnMainView;

    @InjectView(R.id.lblMainTitle)
    TextView lblMainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aritma_tesisi_form);
        ButterKnife.inject(this);

        lblMainTitle.setText(getString(R.string.aritma_form_main_title));

        createForm();
        if(getIntent().getExtras()!=null){
            if(getIntent().getExtras().getString(Extras.ARITMA_ID)!=null) {
                setOpenedForUpdate(true);
                populateForm();
            }
        }
    }

    private void populateForm() {
        //TODO update ile devam et
    }

    private void createForm() {
        LinearLayout lnGenelBilgiler = createCommonSub("GENEL BİLGİLER");                               lnMainView.addView(lnGenelBilgiler);
        FormEditText txtKodu = createEditTextItem("Kodu");                                              lnMainView.addView(txtKodu);
        FormEditText txtAdi  = createEditTextItem("Adı");                                               lnMainView.addView(txtAdi);
        FormEditText txtAdresi = createEditTextItem("Adresi");                                          lnMainView.addView(txtAdresi);
        FormEditText txtMevkisi = createEditTextItem("Mevkisi");                                        lnMainView.addView(txtMevkisi);
        FormEditText txtSahibi = createEditTextItem("Sahibi");                                          lnMainView.addView(txtSahibi);
        FormEditText txtIsleticisi = createEditTextItem("İşleticisi");                                  lnMainView.addView(txtIsleticisi);
        FormSpinner ddlTipi = createSpinnerFormItem("Tipi", new String[]{"BASİT", "FONKSİYONEL", "İLERİ DÜZEY ARITMA", "PAKET ARITMA"});            lnMainView.addView(ddlTipi);
        FormEditText txtKapasitesi = createEditTextItem("Kapasitesi");                                  lnMainView.addView(txtKapasitesi);
        FormEditText txtTelefon = createEditTextItem("Telefon");                                        lnMainView.addView(txtTelefon);
        FormEditText txtEklenmeTarihi = createEditTextItem("Eklenme Tarihi");                           lnMainView.addView(txtEklenmeTarihi);
        LinearLayout lnCografiKonumBilgileri = createCommonSub("COĞRAFİ KONUM BİLGİLERİ");              lnMainView.addView(lnCografiKonumBilgileri);
        FormEditText txtEnlem = createEditTextItem("Enlem / X");                                        lnMainView.addView(txtEnlem);
        FormEditText txtBoylam = createEditTextItem("Boylam / Y");                                      lnMainView.addView(txtBoylam);
        Button btnKoordinatGuncelle = new Button(this);
        btnKoordinatGuncelle.setText("Güncelle");
        lnMainView.addView(btnKoordinatGuncelle);
        LinearLayout lnKullanilanKimyasal = createCommonSub("KULLANILAN KİMYASAL BİLGİLER");            lnMainView.addView(lnKullanilanKimyasal);
        FormSpinner ddlAluminyumSulfat = createSpinnerFormItem("Alüminyum Sülfat Kullanılıyor mu?");      lnMainView.addView(ddlAluminyumSulfat);
        FormSpinner ddlDemirKlorur = createSpinnerFormItem("Demir III Klorür Kullanılıyor mu?");      lnMainView.addView(ddlDemirKlorur);
        FormSpinner ddlKirec = createSpinnerFormItem("Kireç Kullanılıyor mu?");      lnMainView.addView(ddlKirec);
        FormSpinner ddlKlor= createSpinnerFormItem("Klor Kullanılıyor mu?");      lnMainView.addView(ddlKlor);
        FormSpinner ddlPolielektrolit = createSpinnerFormItem("Polielektrolit Kullanılıyor mu?");      lnMainView.addView(ddlPolielektrolit);
        FormSpinner ddlSulfirikAsit = createSpinnerFormItem("Sülfirik Asit Kullanılıyor mu?");      lnMainView.addView(ddlSulfirikAsit);
        FormSpinner ddlKloraminasyon = createSpinnerFormItem("Kloraminasyon Kullanılıyor mu?");      lnMainView.addView(ddlKloraminasyon);
        FormEditText txtDiger = createEditTextItem("Diğer");                                        lnMainView.addView(txtDiger);
        LinearLayout lnKlorlamaDurumu = createCommonSub("KLORLAMA DURUMU");            lnMainView.addView(lnKlorlamaDurumu);
        FormSpinner ddlKlorlamaCihazi = createSpinnerFormItem("Klorlama Cihazı var mı?");      lnMainView.addView(ddlKlorlamaCihazi);
        Button btnFotografEkle = new Button(this);
        btnFotografEkle.setText("Fotoğraf Ekle");
        lnMainView.addView(btnFotografEkle);
        Button btnKaydetDuzenle = new Button(this);
        btnKaydetDuzenle.setText(isOpenedForUpdate() ? "DÜZENLE" : "KAYDET");
        lnMainView.addView(btnKaydetDuzenle);
    }
}
