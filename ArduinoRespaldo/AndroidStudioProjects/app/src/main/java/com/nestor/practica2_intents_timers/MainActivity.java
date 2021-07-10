package com.nestor.practica2_intents_timers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView timer;
    int comoquiera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = findViewById(R.id.timer);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long segundos) {
                timer.setText(String.valueOf(segundos/1000));
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(),Inicio.class));
                finish();
//                timer.setText("Bienvenido!");
//                final float textSize = timer.getTextSize();
            }
        }.start();
    }

    @Override
    public void onClick(View v) {
//        Intent ir = new Intent(this,)
    }

}