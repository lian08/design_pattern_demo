package com.lian.behavior.state.demo2;

/**
  * 恶意刷票类（具体状态类）
 */
public class SpiteVoteState extends VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager context) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
        String str = context.getMapVote().get(user);
        if(str != null) {
            context.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }

}
