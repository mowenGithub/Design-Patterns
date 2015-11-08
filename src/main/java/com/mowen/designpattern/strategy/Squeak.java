package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
