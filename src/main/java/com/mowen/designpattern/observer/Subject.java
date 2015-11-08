package com.mowen.designpattern.observer;

/**
 * Created by mowen on 15-11-8.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
