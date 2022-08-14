package org.chiangkai.designPartner.create;

/**
 * 单例模式 饿汉模式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    /**
     * 不允许随便创建对象
     */
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}

/**
 * 懒汉
 */
class Singleton2{
    private Singleton2(){

    }
    private final static class Hoder{
        final static Singleton2 instance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return Hoder.instance;
    }
}


