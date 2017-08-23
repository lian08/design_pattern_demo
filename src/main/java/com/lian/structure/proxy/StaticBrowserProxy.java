package com.lian.structure.proxy;

/**
 * 静态代理类
 * 优点：可以做到在不修改目标对象的功能前提下，对目标功能扩展
 * 缺点：因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类，类太多；同时，一旦接口增加方法，目标对象与代理对象都要维护
 * 如何解决静态代理中的缺点呢？答案是可以使用动态代理方式（见JdkBrowserProxy.java类）
 */
public class StaticBrowserProxy implements Browser {
    
    private Browser browser;
    
    public StaticBrowserProxy(Browser browser) {
        this.browser = browser;
    }

//    @Override
    public void visitInternet() {
        encrypt();
        browser.visitInternet();
        decrypt();
    }
    
    // 加密
    private void encrypt(){
        System.out.println("encrypt ...");
    }

    // 解密
    private void decrypt(){
        System.out.println("decrypt ...");
    }

}
