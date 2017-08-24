package com.lian.behavior.state.demo2;

/**
 * 抽象投票类（抽象状态角色）
 */
public abstract class VoteState {
    
    public abstract void vote(String user, String voteItem, VoteManager context);
    
}
