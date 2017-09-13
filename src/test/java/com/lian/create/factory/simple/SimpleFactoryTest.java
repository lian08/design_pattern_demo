package com.lian.create.factory.simple;

/**
 *  简单工厂模式就是由一个工厂类根据传入的参数决定创建哪一种的产品类
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        IHuman human = HumanFactory.createHuman(HumanEnum.YellowHuman);
//        Human human = HumanFactory.createHuman(HumanEnum.BlackHuman);
//        Human human = HumanFactory.createHuman(HumanEnum.WhiteHuman);
        
        if (null != human) {
            human.laugh();
        }
        
    }
    
}
