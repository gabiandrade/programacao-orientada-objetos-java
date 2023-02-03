package com.ada.example.primeira.aula.exercicio.aula_01;

public class Credito implements TaxaMaquininha {

    @Override
    public double getValorTaxa() {
        //0.99%
        return 0.0099;
    }
}
