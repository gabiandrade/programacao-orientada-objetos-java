package com.ada.example.primeira.aula.exercicio.exercio_01_class;

public class Main {
    public static void main(String[] args) {

        IphoneFactory iphoneFactory = new IphoneFactory();
        System.out.println(iphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_9).exibirDetalhes());

    }

}
