package com.mowen.designpattern.command;

/**
 * Created by mowen on 4/8/16.
 */
class LightOnCommand extends Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    void execute() {
        light.onLight();
    }

    @Override
    void undo() {
        light.offLight();
    }
}
