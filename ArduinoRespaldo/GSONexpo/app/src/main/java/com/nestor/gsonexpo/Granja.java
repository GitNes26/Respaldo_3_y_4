package com.nestor.gsonexpo;

import com.google.gson.annotations.SerializedName;

public class Granja {
    @SerializedName("animal")
    private  String mAnimal;
    @SerializedName("edad")
    private  int mEdad;

    public Granja(String animalito, int edadcita){
        mAnimal = animalito;
        mEdad = edadcita;
    }
}
