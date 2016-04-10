package com.mowen.designpattern.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by mowen on 4/10/16.
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        try {
            GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://localhost:8888/NYGM");
            GumballMonitor gumballMonitor = new GumballMonitor(gumballMachineRemote);
            gumballMonitor.report();

            gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://localhost:8888/CGGM");
            gumballMonitor = new GumballMonitor(gumballMachineRemote);
            gumballMonitor.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
