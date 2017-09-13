package com.lian.create.factory.method;

import com.lian.create.factory.simple.IHuman;

/**
 * 工厂方法模式相当于在简单工厂模式的基础上增加一个抽象工厂
 */
public interface IHumanFactory {

    IHuman creactHuman();
    
}
