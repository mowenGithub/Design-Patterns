package com.mowen.designpattern.adapter;

/**
 * Created by mowen on 4/8/16.
 */
public class WildTurkey implements Turkey {


    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
