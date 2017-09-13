package com.lian.create.factory;

public abstract class AbstractHumanFactory implements IHumanFactory {

    protected IHuman createHuman(HumanEnum humanEnum) {
        IHuman human = null;
        if (!"".equals(humanEnum.getValue())) {
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
        }
        
        return human;
    }

}
