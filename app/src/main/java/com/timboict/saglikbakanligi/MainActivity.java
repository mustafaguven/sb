package com.timboict.saglikbakanligi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnHarita, btnIKBS, btnASBS, btnSSS, btnCikis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHarita = (Button) findViewById(R.id.btnHarita);      btnHarita.setOnClickListener(this);
        btnIKBS = (Button) findViewById(R.id.btnIKBS); btnIKBS.setOnClickListener(this);
        btnASBS = (Button) findViewById(R.id.btnASBS); btnASBS.setOnClickListener(this);
        btnSSS = (Button) findViewById(R.id.btnSSS); btnSSS.setOnClickListener(this);
        btnCikis = (Button) findViewById(R.id.btnCikis); btnCikis.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnHarita:
                Intent i = new Intent(MainActivity.this, HaritaActivity.class);
                startActivity(i);
                break;
            case R.id.btnIKBS:
                Intent i2 = new Intent(MainActivity.this, IKBSActivity.class);
                startActivity(i2);
                break;
            case R.id.btnASBS:
                Intent i3 = new Intent(MainActivity.this, IKBSActivity.class);
                startActivity(i3);
                break;
            case R.id.btnSSS:
                Intent i4 = new Intent(MainActivity.this, HaritaActivity.class);
                startActivity(i4);
                break;
            case R.id.btnCikis:
                Intent i5 = new Intent(MainActivity.this, HaritaActivity.class);
                startActivity(i5);
                break;
        }
    }
}
