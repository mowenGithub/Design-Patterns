package com.mowen.designpattern.proxy.state;

import com.mowen.designpattern.proxy.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by mowen on 4/9/16.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    String location;
    int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.location = location;
        this.count = numberGumballs;
        if(numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0) {
            count -= count;
        }
    }

    public int getCount() throws RemoteException {
        return count;
    }

    public String getLocation() throws RemoteException {
        return location;
    }

    public State getState() throws RemoteException {
        return state;
    }
}
