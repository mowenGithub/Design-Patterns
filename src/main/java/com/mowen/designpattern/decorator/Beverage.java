package com.mowen.designpattern.decorator;

/**
 * Created by mowen on 15-11-8.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
