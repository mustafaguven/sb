package com.timboict.saglikbakanligi.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.timboict.saglikbakanligi.R;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemSelected;

/**
 * Created by mustafaguven on 19.05.2015.
 */
public class FormSpinner extends LinearLayout  {

    private Context mContext;
    private View view;

    @InjectView(R.id.lbl)
    TextView lbl;

    @InjectView(R.id.ddl)
    Spinner ddl;

    public OnItemSelectedListener getOnItemSelected() {
        return onItemSelected;
    }

    public void setOnItemSelected(OnItemSelectedListener onItemSelected) {
        this.onItemSelected = onItemSelected;
    }

    private OnItemSelectedListener onItemSelected;

    public interface OnItemSelectedListener{
        void onItemSelectedListener(int position, String value);
    }

    public FormSpinner(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        view = LayoutInflater.from(getContext()).inflate(R.layout.form_spinner, this);
        ButterKnife.inject(this, view);
    }

    public void setLbl(String lbl) {
        this.lbl.setText(lbl);
    }

    public void setDdl(String[] source) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_item, source);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ddl.setAdapter(adapter);
        ddl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (getOnItemSelected() != null) {
                    getOnItemSelected().onItemSelectedListener(position, parent.getItemAtPosition(position).toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setSelectionByString(String txt){
        ArrayAdapter<String> adapter = (ArrayAdapter<String>) ddl.getAdapter();
        ddl.setSelection(adapter.getPosition(txt));
    }

    public void setSelectionByPosition(int position){
        ddl.setSelection(position);
    }

    public void setSelectionByPosition(String position){
        if(TextUtils.isDigitsOnly(position)){
            setSelectionByPosition(Integer.parseInt(position)+1); //+1 yapıyoruz cunku serverdan "seçiniz" dahil olmadan geliyor, client tarafında seçiniz ekleniyor
        }
    }



    public TextView getLbl() {
        return lbl;
    }

    public String getLblValue(){
        return this.lbl.getText().toString();
    }

    public String getDdlValue(){
        return (String) this.ddl.getSelectedItem();
    }
}
