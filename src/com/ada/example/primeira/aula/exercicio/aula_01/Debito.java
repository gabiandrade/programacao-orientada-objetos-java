package com.ada.example.primeira.aula.exercicio.aula_01;

public class Debito implements TaxaMaquininha {


    @Override
    public double getValorTaxa() {
        //0.95%
        return 0.0095;
    }
}
