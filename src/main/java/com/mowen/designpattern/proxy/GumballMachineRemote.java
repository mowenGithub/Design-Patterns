package com.mowen.designpattern.proxy;

import com.mowen.designpattern.proxy.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by mowen on 4/10/16.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
