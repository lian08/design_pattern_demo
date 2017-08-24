package com.lian.behavior.strategy;

/**
 * 价格类（环境角色）
 */
public class Price {
    
    // 持有一个具体的策略对象
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }
    
    public double quote(double booksPrice){
        return memberStrategy.calculatePrice(booksPrice);
    }
    
}
