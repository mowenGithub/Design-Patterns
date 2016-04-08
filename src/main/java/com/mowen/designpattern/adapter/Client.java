package com.mowen.designpattern.adapter;

/**
 * Created by mowen on 4/8/16.
 */
public class Client {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();
    }
}
