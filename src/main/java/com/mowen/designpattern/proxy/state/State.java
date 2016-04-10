package com.mowen.designpattern.proxy.state;

import java.io.Serializable;

/**
 * Created by mowen on 4/9/16.
 */
public interface State extends Serializable {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
}
