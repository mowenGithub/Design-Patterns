package com.mowen.designpattern.abstractfactory;

/**
 * Created by mowen on 4/8/16.
 */
public class Pizza {
    Dough dough;
    Sauce sauce;
    PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();

        System.out.println(dough.getName() + "  " + sauce.getName());
    }


}
