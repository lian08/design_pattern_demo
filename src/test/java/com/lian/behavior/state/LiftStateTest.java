package com.lian.behavior.state;

import com.lian.behavior.state.demo1.Context;
import com.lian.behavior.state.demo1.StoppingState;

public class LiftStateTest {

    public static void main(String[] args) {
        Context context = new Context();  
        context.setLiftState(new StoppingState());  
        
        context.open();  
        context.close(); 
        context.run();  
        context.stop(); 
    }
    
}
