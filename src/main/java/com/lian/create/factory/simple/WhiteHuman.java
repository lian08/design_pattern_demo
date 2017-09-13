package com.lian.create.factory.simple;

/**
 * 具体产品实现类
 */
public class WhiteHuman implements IHuman {

    @Override
    public void laugh() {
        System.out.println("白种人笑了");
    }

}
