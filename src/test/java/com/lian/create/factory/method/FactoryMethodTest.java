package com.lian.create.factory.method;

import com.lian.create.factory.simple.IHuman;

/**
 */
public class FactoryMethodTest {

    public static void main(String[] args) { 
        IHumanFactory humanFactory = new YellowHumanFactory();
//        IHumanFactory humanFactory = new BlackHumanFactory();
//        IHumanFactory humanFactory = new WhiteHumanFactory();
        
        IHuman human = humanFactory.creactHuman();
        human.laugh();
    }
    
}
