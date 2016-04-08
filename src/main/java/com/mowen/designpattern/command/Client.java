package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Light livingRoomLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        invoker.setCommand(0, lightOnCommand, lightOffCommand);
        invoker.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
        System.out.println(invoker);

        invoker.onButtonWasPushed(0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
        invoker.undoButtonWasPushed();

        invoker.onButtonWasPushed(1);
        invoker.onButtonWasPushed(1);
        invoker.offButtonWasPushed(1);
        invoker.undoButtonWasPushed();
    }
}
