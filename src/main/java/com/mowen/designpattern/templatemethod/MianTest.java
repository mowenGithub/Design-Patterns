package com.mowen.designpattern.templatemethod;

/**
 * Created by mowen on 4/9/16.
 */
public class MianTest {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
