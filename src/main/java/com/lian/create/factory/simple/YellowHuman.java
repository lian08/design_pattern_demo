package com.lian.create.factory.simple;

/**
 * 具体产品实现类
 */
public class YellowHuman implements IHuman {

    @Override
    public void laugh() {
        System.out.println("黄种人笑了");
    }

}
