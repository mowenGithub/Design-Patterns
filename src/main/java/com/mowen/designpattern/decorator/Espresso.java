package com.mowen.designpattern.decorator;

/**
 * Created by mowen on 15-11-8.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
