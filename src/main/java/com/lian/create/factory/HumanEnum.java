package com.lian.create.factory;

public enum HumanEnum {

    YellowMaleHuman("com.lian.create.factory.YellowMaleHuman"),
    YellowFemaleHuman("com.lian.create.factory.YellowFemaleHuman");
    
    private String value;

    private HumanEnum(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
}
