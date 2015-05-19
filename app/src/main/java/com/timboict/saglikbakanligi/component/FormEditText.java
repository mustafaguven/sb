package com.timboict.saglikbakanligi.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.timboict.saglikbakanligi.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by mustafaguven on 19.05.2015.
 */
public class FormEditText extends LinearLayout  {

    private Context mContext;
    View view;

    @InjectView(R.id.lbl)
    TextView lbl;

    @InjectView(R.id.txt)
    EditText txt;


    public FormEditText(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        view = LayoutInflater.from(getContext()).inflate(R.layout.form_edit_text, this);
        ButterKnife.inject(this, view);
    }

    public void setLbl(String lbl) {
        this.lbl.setText(lbl);
    }

    public void setTxt(String txt) {
        this.txt.setText(txt);
    }

    public TextView getLbl() {
        return lbl;
    }

    public EditText getTxt() {
        return txt;
    }

    public String getLblValue(){
        return this.lbl.getText().toString();
    }

    public String getTxtValue(){
        return this.txt.getText().toString();
    }
}
