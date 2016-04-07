package com.mowen.designpattern.abstractfactory;

/**
 * Created by mowen on 4/8/16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ChicagoDough();
    }

    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
