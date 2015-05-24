package com.timboict.saglikbakanligi.ui.aritma;

import android.os.Bundle;

import com.timboict.saglikbakanligi.model.ISBSAritmaModel;
import com.timboict.saglikbakanligi.model.ResponseAritma;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listManager.getAritmaList(getName(), new ResponseListener<List<ISBSAritmaModel>>() {
            @Override
            public void onSuccess(List<ISBSAritmaModel> list) {
                
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
