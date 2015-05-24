package com.timboict.saglikbakanligi.ui.aritma;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.component.FormEditText;
import com.timboict.saglikbakanligi.component.FormPhotoAlbum;
import com.timboict.saglikbakanligi.component.FormSpinner;
import com.timboict.saglikbakanligi.enums.Extras;
import com.timboict.saglikbakanligi.manager.DetailManager;
import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.util.FileUtil;

import java.io.InputStream;
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

    private final String folderName="ARITMA_TEMP";
    private String mId;
    private DetailManager<ISBSAritmaModel> detailManager;

    LinearLayout lnCografiKonumBilgileri, lnKullanilanKimyasal, lnKlorlamaDurumu;
    FormEditText txtKodu, txtAdi, txtAdresi, txtMevkisi, txtSahibi, txtIsleticisi, txtKapasitesi, txtTelefon, txtEklenmeTarihi,
            txtEnlem, txtBoylam, txtDiger;

    FormSpinner ddlTipi, ddlAluminyumSulfat, ddlDemirKlorur, ddlKirec, ddlKlor, ddlPolielektrolit, ddlSulfirikAsit, ddlKloraminasyon, ddlKlorlamaCihazi;
    Button btnKoordinatGuncelle, btnKaydetDuzenle;

    FormPhotoAlbum formPhotoAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aritma_tesisi_form);
        ButterKnife.inject(this);

        lblMainTitle.setText(getString(R.string.aritma_form_main_title));
        detailManager = new DetailManager<>(this);


        createForm();
        if (getIntent().getExtras() != null) {
            if (getIntent().getExtras().getString(Extras.ID) != null) {
                this.mId = getIntent().getExtras().getString(Extras.ID);
                setOpenedForUpdate(true);
                populateForm();
            }
        }
    }

    private void populateForm() {

        detailManager.getAritmaDetail("aritma", mId, new ResponseListener<ISBSAritmaModel>() {
            @Override
            public void onSuccess(ISBSAritmaModel isbsAritmaModel) {
                txtKodu.setTxt(isbsAritmaModel.getKodu());
                txtAdi.setTxt(isbsAritmaModel.getAdi());
                txtAdresi.setTxt(isbsAritmaModel.getAdresi());
                txtMevkisi.setTxt(isbsAritmaModel.getMevkii());
                txtSahibi.setTxt(isbsAritmaModel.getSahibi());
                txtIsleticisi.setTxt(isbsAritmaModel.getIsleticisi());
                txtKapasitesi.setTxt(isbsAritmaModel.getKapasite());
                txtTelefon.setTxt(isbsAritmaModel.getTelefonu());

                txtEklenmeTarihi.setTxt(isbsAritmaModel.getEklenmetarihi());
                txtEnlem.setTxt(isbsAritmaModel.getCografiKonumOndalikX1());
                txtBoylam.setTxt(isbsAritmaModel.getCografiKonumOndalikY1());
                txtDiger.setTxt(isbsAritmaModel.getDiger());


/*                ddlTipi.setSelectionByPosition(String.valueOf(isbsAritmaModel.getTipiKodId()));
                ddlAluminyumSulfat.setSelectionByPosition(isbsAritmaModel.getAluminyumSulfat());
                ddlDemirKlorur.setSelectionByPosition(isbsAritmaModel.getDemir3Klorur());
                ddlKirec.setSelectionByPosition(isbsAritmaModel.getKirec());
                ddlKlor.setSelectionByPosition(isbsAritmaModel.getKlor());
                ddlPolielektrolit.setSelectionByPosition(isbsAritmaModel.getPolielektrolit());
                ddlKloraminasyon.setSelectionByPosition(isbsAritmaModel.getKloraminasyon());
                if (isbsAritmaModel.getKlorlamaCihazKaynakKodId() != null)
                    ddlKlorlamaCihazi.setSelectionByPosition(String.valueOf(isbsAritmaModel.getKlorlamaCihazKaynakKodId()));*/
            }

            @Override
            public void onFailure(Exception e) {

            }
        });

    }

    private void createForm() {
        LinearLayout lnGenelBilgiler = createCommonSub("GENEL BİLGİLER");
        lnMainView.addView(lnGenelBilgiler);
        txtKodu = createEditTextItem("Kodu");
        lnMainView.addView(txtKodu);
        txtAdi = createEditTextItem("Adı");
        lnMainView.addView(txtAdi);
        txtAdresi = createEditTextItem("Adresi");
        lnMainView.addView(txtAdresi);
        txtMevkisi = createEditTextItem("Mevkisi");
        lnMainView.addView(txtMevkisi);
        txtSahibi = createEditTextItem("Sahibi");
        lnMainView.addView(txtSahibi);
        txtIsleticisi = createEditTextItem("İşleticisi");
        lnMainView.addView(txtIsleticisi);
        ddlTipi = createSpinnerFormItem("Tipi", new String[]{"BASİT", "FONKSİYONEL", "İLERİ DÜZEY ARITMA", "PAKET ARITMA"});
        lnMainView.addView(ddlTipi);
        txtKapasitesi = createEditTextItem("Kapasitesi");
        lnMainView.addView(txtKapasitesi);
        txtTelefon = createEditTextItem("Telefon");
        lnMainView.addView(txtTelefon);
        txtEklenmeTarihi = createEditTextItem("Eklenme Tarihi");
        lnMainView.addView(txtEklenmeTarihi);
        lnCografiKonumBilgileri = createCommonSub("COĞRAFİ KONUM BİLGİLERİ");
        lnMainView.addView(lnCografiKonumBilgileri);
        txtEnlem = createEditTextItem("Enlem / X");
        lnMainView.addView(txtEnlem);
        txtBoylam = createEditTextItem("Boylam / Y");
        lnMainView.addView(txtBoylam);
        btnKoordinatGuncelle = new Button(this);
        btnKoordinatGuncelle.setText("Güncelle");
        btnKoordinatGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEnlem.setTxt(String.valueOf(getLat()));
                txtBoylam.setTxt(String.valueOf(getLong()));
            }
        });

        lnMainView.addView(btnKoordinatGuncelle);
        lnKullanilanKimyasal = createCommonSub("KULLANILAN KİMYASAL BİLGİLER");
        lnMainView.addView(lnKullanilanKimyasal);
        ddlAluminyumSulfat = createSpinnerFormItem("Alüminyum Sülfat Kullanılıyor mu?");
        lnMainView.addView(ddlAluminyumSulfat);
        ddlDemirKlorur = createSpinnerFormItem("Demir III Klorür Kullanılıyor mu?");
        lnMainView.addView(ddlDemirKlorur);
        ddlKirec = createSpinnerFormItem("Kireç Kullanılıyor mu?");
        lnMainView.addView(ddlKirec);
        ddlKlor = createSpinnerFormItem("Klor Kullanılıyor mu?");
        lnMainView.addView(ddlKlor);
        ddlPolielektrolit = createSpinnerFormItem("Polielektrolit Kullanılıyor mu?");
        lnMainView.addView(ddlPolielektrolit);
        ddlSulfirikAsit = createSpinnerFormItem("Sülfirik Asit Kullanılıyor mu?");
        lnMainView.addView(ddlSulfirikAsit);
        ddlKloraminasyon = createSpinnerFormItem("Kloraminasyon Kullanılıyor mu?");
        lnMainView.addView(ddlKloraminasyon);
        txtDiger = createEditTextItem("Diğer");
        lnMainView.addView(txtDiger);
        lnKlorlamaDurumu = createCommonSub("KLORLAMA DURUMU");
        lnMainView.addView(lnKlorlamaDurumu);
        ddlKlorlamaCihazi = createSpinnerFormItem("Klorlama Cihazı var mı?");
        lnMainView.addView(ddlKlorlamaCihazi);

        formPhotoAlbum = createPhotoAlbum();
        formPhotoAlbum.btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formPhotoAlbum.takePhoto(folderName);
            }
        });

        lnMainView.addView(formPhotoAlbum);
        btnKaydetDuzenle = new Button(this);
        btnKaydetDuzenle.setText(isOpenedForUpdate() ? "DÜZENLE" : "KAYDET");
        lnMainView.addView(btnKaydetDuzenle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        formPhotoAlbum.getPhotos(folderName);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            formPhotoAlbum.getPhotos(folderName);
        }
    }
}
