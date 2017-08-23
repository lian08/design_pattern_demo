package com.lian.create.singleton;

/**
 * 懒汉式单例类与线程锁定
 * 既解决线程安全问题又不影响系统性能
 * 缺点：会存在单例对象不唯一（解决方案见DoubleCheckLockingSingleton.java）
 */
public class ConcurrentSingleton {
    
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static ConcurrentSingleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private ConcurrentSingleton() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public static ConcurrentSingleton getInstance() {  
        if (instance == null) {  
            synchronized(ConcurrentSingleton.class) {
                instance = new ConcurrentSingleton();
            }
        }  
        
        return instance;  
    }  
  
}
