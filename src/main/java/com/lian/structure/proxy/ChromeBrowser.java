package com.lian.structure.proxy;

public class ChromeBrowser implements Browser {

    @Override
    public void visitInternet() {
        System.out.println("visit YouTube");
    }
    
    public void listenToMusic(){
        System.out.println("listen to Cranberries");
    }

}
