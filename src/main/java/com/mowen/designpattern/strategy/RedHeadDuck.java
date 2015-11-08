package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("My Head is Red!!");
    }
}
