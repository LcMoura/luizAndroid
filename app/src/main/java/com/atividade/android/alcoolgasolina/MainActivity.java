package com.atividade.android.alcoolgasolina;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Recuperação dos itens
    precoAlcool = findViewById(R.id.editTextPrecoAlcool);
    precoGasolina = findViewById(R.id.editTextPrecoGasolina);
    btnCalcular = findViewById(R.id.buttonCalcular);
    informaResultado = findViewById(R.id.textViewResutado);

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

    }
}
