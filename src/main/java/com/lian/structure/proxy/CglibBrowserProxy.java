package com.lian.structure.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglig动态代理类
 */
public class CglibBrowserProxy implements MethodInterceptor {

    private static CglibBrowserProxy proxy = new CglibBrowserProxy();

    private CglibBrowserProxy(){
    }

    public static CglibBrowserProxy getInstance(){
        return proxy;
    }

//    private Enhancer enhancer = new Enhancer();
//    
//    public Object getProxy(Class<?> clazz){  
//        enhancer.setSuperclass(clazz);  
//        enhancer.setCallback(this);  
//        return enhancer.create();  
//    } 
    
    public <T> T getProxy(Class<T> clazz){
        return (T) Enhancer.create(clazz, this);// 创建代理类
    }

//    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        encrypt();
        Object retVal = proxy.invokeSuper(obj, args);
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
