package com.mowen.designpattern.state;

/**
 * Created by mowen on 4/9/16.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned,but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
