package com.mowen.designpattern.templatemethod;

/**
 * Created by mowen on 4/9/16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
