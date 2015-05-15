package com.timboict.saglikbakanligi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by mustafaguven on 30.03.2015.
 */
public class YeniKaynakActivity extends ActionBarActivity implements View.OnClickListener{

    Button btnYeniKaynak, btnKaynakGuncelleme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeni_kaynak);
        btnYeniKaynak = (Button)findViewById(R.id.btnYeniKaynak);
        btnYeniKaynak.setOnClickListener(this);

        btnKaynakGuncelleme = (Button)findViewById(R.id.btnKaynakGuncelleme);
        btnKaynakGuncelleme.setOnClickListener(this);

        registerForContextMenu(btnKaynakGuncelleme);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("Haritadan Seçim Yap");
        menu.add("Listeden Seçim Yap");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle().toString().contentEquals("Listeden Seçim Yap")){
            Intent i5 = new Intent(YeniKaynakActivity.this, HaritaActivity.class);
            startActivity(i5);
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnYeniKaynak:
                Intent i = new Intent(YeniKaynakActivity.this, YeniKaynakBilgiGirisiFormActivity.class);
                startActivity(i);
                break;
            case R.id.btnKaynakGuncelleme:
                openContextMenu(btnKaynakGuncelleme);
                break;
        }
    }
}
