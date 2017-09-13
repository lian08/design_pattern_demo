package com.lian.create.factory;

/**
 * 抽象工厂模式：高内聚、低耦合
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 第一条生产线，男性生产线
        IHumanFactory maleHumanFactory = new MaleHumanFactory();
        // 第二条生产线，女性生产线
        IHumanFactory femaleHumanFactory = new FemaleHumanFactory();
        
        // 生产人
        IHuman maleYellowHuman = maleHumanFactory.createYellowHuman();
        IHuman femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        
        maleYellowHuman.sex();
        maleYellowHuman.cry();
        
        femaleYellowHuman.sex();
        femaleYellowHuman.laugh();
    }
    
}
