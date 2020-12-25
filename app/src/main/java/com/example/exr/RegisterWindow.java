package com.example.exr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterWindow extends AppCompatActivity implements View.OnClickListener {

    Button ButtonReg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_window);

        ButtonReg2 = (Button) findViewById(R.id.buttonReg2);
        ButtonReg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonReg2:
                        Intent intent = new Intent(RegisterWindow.this, RegisterActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    //Открытие активити с продолжением регистрации.
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonReg2:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void onClickAltLog(View v) {
        switch (v.getId()) {
            case R.id.buttonAltLog:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}