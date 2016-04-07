package com.mowen.designpattern.abstractfactory;

/**
 * Created by mowen on 4/8/16.
 * pizza 原料
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    //...
}
