package com.timboict.saglikbakanligi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by mustafaguven on 30.03.2015.
 */
public class ASBSActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnKaynakBilgiGirisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asbs);
        btnKaynakBilgiGirisi = (Button)findViewById(R.id.btnKaynakBilgiGirisi);
        btnKaynakBilgiGirisi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnKaynakBilgiGirisi:
                Intent i = new Intent(ASBSActivity.this, YeniKaynakActivity.class);
                startActivity(i);
                break;
        }
    }
}
