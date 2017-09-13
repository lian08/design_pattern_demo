package com.lian.create.factory.simple;

public enum HumanEnum {

    YellowHuman("com.lian.create.factory.simple.YellowHuman"),
    BlackHuman("com.lian.create.factory.simple.BlackHuman"),
    WhiteHuman("com.lian.create.factory.simple.WhiteHuman");
    
    private String value;

    private HumanEnum(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
}
