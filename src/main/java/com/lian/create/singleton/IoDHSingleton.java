package com.lian.create.singleton;

/**
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；懒汉式单例类线程安全控制烦琐，而且性能受影响；
 * 因此有了Initialization on Demand Holder (IoDH)的技术。
 * 既可以实现延迟加载，又可以保证线程安全，不影响系统性能。
 */
public class IoDHSingleton {

    private IoDHSingleton() {}
    
    // 静态内部类
    private static class HolderClass {
        private static final IoDHSingleton instance = new IoDHSingleton();
    }
    
    /*
     * 由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，
     * 第一次调用getInstance()时将加载内部类HolderClass，在该内部类中定义了一个static类型的变量instance，
     * 此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
     * 由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响。
     */
    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
    
}
