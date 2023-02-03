package com.ada.example.terceira.aula.generics.pilha;

public class Elemento<T> {

    private T valor;
    private Elemento<T> proximoValor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Elemento<T> getProximoValor() {
        return proximoValor;
    }

    public void setProximoValor(Elemento<T> proximoValor) {
        this.proximoValor = proximoValor;
    }
}
