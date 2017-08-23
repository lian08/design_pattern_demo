package com.lian.create.singleton;

/**
 * 懒汉式单例类
 * 在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术，即需要的时候再加载实例，无须一直占用系统资源
 * 缺点：线程不安全（解决方案见ThreadSingleton.java）
 */
public class LazySingleton {
    
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static LazySingleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private LazySingleton() {  
    }  
  
    /* 静态工程方法，创建实例 */  
    public static LazySingleton getInstance() {  
        if (instance == null) {  
            instance = new LazySingleton();  
        }  
        
        return instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }
    
}
