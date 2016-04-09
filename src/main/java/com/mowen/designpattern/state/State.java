package com.mowen.designpattern.state;

/**
 * Created by mowen on 4/9/16.
 */
public interface State {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();
}
