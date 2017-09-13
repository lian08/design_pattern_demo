package com.lian.create.factory;

public class FemaleHumanFactory extends AbstractHumanFactory {

    @Override
    public IHuman createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() {
        return null;
    }

    @Override
    public IHuman createBlackHuman() {
        return null;
    }

}
