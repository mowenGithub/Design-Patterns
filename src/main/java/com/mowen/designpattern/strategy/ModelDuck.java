package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck!!");
    }
}
