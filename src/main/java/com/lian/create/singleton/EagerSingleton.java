package com.lian.create.singleton;

/**
 * 饿汉式单例类
 * 在类被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，可以确保实例的唯一性；
 * 从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，因此要优于懒汉式单例。
 * 从资源利用效率角度来讲，饿汉式单例不及懒汉式单例，而且在系统加载时由于需要创建饿汉式单例对象，加载时间可能会比较长。
 */
public class EagerSingleton {

    /* 当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯一实例将被创建 */
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}
