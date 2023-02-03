package com.ada.example.terceira.aula.generics.smartphones;

import com.ada.example.terceira.aula.generics.smartphones.model.IphoneTypeEnum;
import com.ada.example.terceira.aula.generics.smartphones.model.SmartPhone;

public interface Phone<T extends SmartPhone> {

    void setPhone(T phone);

    Double getPrice();

    IphoneTypeEnum getIphoneType();
}
