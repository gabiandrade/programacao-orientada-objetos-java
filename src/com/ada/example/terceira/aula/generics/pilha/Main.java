package com.ada.example.terceira.aula.generics.pilha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();
        pilha.add("Roberio");
        pilha.add("Mariana");
        pilha.add("Yuri");
        System.out.println("Pilha de string: " + pilha);

        Pilha<Double> pilhaDouble = new Pilha<>();
        pilhaDouble.add(9.0);
        pilhaDouble.add(1.0);
        System.out.println("pilha de double: " + pilhaDouble);

        List<Double> lista = new ArrayList<>();
        lista.add(4.0);
        lista.add(7.9);
        System.out.println(Arrays.toString(lista.toArray()));
    }
}
