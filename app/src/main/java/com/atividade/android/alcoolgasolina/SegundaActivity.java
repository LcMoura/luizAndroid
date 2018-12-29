package com.atividade.android.alcoolgasolina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent i = getIntent();
        String nome = i.getStringExtra("nome");
        int qtdTurmas = i.getIntExtra("qtdTurmas", 0);

        Toast toast = Toast.makeText(getApplicationContext(), "Mensagem: " + nome + " Quantidade: " + qtdTurmas, Toast.LENGTH_LONG);
        toast.show();
    }
}
