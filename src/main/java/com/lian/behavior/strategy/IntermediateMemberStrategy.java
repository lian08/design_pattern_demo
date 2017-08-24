package com.lian.behavior.strategy;

/**
 * 中级会员折扣类（具体策略角色）
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }

}
