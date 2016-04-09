package com.mowen.designpattern.templatemethod;

/**
 * Created by mowen on 4/9/16.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
