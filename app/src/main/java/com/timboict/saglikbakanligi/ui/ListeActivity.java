package com.timboict.saglikbakanligi.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import com.timboict.saglikbakanligi.BaseActivity;
import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.adapter.ListeAdapter;
import com.timboict.saglikbakanligi.manager.ListManager;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public abstract class ListeActivity<T> extends BaseActivity {

    @InjectView(R.id.itemListView)
    public ListView itemListView;

    @InjectView(R.id.searchBar)
    EditText searchBar;

    protected ListManager<T> listManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listManager = new ListManager<>(this);
        setContentView(R.layout.list_activity);
        ButterKnife.inject(this);

        searchBar.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {

                getAdapter().getFilter().filter(cs.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
        });

    }

    protected abstract ListeAdapter getAdapter();

    protected abstract String getName();

}
