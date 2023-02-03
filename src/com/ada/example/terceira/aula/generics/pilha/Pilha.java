package com.ada.example.terceira.aula.generics.pilha;

public class Pilha<T> {

    private Elemento<T> elemento;

    public void add(T valor) {
        Elemento<T> e = new Elemento<>();
        e.setValor(valor);
        e.setProximoValor(elemento);
        elemento = e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Elemento<T> p = elemento;
        while (p != null) {
            sb.append(p.getValor()).append(" ");
            p = p.getProximoValor();
        }

        sb.append("]");
        return sb.toString();
    }
}
