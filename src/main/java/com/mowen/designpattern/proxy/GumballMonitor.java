package com.mowen.designpattern.proxy;

import com.mowen.designpattern.state.GumballMachine;

import java.rmi.RemoteException;

/**
 * Created by mowen on 4/10/16.
 */
public class GumballMonitor {
    GumballMachineRemote machineRemote;

    public GumballMonitor(GumballMachineRemote machineRemote) {
        this.machineRemote = machineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machineRemote.getLocation());
            System.out.println("Current inventory: " + machineRemote.getCount() + " gumballs");
            System.out.println("Current State: " + machineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
