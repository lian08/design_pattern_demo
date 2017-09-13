package com.lian.create.factory.simple;

/**
 * 具体产品实现类
 */
public class BlackHuman implements IHuman {

    @Override
    public void laugh() {
        System.out.println("黑种人笑了");
    }

}
