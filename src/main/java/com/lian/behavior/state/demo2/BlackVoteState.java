package com.lian.behavior.state.demo2;

/**
  * 黑名单类（具体状态类）
 */
public class BlackVoteState extends VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager context) {
        // 记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}
