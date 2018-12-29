package com.atividade.android.atividadeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebViewActivity extends AppCompatActivity {

    //Declarar variável
    private Button btnWebView;
    private WebView wbvWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //Recuperar os itens da WebView
        btnWebView = findViewById(R.id.btn_WebView);
        wbvWebView = findViewById(R.id.id_WebView);

        //Configuração WebView
        //URL
        wbvWebView.setWebViewClient(new WebViewClient());
        wbvWebView.loadUrl("http://www.google.com");

        //Usando a Classe de configuração
        WebSettings webSettings = wbvWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    //Método que faz voltar para a tela inicial do site (WebView)
    @Override
    public void onBackPressed() {
        if (wbvWebView.canGoBack()){
            wbvWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
