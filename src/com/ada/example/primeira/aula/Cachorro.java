package com.ada.example.primeira.aula;

import com.ada.example.primeira.aula.interfaces.AnimalAdestrado;
import com.ada.example.primeira.aula.interfaces.AnimalEstimacao;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalAdestrado {

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public void amamentar() {}

    @Override
    public void alimentar() {}

    @Override
    public void passear() {}

    @Override
    public void sentar() {}

    @Override
    public void darAPata() {}

    @Override
    public void deitar() {}
}
