package com.mowen.designpattern.singleton;

/**
 * Created by mowen on 4/8/16.
 * 饿汉式的单例虽然线程安全，但在有时可能不会初始化单例的情况下可能也不是最优
 */
public class Singleton2 {

    private static Singleton2 singletonInstance = new Singleton2();
    private Singleton2() {}

    public static Singleton2 getSingletonInstance() {
        return singletonInstance;
    }
}
