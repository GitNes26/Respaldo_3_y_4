package com.nestor.examenu3_nestorpuentes;

public class ClaseTipoNumero {

    public String ClaseTipoNumero(int numero){
        if (numero == 0)
            return "NULO";
        else {
            if((numero%2) > 0)
                return "IMPAR";
            return "PAR";
        }
    }
}
