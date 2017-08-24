package com.lian.behavior.strategy;

/**
 * 高级会员折扣类（具体策略角色）
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }

}
