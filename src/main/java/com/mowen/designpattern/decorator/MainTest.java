package com.mowen.designpattern.decorator;

/**
 * Created by mowen on 15-11-8.
 */
public class MainTest {
    public static void main(String[] args) {
        Beverage beverage1 = new Whip(new Mocha(new HouseBlend()));
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new Espresso())));
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
    }
}
