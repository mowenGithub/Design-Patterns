package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
