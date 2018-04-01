package com.gyx.concurrency.example.singleton;

import com.gyx.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
@ThreadSafe
public class SingletonExample6 {

    // 私有构造函数
    private SingletonExample6() {

    }
    //这里的错误在于静态方法块在  对象定义之前了
    static {
        instance = new SingletonExample6();
    }

    // 单例对象
    private static SingletonExample6 instance = null;



    // 静态的工厂方法
    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}


