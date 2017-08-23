package com.lian.structure.proxy;

public class CglibDynamicProxyTest {

    public static void main(String[] args) {
        ChromeBrowser browser = CglibBrowserProxy.getInstance().getProxy(ChromeBrowser.class);
        browser.visitInternet();
        browser.listenToMusic();
    }
    
}
