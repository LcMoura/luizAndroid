package com.atividade.android.atividadeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShareItActivity extends AppCompatActivity {

    //Declarar Variáveis
    //Native
    private Button btnCompartilhar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_it);

        //Recuperar os itens
        btnCompartilhar = findViewById(R.id.btnCompartilharAqui);

        //BOTÃO DatePicker
        //Código para atribuir ação ao botão e abrir uma segunda tela referenciada
        btnCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                String shareBody; //shareBody = O Título do texto
                String shareSub; // shareSub = O detalhes do conteúdo do compartilhamento

                shareBody = "Sua descrição aqui";
                shareSub = "Seu assunto aqui";

                intent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Compartilhar usando:"));
            }
        });

    }
}
