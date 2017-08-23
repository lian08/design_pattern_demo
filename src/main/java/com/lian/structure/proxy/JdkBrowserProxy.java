package com.lian.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理类
 * 特点：代理对象不需要实现接口，但是目标对象一定要实现接口，否则不能用动态代理。
 * 缺点：只能代理接口中的方法。如果被代理对象没有实现接口，或者想代理没在接口中定义的方法，JDK的动态代理就无能为力了，此时就需要CGLIB动态代理。
 */
public class JdkBrowserProxy implements InvocationHandler {
    
    private Browser browser;

    public JdkBrowserProxy(Browser browser) {
        this.browser = browser;
    }
    
    /**
     *  利用JDK的API动态的在内存中构建代理对象	
     */
    public Browser getProxy() {
        /*
         * classLoader是创建代理类的类加载器
         * interfaces是原对象实现的接口
         * InvocationHandler是回调方法的接口
         */
        return (Browser) Proxy.newProxyInstance(browser.getClass().getClassLoader(), browser.getClass().getInterfaces(), this);
    }

    /**
     * proxy是代理对象
     * method是执行的方法
     * args是执行方法的参数数组
     */
//    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        encrypt();
        Object retVal = method.invoke(browser, args);
        decrypt();
        return retVal;
    }
    
    /**
     * 加密
     */
    private void encrypt(){
        System.out.println("encrypt ...");
    }

    /**
     * 解密
     */
    private void decrypt(){
        System.out.println("decrypt ...");
    }

}
