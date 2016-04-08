package com.mowen.designpattern.singleton;

/**
 * Created by mowen on 4/8/16.
 * 简单的懒汉式单例模式 存在线程不安全问题
 */
public class SimpleSingleton {

    private static SimpleSingleton singletonInstance;
    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SimpleSingleton();
        }
        return singletonInstance;
    }
}
