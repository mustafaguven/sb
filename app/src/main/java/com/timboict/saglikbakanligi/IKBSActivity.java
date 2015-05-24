package com.timboict.saglikbakanligi;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.timboict.saglikbakanligi.cache.SBData;
import com.timboict.saglikbakanligi.service.Retrofit;
import com.timboict.saglikbakanligi.ui.ListeActivity;
import com.timboict.saglikbakanligi.ui.aritma.AritmaFormActivity;
import com.timboict.saglikbakanligi.ui.aritma.AritmaListActivity;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by mustafaguven on 30.03.2015.
 */
public class IKBSActivity extends BaseActivity {

    @InjectView(R.id.lnAritma)
    LinearLayout lnAritma;

    private HashMap<Integer, String> mMenuItems = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikbs);
        ButterKnife.inject(this);
        registerForContextMenu(lnAritma);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        switch (v.getId())
        {
            case R.id.lnAritma:
                menu.add(getString(R.string.yeni_aritma_tesisi_girisi));
                menu.add(getString(R.string.listeden_aritma_tesisi_sorgulama_ve_guncelleme));
                menu.add("Haritadan Arıtma Tesisi Sorgulama ve Güncelleme");
                break;
            case R.id.isbsKaynakBilgiLL:
                menu.add("Yeni Kaynak Bilgi Girişi");
                menu.add("Listeden Kaynak Sorgulama ve Güncelleme");
                menu.add("Haritadan Kaynak Sorgulama ve Güncelleme");
                break;
            case R.id.isbsDepoBilgiLL:
                menu.add("Yeni Depo Bilgi Girişi");
                menu.add("Listeden Depo Sorgulama ve Güncelleme");
                menu.add("Haritadan Depo Sorgulama ve Güncelleme");
                break;
            case R.id.isbsNumuneLL:
                menu.add("Yeni Numune Girişi");
                menu.add("Listeden Numune Sorgulama ve Takip Numunesi Gönderme");
                break;
            case R.id.isbsIzlemeLL:
                menu.add("Yeni İzleme Noktası Girişi");
                menu.add("Listeden İzleme Noktası Sorgulama ve Güncelleme");
                menu.add("Haritadan İzleme Noktası Sorgulama ve Güncelleme");
                break;
            case R.id.isbsBakiyeKlorLL:
                menu.add("Yeni Bakiye Klor Girişi");
                menu.add("Listeden Bakiye Klor Sorgulama ve Güncelleme");
                menu.add("Haritadan Bakiye Klor Sorgulama ve Güncelleme");
                break;
            case R.id.isbsSebekeLL:
                menu.add("Yeni Şebeke Girişi");
                menu.add("Listeden Şebeke Sorgulama ve Güncelleme");
                break;
            case R.id.isbsSebekeRiskLL:
                menu.add("Yeni Şebeke Risk Noktası Girişi");
                menu.add("Listeden Şebeke Risk Noktası Sorgulama ve Güncelleme");
                break;
            case R.id.btnCikis:
                finish();
                break;
        }

    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {

        if(item.getTitle().toString().contentEquals(getString(R.string.yeni_aritma_tesisi_girisi)))
        {
            Intent i = new Intent(IKBSActivity.this, AritmaFormActivity.class);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals(getString(R.string.listeden_aritma_tesisi_sorgulama_ve_guncelleme)))
        {
            Intent i = new Intent(IKBSActivity.this, AritmaListActivity.class);
            startActivity(i);
        }

        /*if(item.getTitle().toString().contentEquals("Yeni Kaynak Bilgi Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewKaynakActivity.class);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Listeden Kaynak Sorgulama ve Güncelleme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_KAYNAK_BILGI);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Yeni Arıtma Tesisi Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewAritmaActivity.class);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Listeden Arıtma Tesisi Sorgulama ve Güncelleme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_ARITMA_BILGI);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Listeden Numune Sorgulama ve Takip Numunesi Gönderme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_NUMUNE);
            startActivity(i);
        }


        if(item.getTitle().toString().contentEquals("Listeden Depo Sorgulama ve Güncelleme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_DEPO);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Listeden Bakiye Klor Sorgulama ve Güncelleme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_BAKIYE_KLOR);
            startActivity(i);
        }


        if(item.getTitle().toString().contentEquals("Yeni Depo Bilgi Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewDepoActivity.class);
            startActivity(i);
        }


        if(item.getTitle().toString().contentEquals("Yeni Şebeke Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewSebekeActivity.class);
            startActivity(i);
        }



        if(item.getTitle().toString().contentEquals("Yeni Şebeke Risk Noktası Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewSebekeRiskActivity.class);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Listeden Şebeke Sorgulama ve Güncelleme"))
        {
            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_SEBEKE);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Yeni İzleme Noktası Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewIzlemeIslemleriActivity.class);
            startActivity(i);
        }
        if(item.getTitle().toString().contentEquals("Listeden İzleme Noktası Sorgulama ve Güncelleme"))
        {

            Intent i = new Intent(IKBSActivity.this, ListingActivity.class);
            i.putExtra("LIST_TYPE",IkbsListType.LIST_IZLEME_NOKTASI);
            startActivity(i);
        }
        if(item.getTitle().toString().contentEquals("Haritadan Arıtma Tesisi Sorgulama ve Güncelleme")){
            Intent i = new Intent(IKBSActivity.this, ISBSWebWiew.class);
            i.putExtra("MAP_TYPE","ISBS_ARITMA_MAP");
            startActivity(i);
            // finish();
        }
        if(item.getTitle().toString().contentEquals("Haritadan Kaynak Sorgulama ve Güncelleme")){
            Intent i = new Intent(IKBSActivity.this, ISBSWebWiew.class);
            i.putExtra("MAP_TYPE","ISBS_KAYNAK_MAP");
            startActivity(i);
            // finish();
        }
        if(item.getTitle().toString().contentEquals("Haritadan Depo Sorgulama ve Güncelleme")){
            Intent i = new Intent(IKBSActivity.this, ISBSWebWiew.class);
            i.putExtra("MAP_TYPE","ISBS_DEPO_MAP");
            startActivity(i);
            // finish();
        }
        if(item.getTitle().toString().contentEquals("Haritadan İzleme Noktası Sorgulama ve Güncelleme")){
            Intent i = new Intent(IKBSActivity.this, ISBSWebWiew.class);
            i.putExtra("MAP_TYPE","ISBS_IZLEME_MAP");
            startActivity(i);
            // finish();
        }

        if(item.getTitle().toString().contentEquals("Yeni Bakiye Klor Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewBakiyeKlorActivity.class);
            startActivity(i);
        }

        if(item.getTitle().toString().contentEquals("Yeni Numune Girişi"))
        {
            Intent i = new Intent(IKBSActivity.this, CreateNewNumuneActivity.class);
            startActivity(i);
        }*/

        return super.onContextItemSelected(item);
    }


    @OnClick(R.id.lnAritma)
    protected void onClicked_lnAritma(View view){
        openContextMenu(view);
    }

    @OnClick(R.id.lnCikisYap)
    protected void onClicked_lnCikisYap(View view){
        Retrofit.clear();
        SBData.setUser(null);
        startActivity(new Intent(this, LoginActivity.class));
    }


}
