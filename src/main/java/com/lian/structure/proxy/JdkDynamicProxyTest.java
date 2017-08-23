package com.lian.structure.proxy;

public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        Browser target = new ChromeBrowser();
        Browser browser = new JdkBrowserProxy(target).getProxy();
        browser.visitInternet();
    }
    
}
