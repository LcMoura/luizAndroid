package com.atividade.android.projetowidgets;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        WebView web = (WebView) findViewById(R.id.idWeb);

        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        web.loadUrl("https://www.google.com.br");

    }
}
