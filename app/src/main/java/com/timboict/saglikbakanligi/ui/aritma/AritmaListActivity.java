package com.timboict.saglikbakanligi.ui.aritma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.timboict.saglikbakanligi.adapter.ListeAdapter;
import com.timboict.saglikbakanligi.enums.Extras;
import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.service.ResponseListener;
import com.timboict.saglikbakanligi.ui.ListeActivity;

import java.util.List;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class AritmaListActivity extends ListeActivity<List<ISBSAritmaModel>>{
    @Override
    protected String getName() {
        return "aritma";
    }

    ListeAdapter<ISBSAritmaModel> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listManager.getAritmaList(getName(), new ResponseListener<List<ISBSAritmaModel>>() {
            @Override
            public void onSuccess(List<ISBSAritmaModel> list) {
                adapter = new ListeAdapter<>(AritmaListActivity.this, list);
                itemListView.setAdapter(adapter);
                itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ISBSAritmaModel item = (ISBSAritmaModel) parent.getItemAtPosition(position);
                        startActivity(new Intent(AritmaListActivity.this, AritmaFormActivity.class)
                        .putExtra(Extras.ID, String.valueOf(item.getHeaderID())));

                    }
                });
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    @Override
    protected ListeAdapter getAdapter() {
        return adapter;
    }
}
