package com.ada.example.primeira.aula;

import com.ada.example.primeira.aula.interfaces.AnimalAdestrado;

public class Gato extends Mamifero implements AnimalAdestrado {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void amamentar() {}

    @Override
    public void sentar() {}

    @Override
    public void darAPata() {}

    @Override
    public void deitar() {}
}
