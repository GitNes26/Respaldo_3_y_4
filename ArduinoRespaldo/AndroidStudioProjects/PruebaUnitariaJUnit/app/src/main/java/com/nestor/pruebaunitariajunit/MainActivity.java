package com.nestor.pruebaunitariajunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText v1,v2,opera,resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1=findViewById(R.id.valor1);
        opera=findViewById(R.id.operacion);
        v2=findViewById(R.id.valor2);
        resultados=findViewById(R.id.Resultado);
    }

    public double add(View view){
        int resultado = 0;
        int i =Integer.parseInt(v1.getText().toString());
        int i2 =Integer.parseInt(v2.getText().toString());
        String operacion = opera.getText().toString();
        switch (operacion)
        {
            case "*":
                resultado = i * i2;
                break;
            case "+":
                resultado=i+i2;
                break;
            case "-":
                resultado=i-i2;
                break;
            case "/":
                resultado=i-i2;
                break;
            default:
                break;
        }

        resultados.setText(String.valueOf(resultado));
        return resultado;
    }
}