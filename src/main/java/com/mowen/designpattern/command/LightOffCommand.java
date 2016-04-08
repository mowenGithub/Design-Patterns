package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 */
public class LightOffCommand extends Command {

    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    void execute() {
        light.offLight();
    }

    @Override
    void undo() {
        light.onLight();
    }
}
