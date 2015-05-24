package com.timboict.saglikbakanligi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.timboict.saglikbakanligi.R;
import com.timboict.saglikbakanligi.model.GeneralDataModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by mustafaguven on 24.05.2015.
 */
public class ListeAdapter<T extends GeneralDataModel> extends BaseAdapter implements Filterable {

    private Context mContext;
    private List<T> mList;
    private List<T>filteredData = null;
    private LayoutInflater mInflater;
    private HeaderFilter mFilter = new HeaderFilter();

    public ListeAdapter(Context context, List<T> itemList) {
        this.mContext = context;
        this.filteredData = itemList;
        this.mList = itemList;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return filteredData.size();
    }

    @Override
    public GeneralDataModel getItem(int position) {
        return filteredData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.lblItemDesc);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(getItem(position).getListHeader());
        return convertView;
    }

    @Override
    public Filter getFilter() {
        return this.mFilter;
    }

    public static class ViewHolder {
        public TextView textView;

    }

    private class HeaderFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            String filterString = constraint.toString().toLowerCase(new Locale("tr","TR"));

            FilterResults results = new FilterResults();

            final List<T> list = mList;

            int count = list.size();
            final ArrayList<GeneralDataModel> nlist = new ArrayList<>();

            String filterableString ;

            for (int i = 0; i < count; i++) {
                filterableString = list.get(i).getListHeader();
                if (filterableString.toLowerCase(new Locale("tr","TR")).contains(filterString)) {
                    nlist.add(list.get(i));
                }
            }

            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint,FilterResults results) {
            filteredData = (List<T>) results.values;
            notifyDataSetChanged();
        }

    }

}


