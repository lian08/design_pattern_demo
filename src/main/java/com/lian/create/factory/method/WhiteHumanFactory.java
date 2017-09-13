package com.lian.create.factory.method;

import com.lian.create.factory.simple.IHuman;
import com.lian.create.factory.simple.WhiteHuman;

public class WhiteHumanFactory implements IHumanFactory {

    @Override
    public IHuman creactHuman() {
        return new WhiteHuman();
    }

}
