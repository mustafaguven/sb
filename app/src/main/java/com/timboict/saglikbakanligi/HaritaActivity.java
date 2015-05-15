package com.timboict.saglikbakanligi;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by mustafaguven on 30.03.2015.
 */
public class HaritaActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harita);

        webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("http://www.mustafaguven.com.tr");
    }
}
