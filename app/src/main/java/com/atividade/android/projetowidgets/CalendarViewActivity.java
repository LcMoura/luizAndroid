package com.atividade.android.projetowidgets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        CalendarView cv = (CalendarView) findViewById(R.id.idCalendar);

        cv.getDate();

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                String date = dayOfMonth+ "/" +  month + "/" + year;
                Toast.makeText(getApplicationContext(),"Data"+ date, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
