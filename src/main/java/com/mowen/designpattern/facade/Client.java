package com.mowen.designpattern.facade;

/**
 * Created by mowen on 4/8/16.
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade(); // Facade(ob1, ob2, ob3);
        facade.watchMovie();
    }
}
