package com.lian.behavior.state;

import com.lian.behavior.state.demo2.VoteManager;

public class VoteStateTest {

    public static void main(String[] args) {
        VoteManager context = new VoteManager();  
        for (int i=0; i<9; i++) {
            context.vote("u1", "A");
        }
    }
    
}
