package com.nestor.gsonexposicion;

public class Leon extends Animal {

    private boolean melena;
    private String name;

    public Leon(int id, boolean vida, String[] habilidades) {
        super(id, vida, habilidades);
    }

    public Leon(int id, boolean vida, String[] habilidades, boolean melena, String name) {
        super(id, vida, habilidades);
        this.melena = melena;
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }

    public void Rugir() {}


}
