package com.nestor.practica2_intents_timers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static android.content.Intent.ACTION_CALL;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnLLamar;
    final  private  int IDventanita = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnLLamar = findViewById(R.id.btn_llamar);
        solicitarPermisos();
//        findViewById(R.id.btnReturn).setOnClickListener(this);

        btnLLamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int permisoLlamar = ActivityCompat.checkSelfPermission(Inicio.this, Manifest.permission.CALL_PHONE);

                if(permisoLlamar != PackageManager.PERMISSION_GRANTED){

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, IDventanita);
                        return;
                    }
                } hacerLlamada();

            }


        });

    }
    private void hacerLlamada() {
        startActivity(new Intent(ACTION_CALL,Uri.parse("tel:8715265468")));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode==IDventanita){

            if (permissions.length>=1){
                if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    hacerLlamada();
                }
            }
        }
    }

    private void solicitarPermisos() {
        int permisoStorage;
    }

    @Override
    public void onClick(View view) {
        Intent ir = new  Intent(this, MainActivity.class);
        startActivity(ir);

    }
}