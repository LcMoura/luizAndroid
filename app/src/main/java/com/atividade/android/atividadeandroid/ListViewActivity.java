package com.atividade.android.atividadeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    //Declarar variável
    private ListView ltvListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Recuperar os itens (variaveis declaradas)
        ltvListar = findViewById(R.id.ltv_ListViewProdutos);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.produtos, android.R.layout.simple_list_item_1);
        ltvListar.setAdapter(adapter);
    }
}
