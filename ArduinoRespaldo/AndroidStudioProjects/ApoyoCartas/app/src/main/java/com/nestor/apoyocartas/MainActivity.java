package com.nestor.apoyocartas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvCartas;
    TextView puntaje;
    private RequestQueue cartero;
    private VolleyS mVolleyS;
    public int puntos=0;
    public int num=0;
    public int[] cartas = new int[5];
    public int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCartas = findViewById(R.id.tableroCartas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rvCartas.setLayoutManager(layoutManager);

        // Establecer de manera local mi listado
//        List<Carta> ListaCartas = new ArrayList<>();
//        ListaCartas.add(new Carta(1));
//        ListaCartas.add(new Carta(10));
//        ListaCartas.add(new Carta(7));
//
//        AdaptadorCarta Cartas = new AdaptadorCarta(ListaCartas);
//        rvCartas.setAdapter(Cartas);

        mVolleyS = VolleyS.getInstance(this.getApplicationContext());
        cartero = mVolleyS.getRequestQueue();

        findViewById(R.id.btnSolicitar).setOnClickListener(this);
        findViewById(R.id.btnEnviar).setOnClickListener(this);
        findViewById(R.id.btnResultados).setOnClickListener(this);
        findViewById(R.id.btnReinicar).setOnClickListener(this);
        puntaje = findViewById(R.id.puntos);
    }

    @Override
    public void onClick(View boton) {

        switch (boton.getId()){
            case R.id.btnSolicitar:

// CODIGO PARA PROBAR DE MANERA LOCAL
                Random ra = new Random();
                num = ra.nextInt(11)+1;
                puntos += num;

                puntaje.setText(String.valueOf(puntos));

                cartas[i]=num;
                i++;
                List<Carta> ListaCartas = new ArrayList<>();
                for (int r=0; r < i; r++) {
                    ListaCartas.add(new Carta(cartas[r]));
                }
                AdaptadorCarta Cartas = new AdaptadorCarta(ListaCartas);
                rvCartas.setAdapter(Cartas);
// CODIGO PARA PROBAR DE MANERA LOCAL

//                String url = "https://www.ramiro174.com/api/numero";
//
//                JsonObjectRequest numeroJson = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        if (puntos < 21){
//                            try {
//                                num = response.getInt("numero");
//                                puntos += num;
//
//                                TextView puntaje = findViewById(R.id.puntos);
//                                puntaje.setText(String.valueOf(puntos));
//
//                                cartas[i]=num;
//                                i++;
//                                for (int r=0; r < i; r++) {
//                                    List<Carta> ListaCartas = new ArrayList<>();
//                                    ListaCartas.add(new Carta(cartas[r]));
//                                    AdaptadorCarta Cartas = new AdaptadorCarta(ListaCartas);
//                                    rvCartas.setAdapter(Cartas);
//                                }
//
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//
//                        }
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        error.printStackTrace();
//                    }
//                });
//                cartero.add(numeroJson);
                break;

            case R.id.btnEnviar:
                String urlr = "https://www.ramiro174.com/api/enviar/numero";

                JSONObject datos = new JSONObject();
                try {
                    datos.put("nombre", "Nestor Puentes");
                    datos.put("numero", puntos);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                JsonObjectRequest puntajeJson = new JsonObjectRequest(Request.Method.POST, urlr, datos, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });
                cartero.add(puntajeJson);
                Toast.makeText(getApplicationContext(), "Haz enviado tus puntos", Toast.LENGTH_LONG).show();
                puntaje.setText("0");
                num=0;
                puntos=0;

//                for (int r=0; r < i; r++){
//                    rvCartas.delete(r);
//                }
                break;
        }
    }
}