package com.mowen.designpattern.state;

/**
 * Created by mowen on 4/9/16.
 */
public class MainTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
