package com.lian.create.singleton;

/**
 * 懒汉式单例类与线程锁定
 * 在getInstance()方法前面增加了关键字synchronized进行线程锁，以处理多个线程同时访问的问题
 * 缺点：每次调用getInstance()时都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低（解决方案见ConcurrentSingleton.java）
 */
public class ThreadSingleton {
    
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static ThreadSingleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private ThreadSingleton() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    synchronized public static ThreadSingleton getInstance() {  
        if (instance == null) {  
            instance = new ThreadSingleton();  
        }  
        
        return instance;  
    }  
  
}
