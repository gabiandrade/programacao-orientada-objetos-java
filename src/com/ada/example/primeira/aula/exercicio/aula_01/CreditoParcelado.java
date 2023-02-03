package com.ada.example.primeira.aula.exercicio.aula_01;

public class CreditoParcelado implements TaxaMaquininha {

    @Override
    public double getValorTaxa() {
        //9.99%
        return 0.0999;
    }
}
