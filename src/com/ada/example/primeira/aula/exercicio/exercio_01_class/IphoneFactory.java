package com.ada.example.primeira.aula.exercicio.exercio_01_class;

public class IphoneFactory {

    public IphoneInterface cadastrarIphone(TypeIphoneEnum typeIphoneEnum) {
        if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_9)) {
             return new Iphone9();
        } else if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_X)){
            return new IphoneX();
        } else if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_13_MINI)) {
            return new Iphone13Mini();
        }
        return null;
    }
}
