package com.ada.example.terceira.aula.generics;

import com.ada.example.terceira.aula.generics.smartphones.Phone;
import com.ada.example.terceira.aula.generics.smartphones.PhoneImpl;
import com.ada.example.terceira.aula.generics.smartphones.model.Iphone;
import com.ada.example.terceira.aula.generics.smartphones.model.IphoneTypeEnum;
import com.ada.example.terceira.aula.generics.smartphones.model.Xiaomi;

public class Main {

    public static void main(String[] args) {
        exampleGenericPhones();
    }

    public static void exampleGenericPhones() {
        // SmartPhone Xiaomi
        Xiaomi xiaomiNote10 = new Xiaomi();
        xiaomiNote10.setPrice(2000.0);

        Phone<Xiaomi> xiaomi = new PhoneImpl<>();
        xiaomi.setPhone(xiaomiNote10);

        // SmartPhone Iphone
        Iphone iphonePro = new Iphone();
        iphonePro.setIphoneTypeEnum(IphoneTypeEnum.IPHONE_PRO);
        iphonePro.setPrice(12000.0);

        Phone<Iphone> iphone = new PhoneImpl<>();
        iphone.setPhone(iphonePro);

        System.out.println("Preço SmartPhone Xiaomi: " + xiaomi.getPrice());

        System.out.printf("O Preço SmartPhone %s é: %.2f", iphone.getIphoneType(), iphone.getPrice());

    }

}
