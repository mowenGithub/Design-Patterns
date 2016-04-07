package com.mowen.designpattern.factory;

/**
 * Created by mowen on 4/7/16.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return null;
        } else {
            return null;
        }
    }
}
