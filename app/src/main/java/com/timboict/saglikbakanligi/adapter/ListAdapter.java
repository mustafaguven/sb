package com.timboict.saglikbakanligi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class ListAdapter<T> extends BaseAdapter {

    private Context mContext;
    private List<T> mList;

    public ListAdapter(Context context, List<T> itemList) {
        this.mContext = context;
        this.mList = itemList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
