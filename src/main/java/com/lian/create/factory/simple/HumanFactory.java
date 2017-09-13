package com.lian.create.factory.simple;

/**
 * 简单工厂模式，又叫静态工厂方法（static factory method）模式
 * 
 * 简单工厂模式相当于是一个工厂中有各种产品，创建在一个类中，客户无需知道具体产品的名称，只需要知道产品类所对应的参数即可。
 * 但是工厂的职责过重，而且当类型过多时不利于系统的扩展维护。
 * 
 */
public class HumanFactory {

//    public static IHuman createHuman(HumanEnum humanEnum) {
//        switch(humanEnum) {
//            case YellowHuman : 
//                return new YellowHuman();
//            case BlackHuman : 
//                return new BlackHuman();
//            case WhiteHuman : 
//                return new WhiteHuman();
//            default :
//                return null;
//        }
//    }
    
    public static IHuman createHuman(HumanEnum humanEnum) {
        IHuman human = null;
        
        try {
            human = (IHuman) Class.forName(humanEnum.getValue()).newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return human;
    }
    
}
