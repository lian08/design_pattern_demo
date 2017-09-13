package com.lian.create.factory.method;

import com.lian.create.factory.simple.BlackHuman;
import com.lian.create.factory.simple.IHuman;

public class BlackHumanFactory implements IHumanFactory {

    @Override
    public IHuman creactHuman() {
        return new BlackHuman();
    }

}
