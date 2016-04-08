package com.mowen.designpattern.singleton;

/**
 * Created by mowen on 4/8/16.
 * 虽然线程安全但效率低
 */
public class Singleton1 {

    private static Singleton1 singletonInstance;
    private Singleton1() {}

    public static synchronized Singleton1 getSingletonInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton1();
        }
        return singletonInstance;
    }
}
