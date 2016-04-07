package com.mowen.designpattern.abstractfactory;

/**
 * Created by mowen on 4/8/16.
 */
public class MainTest {

    public static void main(String[] args) {

        Pizza nyPizza = new Pizza(new NYPizzaIngredientFactory());
        nyPizza.prepare();

        Pizza chicagoPizza = new Pizza(new ChicagoPizzaIngredientFactory());
        chicagoPizza.prepare();
    }
}
