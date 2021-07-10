package com.nestor.gsonexposicion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
/*
        Leon leon = new Leon(1,true, new String[]{"cazar","reinar"}, true);
        String json = gson.toJson(leon);
        */

/*
        String json = "{\"especie\":\"terrestre\",\"habilidades\":[\"cazar\",\"reinar\"],\"id\":1,\"nombre\":\"leon\"}";
        Leon leon = gson.fromJson(json, Leon.class);
        */

        //Coleccion de leones
        String json = "[{\"especie\":\"terrestre\",\"habilidades\":[\"cazar\",\"reinar\"],\"id\":1,\"nombre\":\"Miguel\"}," +
                "{\"especie\":\"terrestre\",\"habilidades\":[\"cazar\",\"reinar\"],\"id\":2,\"nombre\":\"Norma\"}]";

        final Type LeonType = new TypeToken<List<Leon>>(){}.getType();
        List<Leon> leones = gson.fromJson(json, LeonType);

//        Log.i("PermisosNombre", leones.get(0);
    }
}