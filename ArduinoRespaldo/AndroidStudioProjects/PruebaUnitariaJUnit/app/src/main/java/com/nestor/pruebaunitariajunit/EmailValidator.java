package com.nestor.pruebaunitariajunit;

public class EmailValidator {
    public int add(int i, int i2,char Ope){
        int resultado = 0;
        switch (Ope)
        {
            case '*':
                resultado=i*i2;
                break;
            case '+':
                resultado=i+i2;
                break;
            case '-':
                resultado=i-i2;
                break;
            case '/':
                resultado=i-i2;
                break;
            default:
                break;
        }

        return resultado;
    }
}
