package com.mowen.designpattern.strategy;

/**
 * Created by mowen on 15-11-8.
 */
public class MainTest {
    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
