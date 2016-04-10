package com.mowen.designpattern.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by mowen on 4/10/16.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(8888);
            GumballMachineRemote gumballMachine = new com.mowen.designpattern.proxy.state.GumballMachine("NewYork", 3);
            Naming.bind("rmi://localhost:8888/NYGM", gumballMachine);

            gumballMachine = new com.mowen.designpattern.proxy.state.GumballMachine("Chicago", 2);
            Naming.bind("rmi://localhost:8888/CGGM", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
