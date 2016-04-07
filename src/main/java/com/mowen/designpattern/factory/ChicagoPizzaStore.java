package com.mowen.designpattern.factory;

/**
 * Created by mowen on 4/7/16.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return null;
        } else {
            return null;
        }
    }
}
