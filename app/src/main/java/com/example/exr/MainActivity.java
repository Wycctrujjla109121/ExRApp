package com.example.exr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button ButtonReg;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonReg = (Button) findViewById(R.id.buttonReg);
        ButtonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.buttonReg:
                        Intent intent = new Intent(MainActivity.this, RegisterWindow.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    //Открытие активити с регистрацией.
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonReg:
            Intent intent = new Intent(this, RegisterWindow.class);
            startActivity(intent);
            break;
            default:
                break;
        }
    }
}