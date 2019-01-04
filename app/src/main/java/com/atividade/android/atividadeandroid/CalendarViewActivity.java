package com.atividade.android.atividadeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarViewActivity extends AppCompatActivity {

    //Declarar variável
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        //Recuperar os itens (variaveis declaradas)
        calendarView = findViewById(R.id.clv_calendarView);

        //Configuração do calendário
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month , int dayOfMonth) {
                String date = dayOfMonth + "/" +  (month = month + 1) + "/" + year;
                Toast.makeText(getApplicationContext(),"Data " + date, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
