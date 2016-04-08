package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 * 接受者之一  Receiver
 */
public class Light {

    void onLight() {
        System.out.println("The light is on!");
    }

    void offLight() {
        System.out.println("The light is off!");
    }
}
