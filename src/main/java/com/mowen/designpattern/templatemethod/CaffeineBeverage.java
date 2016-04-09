package com.mowen.designpattern.templatemethod;

/**
 * Created by mowen on 4/9/16.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * 钩子方法，有默认实现，子类可以选择是否要覆盖
     * @return
     */
    private boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
