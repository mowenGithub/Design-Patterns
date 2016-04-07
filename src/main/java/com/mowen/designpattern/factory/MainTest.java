package com.mowen.designpattern.factory;

/**
 * Created by mowen on 4/7/16.
 */
public class MainTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("Cheese");
        System.out.println("Ethod ordered a " + pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("Cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
