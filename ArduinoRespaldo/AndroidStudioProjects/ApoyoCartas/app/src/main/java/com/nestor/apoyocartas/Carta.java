package com.nestor.apoyocartas;

public class Carta {
    private int numero;
    private int carta;

    public Carta(int numero, int carta) {
        this.numero = numero;
        this.carta = carta;
    }

    public Carta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }
}
