package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 * 吊扇
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("CeilingFan High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("CeilingFan Medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("CeilingFan Low");
    }

    public void off() {
        speed = OFF;
        System.out.println("CeilingFan Off");
    }

    public int getSpeed() {
        return speed;
    }

}
