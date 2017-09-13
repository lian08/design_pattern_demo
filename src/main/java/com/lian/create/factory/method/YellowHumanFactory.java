package com.lian.create.factory.method;

import com.lian.create.factory.simple.IHuman;
import com.lian.create.factory.simple.YellowHuman;

public class YellowHumanFactory implements IHumanFactory {

    @Override
    public IHuman creactHuman() {
        return new YellowHuman();
    }

}
