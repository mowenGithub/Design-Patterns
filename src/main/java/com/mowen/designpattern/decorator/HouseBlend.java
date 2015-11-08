package com.mowen.designpattern.decorator;

/**
 * Created by mowen on 15-11-8.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
