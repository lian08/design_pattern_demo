package com.lian.create.singleton;

/**
 * 懒汉式单例类与线程锁定
 * 使用双重检查锁定（Double-Check Locking）实现懒汉式单例类
 * 缺点：由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低（解决方案见DoubleCheckLockingSingleton.java）
 */
public class DoubleCheckLockingSingleton {
    
    /* 持有私有静态实例，使用volatile修饰可以确保多个线程都能够正确处理 */  
    private volatile static DoubleCheckLockingSingleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private DoubleCheckLockingSingleton() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public static DoubleCheckLockingSingleton getInstance() {  
        if (instance == null) {  
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }  
        
        return instance;  
    }  
  
}
