package com.atividade.android.alcoolgasolina;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declarar as variáveis
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnCalcular;
    private TextView informaResultado;
    private Button btnProximo;

    //Método para armazenar o resultado ao rotacionar
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("Resultado", informaResultado.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Recuperação dos itens
    precoAlcool = findViewById(R.id.editTextPrecoAlcool);
    precoGasolina = findViewById(R.id.editTextPrecoGasolina);
    btnCalcular = findViewById(R.id.buttonCalcular);
    informaResultado = findViewById(R.id.textViewResutado);
    btnProximo = findViewById(R.id.buttonProximo);

    //Validar o armazenamento ao rotacionar a tela
    if (savedInstanceState != null){
        String melhorEscolha = savedInstanceState.getString("Resultado");
        informaResultado.setText(melhorEscolha);
    }

    btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Recuperação dos valores digitados
            String txtPrecoAlcool = precoAlcool.getText().toString();
            String txtPrecoGasolina = precoGasolina.getText().toString();

            //Conversão para números
            double valorAlcool = Double.parseDouble(txtPrecoAlcool);
            double valorGasolina = Double.parseDouble(txtPrecoGasolina);

            double resultado = valorAlcool / valorGasolina;

            //Calculando o valor
            if (resultado <= 0.7) {
                informaResultado.setText("É melhor utilizar o Álcool");
            } else {
                informaResultado.setText("É melhor utilizar a Gasolina");
            }

        }
    });

    btnProximo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
            i.putExtra("nome", "Luiz Carlos");
            i.putExtra("qtdTurmas", 3);
            startActivity(i);
        }
    });
}
}