package com.lian.structure.proxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        // 目标对象
        Browser browser = new ChromeBrowser();
        // 代理对象，把目标对象传给代理对象，建立代理关系
        StaticBrowserProxy chromeBrowserProxy = new StaticBrowserProxy(browser);
        // 执行的是代理的方法
        chromeBrowserProxy.visitInternet();
    }
    
}
