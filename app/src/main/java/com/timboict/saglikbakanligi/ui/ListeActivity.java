package com.timboict.saglikbakanligi.ui;

import android.os.Bundle;
import android.widget.ListView;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.manager.ListManager;
import com.timboict.saglikbakanligi.service.ResponseListener;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public abstract class ListeActivity<T> extends BaseActivity {

    @InjectView(R.id.itemListView)
    ListView itemListView;

    protected ListManager<T> listManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listManager = new ListManager<>(this);
        setContentView(R.layout.list_activity);
        ButterKnife.inject(this);


    }

/*    protected void fillList(T model){
        int a = 0;
        //itemListView.setAdapter(new );
    }*/

    protected abstract String getName();


}
