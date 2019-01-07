package com.atividade.android.atividadeandroid;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LigacaoActivity extends AppCompatActivity {

    //Declaração de variáveis
    private Button btnLigar;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);

        //Recuperar os itens declarados
        btnLigar = findViewById(R.id.btn_FazerLigacao);
        telefone = findViewById(R.id.edtTelefone);

        btnLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o número que o usuário digitou
                String numero = telefone.getText().toString();

                //Converter o número digitado em URI para que o sistema possa realizar a ligação
                Uri uri = Uri.parse("Tel.:" + numero);

                Intent intentPhone = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(LigacaoActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(LigacaoActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    return;
                }
                startActivity(intentPhone);
            }
        });

    }
}
