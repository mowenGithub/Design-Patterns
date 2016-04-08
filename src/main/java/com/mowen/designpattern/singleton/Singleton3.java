package com.mowen.designpattern.singleton;

/**
 * Created by mowen on 4/8/16.
 * 双重加锁机制 在java 5 以后的版本中使用
 */
public class Singleton3 {
    private volatile static Singleton3 singletonInstance;
    private Singleton3() {}

    public static Singleton3 getSingletonInstance() {
        if(singletonInstance == null) {
            synchronized (Singleton3.class) {
                if(singletonInstance == null) {
                    singletonInstance = new Singleton3();
                }
            }
        }
        return singletonInstance;
    }
}
