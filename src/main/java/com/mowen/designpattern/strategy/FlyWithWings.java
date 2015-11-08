package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!!");
    }
}
