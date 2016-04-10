package com.mowen.designpattern.proxy.state;

/**
 * Created by mowen on 4/9/16.
 */
public class HasQuarterState implements State {
    transient GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.soldState);
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
