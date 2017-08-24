package com.lian.behavior.state.demo2;

/**
 * 正常投票类（具体状态类）
 */
public class RepeatVoteState extends VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager context) {
        // 正常投票，记录到投票记录中
        context.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}
