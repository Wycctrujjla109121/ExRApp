package com.example.exr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class RegisterActivity extends AppCompatActivity {

    String[] gender = { "Женский", "Мужской"};
    String[] city = { "Москва", "Санкт-Петербург", "Рязань", "Сочи", "Орёл"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2second);
            Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner1city = (Spinner) findViewById(R.id.spinnerCity);
            // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gender);
        ArrayAdapter<String> adapterCity = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city);
            // Определяем разметку для использования при выборе элемента
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Применяем адаптер к элементу spinner
            spinner.setAdapter(adapter);
        spinner1city.setAdapter(adapterCity);
    }
    public void onClickAltLog(View v) {
        switch (v.getId()) {
            case R.id.buttonAltLog2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onClickAltReg2(View v) {
        switch (v.getId()) {
            case R.id.buttonAltReg:
                Intent intent = new Intent(this, RegisterWindow.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}