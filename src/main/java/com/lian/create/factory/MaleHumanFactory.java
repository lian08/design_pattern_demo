package com.lian.create.factory;

public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public IHuman createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
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
