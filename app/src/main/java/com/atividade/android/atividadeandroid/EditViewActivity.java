package com.atividade.android.atividadeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditViewActivity extends AppCompatActivity {

    //Declaração das variáveis
    private Button button;
    private EditText editNome;
    private TextView displayText;

    //Primeira fase da criação do Android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view);

        //Recuperar os dados ou itens
        button = findViewById(R.id.btn_ok);
        editNome = findViewById(R.id.edtNome);
        displayText = findViewById(R.id.txvName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNome.getText().toString();
                Toast.makeText(EditViewActivity.this, "Nome: " + nome , Toast.LENGTH_SHORT).show();

                //ou imprimindo na tela via textView
                displayText.setText(nome);
            }
        });

    }
}
