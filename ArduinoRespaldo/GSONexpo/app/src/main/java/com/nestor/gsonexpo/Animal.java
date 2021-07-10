package com.nestor.gsonexpo;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Animal {
    @SerializedName("id")
    //algo entendi de que nos ayuda a vincular la variable de abajo con la variable del Json
    private int ID; // declaramos las variables para almacenar nuestros valores
    @SerializedName("animal")
    private String mAnimal;
    @SerializedName("especie")
    private String mEspecie;

    private String[] habilidades;

    // Creamos nuestro constructor para ligar los datos de nuestro objeto que ingresemos con las variables de nuestro Json
    public Animal(int id, String animal, String especie, String[] habilidades) {
        ID = id;
        mAnimal = animal;
        mEspecie = especie;
        this.habilidades = habilidades;
    }
}






    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}';
    }
    */

