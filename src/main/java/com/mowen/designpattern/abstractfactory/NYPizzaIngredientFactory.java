package com.mowen.designpattern.abstractfactory;

/**
 * Created by mowen on 4/8/16.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new NYDough();
    }

    public Sauce createSauce() {
        return new NYSauce();
    }
}
