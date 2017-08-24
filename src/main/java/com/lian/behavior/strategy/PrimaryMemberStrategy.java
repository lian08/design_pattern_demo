package com.lian.behavior.strategy;

/**
 * 初级会员折扣类（具体策略角色）
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }

}
