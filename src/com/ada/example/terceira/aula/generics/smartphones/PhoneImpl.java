package com.ada.example.terceira.aula.generics.smartphones;

import com.ada.example.terceira.aula.generics.smartphones.model.Iphone;
import com.ada.example.terceira.aula.generics.smartphones.model.IphoneTypeEnum;
import com.ada.example.terceira.aula.generics.smartphones.model.SmartPhone;

public class PhoneImpl<T extends SmartPhone> implements Phone<T> {

    private SmartPhone smartPhone;

    @Override
    public void setPhone(T phone) {
        this.smartPhone = phone;
    }

    @Override
    public Double getPrice() {
        return smartPhone.getPrice();
    }

    @Override
    public IphoneTypeEnum getIphoneType() {
        if (smartPhone instanceof Iphone iphone) {
            return iphone.getIphoneTypeEnum();
        }
        return null;
    }
}
