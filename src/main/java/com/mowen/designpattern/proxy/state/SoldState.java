package com.mowen.designpattern.proxy.state;

/**
 * Created by mowen on 4/10/16.
 */
public class SoldState implements State {

    transient GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry,you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.noQuarterState);
        } else {
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
