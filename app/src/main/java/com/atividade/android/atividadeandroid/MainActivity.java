package com.atividade.android.atividadeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declarar variável
    private Button btnListView;
    private Button btnWebView;
    private Button btnDatePicker;
    private Button btnImageView;
    private Button btnEditView;

    //Primeiro Ciclo de Vida de um app Android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar os itens (Buttons)
        btnListView  = findViewById(R.id.btn_ListView);
        btnWebView = findViewById(R.id.btn_WebView);
        btnDatePicker = findViewById(R.id.btn_DataPicker);
        btnImageView = findViewById(R.id.btn_ImageView);
        btnEditView = findViewById(R.id.btn_EditView);

        //BOTÃO ListView
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(i);
            }
        });

        //BOTÃO WebView
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WebViewActivity.class);
                startActivity(i);
            }
        });

        //BOTÃO DatePicker
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnDatePicker.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CalendarViewActivity.class);
                startActivity(i);
            }
        });

        //BOTÃO ImageView
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ImageViewActivity.class);
                startActivity(i);
            }
        });

        //BOTÃO ListView
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnEditView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EditViewActivity.class);
                startActivity(i);
            }
        });

    }
}
