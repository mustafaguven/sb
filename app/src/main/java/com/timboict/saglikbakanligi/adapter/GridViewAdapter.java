package com.timboict.saglikbakanligi.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.component.ImageItem;

import java.util.ArrayList;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class GridViewAdapter extends ArrayAdapter {
    private Context context;
    private int layoutResourceId;
    private boolean isFromUrl;
    private ArrayList data = new ArrayList();

    public GridViewAdapter(Context context, int layoutResourceId, ArrayList data, boolean isFromUrl) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
        this.isFromUrl = isFromUrl;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.imageTitle = (TextView) row.findViewById(R.id.text);
            holder.image = (ImageView) row.findViewById(R.id.image);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        if(!isFromUrl) {
            ImageItem item = (ImageItem) data.get(position);
            holder.imageTitle.setText(item.getTitle());
            holder.image.setImageBitmap(item.getImage());
        } else {
            String url = (String) data.get(position);
            holder.imageTitle.setText("Fotoğraf " + (position+1));
            Picasso.with(context) //
                    .load(url) //
                    .placeholder(R.drawable.icn1) //
                    .error(R.drawable.icn2) //
                    .fit()
                    .centerCrop()//
                    .into(holder.image);
        }
        return row;
    }

    static class ViewHolder {
        TextView imageTitle;
        ImageView image;
    }
}
